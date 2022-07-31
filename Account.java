package com.Oops.Program_11thDayAssignm;

public class Account {
	String actHoldName;
	int balanceAmt;
	int debitAmt;


	public Account(String name, int balance) {

		this.actHoldName=name;
		this.balanceAmt=balance;

	}
	public void debit(int debit) {
		this.debitAmt=debit;
		if (balanceAmt < debitAmt) {
			System.out.println("Debit Amount Exceeded Account Balance  ! ");
		}
		else {
			int balanc=balanceAmt-debitAmt;
			balanceAmt=balanc;
			System.out.println("The Remaining Balance is "+ balanceAmt);
		}
	}
	public static void main(String[] args) {
		Account obj=new Account("Ashutosh",50000);
		obj.debit(100000);
	}

}
