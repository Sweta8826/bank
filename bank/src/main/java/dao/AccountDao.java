package dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import domain.Account;

public class AccountDao implements IAccountDao{
	
	static Map<String, Account> customers;

    public AccountDao(){

        customers = new HashMap<String, Account>();
    }
@Override
    public Account create(Account acct){
        if(!customers.containsKey(acct.getAccountNumber()))
            customers.put(acct.getAccountNumber(),acct);
        return acct;
    }
@Override
    public Set<Account> readCustomersByType(String acctType){

        return null;
    }
@Override
    public Set<Account> readCustomersByOwners(String acctType){

        return null;
    }
@Override
    public Set<Account> readAllCustomers(){
        Set<Account> set= new HashSet<Account>();
        for(Map.Entry<String,Account> customer : customers.entrySet())
            set.add(customer.getValue());
        return set;
    }
@Override
    public Account updateCustomer(String accNum){

        return null;

    }
@Override
    public Set<Account> readJointAccountCustomers(){

        return null;

    }
@Override
    public double getAccountBalance(String acctNo){
        return 0d;
    }
@Override
    public String fundTransfer(String fromAcct, String toAcct, double amount )
    {
        return  null;
    }

      public int getSize()
      {
          return customers.size();
      }

}
