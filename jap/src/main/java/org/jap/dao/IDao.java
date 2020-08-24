package org.jap.dao;

import java.util.List;

import org.jap.beans.Account;
import org.jap.beans.Loan;
//import org.jap.beans.Transaction;


public interface IDao {
	
	public void createAccount(Account account);
	public void createAccountWithLoan(Loan loan);
	
	public Account getAccDetails(String accountId);
	public Loan getLoanDetails(String accountId);
	
	public double depositAmount(String accountId,double amountt);
	public double withdrawAmount(String accountId,double amount);
	
	public double payLoan(String accountId,double amount);
	public double getLoan(String loanId,double amount);
	
	
}
