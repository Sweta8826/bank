package dao;

import java.util.Set;

import domain.Account;

public interface IAccountDao {

	Account create(Account acct);
	Set<Account> readCustomersByType(String acctType);
	Set<Account> readCustomersByOwners(String acctType);
	Set<Account> readAllCustomers();
	Account updateCustomer(String accNum);
	Set<Account> readJointAccountCustomers();
	double getAccountBalance(String acctNo);
	String fundTransfer(String fromAcct, String toAcct, double amount );
}
