package org.jap.service;

import java.util.List;

import org.jap.beans.Account;
import org.jap.beans.Loan;

import org.jap.dao.DaoImpl;
import org.jap.dao.IDao;


public class ServiceImpl implements IService{
	
	IDao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}
	
	@Override
	public boolean validateId(String id) {
		String regexId = "^[0-9]{7}[A-Za-z]{4}$";
		return id.matches(regexId);
	}

	@Override
	public boolean validateName(String name) {
		String regexName = "^[A-Z]{1}[a-z]{2,30}$";
		return name.matches(regexName);
	}

	@Override
	public void createAccount(Account acc) {
		// TODO Auto-generated method stub
		
		dao.createAccount(acc);
		
	}

	@Override
	public void createAccountWithLoan(Loan loan) {
		// TODO Auto-generated method stub
		
		dao.createAccountWithLoan(loan);
		
	}

	@Override
	public Account getAccDetails(String accId) {
		// TODO Auto-generated method stub
		return dao.getAccDetails(accId);
	}

	@Override
	public Loan getLoanDetails(String accId) {
		// TODO Auto-generated method stub
		return dao.getLoanDetails(accId);
	}

	@Override
	public double depositAmount(String accId, double amt) {
		// TODO Auto-generated method stub
		return dao.depositAmount(accId, amt);
	}

	@Override
	public double withdrawAmount(String accId, double amt) {
		// TODO Auto-generated method stub
		return dao.withdrawAmount(accId, amt);
	}

	@Override
	public double payLoan(String accId,double amt) {
		// TODO Auto-generated method stub
		
		return dao.payLoan(accId, amt);
	}

	@Override
	public double getLoan(String loanId, double a) {
		// TODO Auto-generated method stub
		
		return dao.getLoan(loanId, a);
	}

	

}
