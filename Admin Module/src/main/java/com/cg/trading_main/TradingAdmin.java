/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */
package com.cg.trading_main;

import java.util.Scanner;

import com.cg.trading_exception.InvalidChoiceException;
import com.cg.trading_model.CompanyManager;
import com.cg.trading_model.Investor;
import com.cg.trading_service.TradingAdminServiceImpl;

public class TradingAdmin {

	static Scanner sc = new Scanner(System.in);

	/**
	 * Common Menu for all users
	 */
	public static void userMenu() {
		System.out.println("1. Add User");
		System.out.println("2. Delete User");
		System.out.println("3. Update User");
		System.out.println("Enter your choice");
	}

	/**
	 * This method is implemented for setting values for company manager.
	 * 
	 * @return companyManager
	 */
	public static CompanyManager setCompanyManagerValues() {
		CompanyManager companyManager = new CompanyManager();
		System.out.println("Enter the datails:");
		companyManager.setCompanyManagerId(sc.nextInt());
		companyManager.setCompanyManagerName(sc.next());
		companyManager.setCompanyManagerEmailId(sc.next());
		companyManager.setCompanyManagerPhone(sc.next());
		return companyManager;
	}

	/**
	 * This method is implemented for updating values of company manager.
	 * 
	 * @return companyManager1
	 */
	public static CompanyManager updateCompanyMangerValues(int companyManagerId1) {
		CompanyManager companyManager1 = new CompanyManager();
		System.out.println("Enter the datails:");
		companyManager1.setCompanyManagerId(companyManagerId1);
		companyManager1.setCompanyManagerName(sc.next());
		companyManager1.setCompanyManagerEmailId(sc.next());
		companyManager1.setCompanyManagerPhone(sc.next());
		return companyManager1;
	}

	/**
	 * This method is implemented for setting values for investor.
	 * 
	 * @return investor
	 */
	public static Investor addInvestorValues() {
		Investor investor = new Investor();
		System.out.println("Enter the datails:");
		investor.setInvestorId(sc.nextInt());
		investor.setInvestorName(sc.next());
		investor.setInvestorPanNum(sc.next());
		investor.setInvestorEmailId(sc.next());
		investor.setInvestorPhone(sc.next());
		investor.setNoOfStocks(0);
		investor.setInvestorsInvestment(0);
		return investor;
	}

	/**
	 * This method is implemented for updating values of investor.
	 * 
	 * @return investor1
	 */
	public static Investor updateInvestorValues(int id) {
		Investor investor1 = new Investor();
		System.out.println("Enter the datails:");
		investor1.setInvestorId(id);
		investor1.setInvestorName(sc.next());
		investor1.setInvestorPanNum(sc.next());
		investor1.setInvestorEmailId(sc.next());
		investor1.setInvestorPhone(sc.next());
		investor1.setNoOfStocks(sc.nextInt());
		investor1.setInvestorsInvestment(sc.nextInt());
		return investor1;
	}

	public static void main(String[] args) {

		System.out.println("-----------Trading Service Provider Application-----------");
		System.out.println("-----------Welcome to admin service-----------");
		int choice;
		do {
			System.out.println("Choose 1 for company manager");
			System.out.println("Choose 2 for investor");
			System.out.println("Choose 3 to exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			TradingAdminServiceImpl obj = new TradingAdminServiceImpl();
			if (choice == 1) {
				System.out.println("Company Manager Menu");
				userMenu();
				int option = sc.nextInt();
				try {
					switch (option) {

					case 1:
						CompanyManager companyManager = setCompanyManagerValues();
						// Function Call to add company manager into the database...
						obj.addCompanyManager(companyManager);
						break;
					case 2:
						System.out.println("Enter the id to be deleted:");
						int companyManagerId = sc.nextInt();
						// Function Call to delete particular company manager from the database...
						obj.deleteCompanyManager(companyManagerId);
						break;
					case 3:
						System.out.println("Enter the id to be updated:");
						int companyManagerId1 = sc.nextInt();
						CompanyManager companyManager1 = updateCompanyMangerValues(companyManagerId1);
						// Function Call to update details of particular company manager in the
						// database...
						obj.updateCompanyManagerDetails(companyManagerId1, companyManager1);
						break;
					default:
						throw new InvalidChoiceException("Choose Valid Option");
					}
				} catch (InvalidChoiceException ex) {
					System.out.println(ex.getMessage());
				}
			} else if (choice == 2) {
				System.out.println("Investor Menu");
				userMenu();
				int ch = sc.nextInt();
				try {
					switch (ch) {
					case 1:
						Investor investor = addInvestorValues();
						// Function Call to add details of investor into the database...
						obj.addInvestor(investor);
						break;
					case 2:
						System.out.println("Enter the id to be deleted:");
						int investorId = sc.nextInt();
						// Function Call to delete particular investor from the database...
						obj.deleteInvestor(investorId);
						break;
					case 3:
						System.out.println("Enter the Investor id");
						int id = sc.nextInt();
						Investor investorObj = updateInvestorValues(id);
						// Function Call to update details of investor in the database...
						obj.updateInvestorDetails(id, investorObj);
						break;
					default:
						// If user chooses invalid option InvalidChoiceException is thrown
						throw new InvalidChoiceException("Choose Valid Option");
					}
				} catch (InvalidChoiceException ex) {
					System.out.println(ex.getMessage()); // Prints the message thrown by exception
				}

			} else {
				System.out.println("THANK YOU");
			}
		} while (choice < 3);
	}

}
