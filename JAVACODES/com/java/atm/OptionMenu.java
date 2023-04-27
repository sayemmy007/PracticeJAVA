package com.java.atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	// Login method
	public void getLogin() throws IOException{
		int x = 1;
		do {
			try {
				 data.put(123, 321); // customer, pin number
				 data.put(456, 654);
				 
				 System.out.println("Welcome to the ATM project");
				 System.out.println("Enter your customer number");
				 setCustomerNumber(menuInput.nextInt());
				 System.out.println("Enter your Pin Number");
				 setPinNumber(menuInput.nextInt());
			}catch (Exception e) {
				System.out.println("\n" +"Invalid character(s). Only Numbers."+"\n");
				x = 2;
			}
			
			int cn = getCustomerNumber();
		    int pn = getPinNumber();
			if(data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			}else
			   System.out.println("\n" +"Wrong customer number or Pin number"+"\n");	
		}while(x == 1);
	}

	// Account type  method
    public void getAccountType() {
    	   System.out.println("Select the account you want to access:");
    	   System.out.println("Type 1 - Checking account");
    	   System.out.println("Type 2 - Saving account");
    	   System.out.println("Type 3 - Exit");
    	   
    	   int selection = menuInput.nextInt();
    	   
    	   switch (selection) {
    		   case 1:
    			   getChecking();
    			   break;
    		   case 2:
    			   getSaving();
    			   break;
    		   case 3:
    			   System.out.println("Thank you for using this Atm, by \n");
    			   break;
    		   default:
    			   System.out.println("\n"+"Invalid choice"+"\n");	   
    	   } 
       }
   
     // Checking Account method
    public void getChecking() {

       System.out.println("Checking Account:");
 	   System.out.println("Type 1 - View Balance");
 	   System.out.println("Type 2 - Withdraw Funds");
 	   System.out.println("Type 3 - Deposit FUnds");
 	   System.out.println("Type 4 - Exit");
 	   System.out.println("Choice: ");
 	   
 	   int selection = menuInput.nextInt();
 	   
 	  switch (selection) {
 	  case 1:
 		   System.out.println("Checking Account balance:"+moneyFormat.format(getCheckingBalance()));
		   getAccountType();
		   break;
	   case 2:
		   getcheckingWithdrawInput();
		   getAccountType();
		   break;
	   case 3:
		   getcheckingDepositInput();
		   getAccountType();
	   case 4:
		   System.out.println("Thank you for using this Atm, by \n");
		   break;
	   default:
		   System.out.println("\n"+"Invalid choice"+"\n");
 	   }
  }
 
     // Saving Account method 
    public void getSaving() {
       System.out.println("Checking Account:");
  	   System.out.println("Type 1 - View Balance");
  	   System.out.println("Type 2 - Withdraw Funds");
  	   System.out.println("Type 3 - Deposit FUnds");
  	   System.out.println("Type 4 - Exit");
  	   System.out.println("Choice");
  	   
  	   
  	   int selection = menuInput.nextInt();
  	   switch(selection){
  		   case 1:
  			   System.out.println("Saving Account Balance:"+moneyFormat.format(getSavingBalance()));
  			   getAccountType();
  			   break;
  		   case 2:
  			   getSavingWithdrawInput();
  			   getAccountType();
  			   break;
  		   case 3:
                getSavingDepositInput();
                getAccountType();
  			   break;
  		  case 4:
 			   System.out.println("Thank you for using this Atm, by \n");
 			   break;
  		   default:
  			   System.out.println("\n"+"Invalid choice"+"\n");
  			   getChecking();
    	
    	}
    }
}
      
