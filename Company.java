package com.piabudhabi.domain;

import javax.persistence.Column;
import javax.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(name = "company")
public class Company {
	
	
	//this is just the comment which is to make the coder understand that this is the small changes that has been implemented.
	@Id
	@Column(name="company_id")
	private long companyId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "contractor_type")
	private String contractorType;
	
	@Column(name = "contractor_level")
	private String contractorLevel;
	
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String names) {
		this.companyName = names;
	}
	public String getContractorType() {
		return contractorType;
	}
	public void setContractorType(String contractorType) {
		this.contractorType = contractorType;
	}
	public String getContractorLevel() {
		return contractorLevel;
	}
	public void setContractorLevel(String contractorLevel) {
		this.contractorLevel = contractorLevel;
	}

}
