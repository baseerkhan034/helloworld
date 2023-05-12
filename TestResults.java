package com.piabudhabi.domain;

import javax.persistence.Column;
import javax.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(name="test_results")
public class TestResults {

	@Id
	@Column(name="test_results_id")
	private long testResultsId;
	
	@Column(name="co2_percent")
	private String co2Percent;
	
	@Column(name="n2_percent")
	private String n2Percent;
	
	@Column(name="inert_gasses_percent")
	private String inertGassesPercent;
	
	@Column(name="octane_number")
	private long octaneNumber;
	
	@Column(name="cetane_number")
	private long cetaneNumber;
	
	@Column(name="sample_size")
	private String sampleSize;
	
	@Column(name="sample_from")
	private String sampleFrom;
	
	@Column(name="tested_by")
	private String testedBy;
	
	@Column(name="authorzied_by")
	private String authorizedBy;
	
	
	public long getTestResultsId() {
		return testResultsId;
	}
	public void setTestResultsId(long testResultsId) {
		this.testResultsId = testResultsId;
	}
	public String getCo2Percent() {
		return co2Percent;
	}
	public void setCo2Percent(String co2Percent) {
		this.co2Percent = co2Percent;
	}
	public String getN2Percent() {
		return n2Percent;
	}
	public void setN2Percent(String n2Percent) {
		this.n2Percent = n2Percent;
	}
	public String getInertGassesPercent() {
		return inertGassesPercent;
	}
	public void setInertGassesPercent(String inertGassesPercent) {
		this.inertGassesPercent = inertGassesPercent;
	}
	public long getOctaneNumber() {
		return octaneNumber;
	}
	public void setOctaneNumber(long octaneNumber) {
		this.octaneNumber = octaneNumber;
	}
	public long getCetaneNumber() {
		return cetaneNumber;
	}
	public void setCetaneNumber(long cetaneNumber) {
		this.cetaneNumber = cetaneNumber;
	}
	public String getSampleSize() {
		return sampleSize;
	}
	public void setSampleSize(String sampleSize) {
		this.sampleSize = sampleSize;
	}
	public String getSampleFrom() {
		return sampleFrom;
	}
	public void setSampleFrom(String sampleFrom) {
		this.sampleFrom = sampleFrom;
	}
	public String getTestedBy() {
		return testedBy;
	}
	public void setTestedBy(String testedBy) {
		this.testedBy = testedBy;
	}
	public String getAuthorizedBy() {
		return authorizedBy;
	}
	public void setAuthorizedBy(String authorizedBy) {
		this.authorizedBy = authorizedBy;
	}
}
