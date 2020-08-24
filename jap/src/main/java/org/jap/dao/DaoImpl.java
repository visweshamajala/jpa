package org.jap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.jap.beans.Account;
import org.jap.beans.Loan;
//import org.jap.beans.Transaction;



public class DaoImpl implements IDao{
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa-Demo");
	private static EntityManager em = emf.createEntityManager();

	@Override
	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		
	}

	@Override
	public void createAccountWithLoan(Loan loan) {
		// TODO Auto-generated method stub
		
		em.getTransaction().begin();
		em.persist(loan);
		em.getTransaction().commit();
		
	}

	@Override
	public Account getAccDetails(String accountId) {
		// TODO Auto-generated method stub
		
		return em.find(Account.class, accountId);
	}

	@Override
	public Loan getLoanDetails(String accountId) {
		// TODO Auto-generated method stub
		
		return em.find(Loan.class, accountId);
	}

	@Override
	public double depositAmount(String accountId, double amountt) {
		// TODO Auto-generated method stub
		
		Account a = em.find(Account.class, accountId);
		
		if(a!=null) {
		System.out.println("before update : "+a.getDepositAmount());
		
		double dep = a.getDepositAmount()+amountt;
		em.getTransaction().begin();
		a.setDepositAmount(a.getDepositAmount()+amountt);
		em.getTransaction().commit();

		return dep;
		}
		else {
			System.out.println("Invalid account no.!!!");
			return 0;
		}
	}

	@Override
	public double withdrawAmount(String accountId, double amount) {
		// TODO Auto-generated method stub		
		Account a = em.find(Account.class, accountId);
		
		if(a!=null) {
		System.out.println("before update : "+a.getDepositAmount());
		
		em.getTransaction().begin();
		double a1 = a.getDepositAmount()-amount;
		a.setDepositAmount(a.getDepositAmount()-amount);
		em.getTransaction().commit();

		
		return a1;
		}
		else {
			System.out.println("Invalid account no.!!!");
			return 0;
		}
	}

	@Override
	public double payLoan(String accountId,double amount) {
		// TODO Auto-generated method stub
		
		double newAmt = 0;
		Loan loan = em.find(Loan.class, accountId);
		
		if(loan!=null) {
		
		em.getTransaction().begin();
		newAmt = loan.getLoanAmt()-amount;
		loan.setLoanAmt(loan.getLoanAmt()-amount);
		em.getTransaction().commit();		

		return newAmt;
		}
		else {
			System.out.println("enter proper id ");
			return newAmt;
		}
		
	}

	@Override
	public double getLoan(String loanId, double amt) {
		// TODO Auto-generated method stub
		
		double newAmt = 0;
		Loan loan = em.find(Loan.class, loanId);
		
		if(loan!=null) {
			em.getTransaction().begin();
			newAmt = loan.getLoanAmt()+amt;
			loan.setLoanAmt(loan.getLoanAmt()+amt);
			em.getTransaction().commit();			
//			
			return newAmt;
		}else {
			System.out.println("enter loan id properly");
			return newAmt;
		}
		
	}

	
	

}
