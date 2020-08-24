package org.jap.service;

import java.util.List;

import org.jap.beans.Account;
import org.jap.beans.Loan;





public interface IService {
	
	public boolean validateId(String id);
	public boolean validateName(String name);
	
	public void createAccount(Account acc);
	public void createAccountWithLoan(Loan loan);
	
	public Account getAccDetails(String accId);
	public Loan getLoanDetails(String accId);
	
	public double depositAmount(String accId,double amt);
	public double withdrawAmount(String accId,double amt);
	
	public double payLoan(String accId,double amt);
	public double getLoan(String loan,double a);
	
	
}
