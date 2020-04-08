package domain;

import java.util.Date;
import java.util.Set;

import org.springframework.stereotype.Component;
@Component

public class Account {
	double balance;
	String name;
    String accountType;
    Set<String> accountOwners;
    String accountNumber;  // Use first 2 letters of firstName + Acct. OpeningDate + SequenceNumber	// AV7OCT20191
    boolean isActive;
    Date joiningDate;
    public Account(double balance, String name, String accountType, Set<String> accountOwners, String accountNumber,
			boolean isActive, Date joiningDate) {
		super();
		this.balance = balance;
		this.name = name;
		this.accountType = accountType;
		this.accountOwners = accountOwners;
		this.accountNumber = accountNumber;
		this.isActive = isActive;
		this.joiningDate = joiningDate;
		
	}
    
	public Account() {
		super();
		
	}
	public void show() {
		System.out.println("Account Created");}
	

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Set<String> getAccountOwners() {
		return accountOwners;
	}
	public void setAccountOwners(Set<String> accountOwners) {
		this.accountOwners = accountOwners;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	


}
