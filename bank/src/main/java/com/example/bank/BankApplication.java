package com.example.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import domain.Account;

@SpringBootApplication
@ComponentScan(value= {"domain","Account"})
public class BankApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BankApplication.class, args);
		Account a=context.getBean(Account.class);
		a.show();
		
	}

}
