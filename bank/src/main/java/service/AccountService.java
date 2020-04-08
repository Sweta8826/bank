package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import dao.AccountDao;
import domain.Account;

public class AccountService implements IAccountService{
	@Autowired
	AccountDao dao;
	
    public AccountService(){

        dao = new AccountDao();
    }

    public Account createAccount(Account acct) {
        Account act = null;
        if(acct.getBalance()>=500)
            act = dao.create(acct);
        return act;
    }

    public Set<Account> findCustomersByType(String acctType) {

        return dao.readCustomersByType(acctType);
    }

    public Set<Account> findJointAccountCustomers() {

        return dao.readJointAccountCustomers();
    }

    public double findAccountBalance(String acctNumber) {

        return dao.getAccountBalance(acctNumber);
    }

    public String processFundTransfer(String fromAcct, String toAcct, double amount) {
        return dao.fundTransfer( fromAcct,  toAcct,  amount);
    }

    public Set<Account> findAllCustomers() {

        return dao.readAllCustomers();
    }

    public String generateAccountNumber(String acctName) {
        int seq=dao.getSize()+1;
        String accountNumber = "";
        accountNumber += acctName.substring(0,2);
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMMYYYY");
        String date = sdf.format(new Date());
        accountNumber += date + seq;
        return accountNumber.toUpperCase();
    }
}
