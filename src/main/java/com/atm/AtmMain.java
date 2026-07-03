package com.atm;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		AtmHiding atm = new AtmImplementation();
		Scanner scanner  = new Scanner(System.in);
		// menu driven program
		// infinite loop
		while(true)
		{
			System.out.println("WELCOME TO  ATM PROJECT ");
			System.out.println("1.CREATE AN ACCOUNT\n2.DEPOSIT\n3.WITHDRAW\n4.CHECKBALANCE\n5."
					+ "DISPLAY ACCOUNT DETAILS\n6.UPDATIONS\n7.TRANSFER AMOUNT\n8. EXIT");
			
			System.out.println("CHOOSE AN OPTION:  ");
			int choice =scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				atm.createAccount();
				break;
				
			case 2:
				atm.depositMoney();
				break;
				
			case 3:
				atm.withdrawAmount();
				break;
				
			case 4:
				atm.checkBalance();
				break;
			case 5:
				atm.displayDetails();
				break;
			case 6:
				atm.updateAccount();
				break;
			case 7:
				atm.transferAmount();
				break;
			case 8 :
				
				System.out.println("THANK YOU");
				System.exit(choice);
			default:
				try {
					throw new InvalidDataException("Enter valid option");
					}
					catch(InvalidDataException ie)
					{
						ie.printStackTrace();
					}

				
			}
			
			
			
		}
		

	}

}
