package service;

import java.util.Set;

import domain.Account;

public interface IAccountService {
	 Account createAccount(Account acct);
	    Set<Account> findCustomersByType(String acctType);
	    Set<Account> findJointAccountCustomers();
	    double findAccountBalance(String acctNumber);
	    String processFundTransfer(String fromAcct, String toAcct, double amount);
	    Set<Account> findAllCustomers();
	    public String generateAccountNumber(String acctName);

}
