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
@Table(name = "COMPANY_MANAGER")
public class CompanyManager {

	@Id
	@Column(name = "COMPANY_MANAGER_ID")
	private int companyManagerId;

	@Column(name = "COMPANY_MANAGER_NAME")
	private String companyManagerName;

	@Column(name = "COMPANY_MANAGER_EMAILID")
	private String companyManagerEmailId;

	@Column(name = "COMPANY_MANAGER_PHONE")
	private String companyManagerPhone;

	public CompanyManager() {

	}

	public CompanyManager(int companyManagerId, String companyManagerName, String companyManagerEmailId,
			String companyManagerPhone) {
		super();
		this.companyManagerId = companyManagerId;
		this.companyManagerName = companyManagerName;
		this.companyManagerEmailId = companyManagerEmailId;
		this.companyManagerPhone = companyManagerPhone;
	}

	public int getCompanyManagerId() {
		return companyManagerId;
	}

	public void setCompanyManagerId(int companyManagerId) {
		this.companyManagerId = companyManagerId;
	}

	public String getCompanyManagerName() {
		return companyManagerName;
	}

	public void setCompanyManagerName(String companyManagerName) {
		this.companyManagerName = companyManagerName;
	}

	public String getCompanyManagerEmailId() {
		return companyManagerEmailId;
	}

	public void setCompanyManagerEmailId(String companyManagerEmailId) {
		this.companyManagerEmailId = companyManagerEmailId;
	}

	public String getCompanyManagerPhone() {
		return companyManagerPhone;
	}

	public void setCompanyManagerPhone(String companyManagerPhone) {
		this.companyManagerPhone = companyManagerPhone;
	}

}
