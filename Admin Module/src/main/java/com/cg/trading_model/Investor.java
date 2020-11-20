/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */

package com.cg.trading_model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INVESTOR")
public class Investor {

	@Id
	@Column(name = "INVESTOR_ID")
	private int investorId;

	@Column(name = "INVESTOR_NAME")
	private String investorName;

	@Column(name = "INVESTOR_PAN_NUMBER")
	private String investorPanNum;

	@Column(name = "INVESTOR_EMAIL")
	private String investorEmailId;

	@Column(name = "INVESTOR_PHONE_NUMBER")
	private String investorPhone;

	@Column(name = "NUMBER_OF_STOCKS_BOUGHT")
	private int noOfStocks;

	@Column(name = "TOTAL_INVESTMENT")
	private int investorsInvestment;

	public Investor() {

	}

	public Investor(int investorId, String investorName, String investorPanNum, String investorEmailId,
			String investorPhone, int noOfStocks, int investorsInvestment) {
		super();
		this.investorId = investorId;
		this.investorName = investorName;
		this.investorPanNum = investorPanNum;
		this.investorEmailId = investorEmailId;
		this.investorPhone = investorPhone;
		this.noOfStocks = noOfStocks;
		this.investorsInvestment = investorsInvestment;
	}

	public int getInvestorId() {
		return investorId;
	}

	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public String getInvestorPanNum() {
		return investorPanNum;
	}

	public void setInvestorPanNum(String investorPanNum) {
		this.investorPanNum = investorPanNum;
	}

	public String getInvestorEmailId() {
		return investorEmailId;
	}

	public void setInvestorEmailId(String investorEmailId) {
		this.investorEmailId = investorEmailId;
	}

	public String getInvestorPhone() {
		return investorPhone;
	}

	public void setInvestorPhone(String investorPhone) {
		this.investorPhone = investorPhone;
	}

	public int getNoOfStocks() {
		return noOfStocks;
	}

	public void setNoOfStocks(int noOfStocks) {
		this.noOfStocks = noOfStocks;
	}

	public int getInvestorsInvestment() {
		return investorsInvestment;
	}

	public void setInvestorsInvestment(int investorsInvestment) {
		this.investorsInvestment = investorsInvestment;
	}

}
