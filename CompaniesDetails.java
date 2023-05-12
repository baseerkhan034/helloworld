package com.piabudhabi.domain;

import javax.persistence.Column;
import javax.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(name = "companies_details")
public class CompaniesDetails {

	@Id
	@Column (name = "companies_details_id")
	private long companyDetailsId;

	//name
	private String name;
	
	//address
	private String address;
	
	@Column (name = "contact_number")
	private long contactNumber;
	
	@Column (name = "established_year")
	private String establishedYear;
	
	@Column (name = "certified_by")
	private String certifiedBy;
	
	@Column (name = "certified_on")
	private String certifiedOn;
	
	public long getCompanyDetailsId() {
		return companyDetailsId;
	}
	public void setCompanyDetailsId(long companyDetailsId) {
		this.companyDetailsId = companyDetailsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEstablishedYear() {
		return establishedYear;
	}
	public void setEstablishedYear(String establishedYear) {
		this.establishedYear = establishedYear;
	}
	public String getCertifiedBy() {
		return certifiedBy;
	}
	public void setCertifiedBy(String certifiedBy) {
		this.certifiedBy = certifiedBy;
	}
	public String getCertifiedOn() {
		return certifiedOn;
	}
	public void setCertifiedOn(String certifiedOn) {
		this.certifiedOn = certifiedOn;
	}

}
