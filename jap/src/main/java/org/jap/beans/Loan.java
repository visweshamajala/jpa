package org.jap.beans;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Loan extends Account{
	
	private String loanId;
	private double loanAmt;
	
	private String loanType;
	
	
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public Loan(String acc_Id, String accHolderName, double depositAmount, Address address, String loanId, double loanAmt,
			String loanType) {
		super(acc_Id, accHolderName, depositAmount, address);
		this.loanId = loanId;
		this.loanAmt = loanAmt;
		this.loanType = loanType;
	}
	public Loan() {
		
	}
	
	

}
