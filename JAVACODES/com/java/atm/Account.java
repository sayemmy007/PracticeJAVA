package com.java.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	private int customerNumber;
	private int pinNumber;
	private double CheckingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	
    public int setCustomerNumber(int customerNumeber) {
		this.customerNumber = customerNumeber;
		return customerNumeber;
		}
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return CheckingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	//two business logic : for widthdraw
	public double calccheckingWithdraw(double amount) {
		CheckingBalance = (CheckingBalance - amount);
		return CheckingBalance;
	}
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;                                 
	}
	
	//two business logic : for depositing 
	public double calccheckingDeposit(double amount) {
		CheckingBalance = (CheckingBalance + amount);
		return CheckingBalance;
	}
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	//  getter method,option 2 in menu
	public void getcheckingWithdrawInput() {
		System.out.print("checking Account Balance:"+moneyFormat.format(CheckingBalance));
		System.out.println("Amount you want to withdraw from checking account:");
		double amount = input.nextDouble();
		
		if((CheckingBalance - amount) >= 0) {
			calccheckingWithdraw(amount);
			System.out.println("New checking Account Balance:"+moneyFormat.format(CheckingBalance));
		} else {
			System.out.println("Balance cannot be Negative"+"\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance:"+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving account:");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance:"+moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be Negative"+"\n");
		}
	}
	// option 3 in menu
	public void getcheckingDepositInput() {
		System.out.println("checking Account Balance:"+moneyFormat.format(CheckingBalance));
		System.out.println("Amount you want to Deposit from checking account:");
		double amount = input.nextDouble();
		
		if((CheckingBalance + amount) >= 0) {
			calccheckingDeposit(amount);
			System.out.println("New checking Account Balance:"+moneyFormat.format(CheckingBalance));
		} else {
			System.out.println("Balance cannot be Negative"+"\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance:"+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit from saving account:");
		double amount = input.nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New saving Account Balance:"+moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be Negative"+"\n");
		}
	}
	
	
}
