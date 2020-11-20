package com.cg.tradingservice.client;

import java.util.Scanner;

import com.cg.tradingservice.exception.KeyNotFoundException;
import com.cg.tradingservice.services.InvestorService;
import com.cg.tradingservice.services.InvestorServiceImpl;

public class InvestorClient {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		InvestorService cm = new InvestorServiceImpl();
		System.out.println("Investor Operations");
		System.out.println("1. buy stocks");
		System.out.println("2. sell Stocks");
		System.out.println("3. watch list");
		System.out.println("enter you choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: 
			cm.showStock();
			System.out.println("Select the company Symbol you wish to buy");
			int sym = sc.nextInt();
		     System.out.println("no of stock you want to buy");
		     int count = sc.nextInt();
		     System.out.println("Enter your id:");
		     int id = sc.nextInt();
		     cm.buyStock(sym, count, id);
		     break;
		case 2:
			System.out.println("Enter your id:");
			int investerId = sc.nextInt();
			cm.watchlistStock(investerId);
			System.out.println("Enter the investment id to sell");
			int investmentId = sc.nextInt();
			cm.sellStock(investerId, investmentId);
			break;
		case 3:
			System.out.println("Enter your id");
			int investorId = sc.nextInt();
			cm.watchlistStock(investorId);
		 default : 
		    	throw new KeyNotFoundException("Incorrect Input");   
		}
	   }catch(KeyNotFoundException e) {
		e.printStackTrace();
	}
	}		
}