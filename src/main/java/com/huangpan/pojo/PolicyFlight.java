package com.huangpan.pojo;

import java.io.Serializable;
import java.util.Set;


public class PolicyFlight implements Serializable {
	
	private static final long serialVersionUID = 4689669021319115194L;
	
	private String operateTime;

	private String policyFlightID;


	private String flightOrder;

	
	private String carrier;

	
	private String flightNumber;

	
	private String originAirport;

	
	private String destAirport;

	
	private String flightDate;

	
	private String flightTime;

	
	private String flightStatus;

	
	 private Set<InsuranceItem> insuranceItems;


	public String getOperateTime() {
		return operateTime;
	}


	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}


	public String getPolicyFlightID() {
		return policyFlightID;
	}


	public void setPolicyFlightID(String policyFlightID) {
		this.policyFlightID = policyFlightID;
	}


	public String getFlightOrder() {
		return flightOrder;
	}


	public void setFlightOrder(String flightOrder) {
		this.flightOrder = flightOrder;
	}


	public String getCarrier() {
		return carrier;
	}


	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getOriginAirport() {
		return originAirport;
	}


	public void setOriginAirport(String originAirport) {
		this.originAirport = originAirport;
	}


	public String getDestAirport() {
		return destAirport;
	}


	public void setDestAirport(String destAirport) {
		this.destAirport = destAirport;
	}


	public String getFlightDate() {
		return flightDate;
	}


	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}


	public String getFlightTime() {
		return flightTime;
	}


	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}


	public String getFlightStatus() {
		return flightStatus;
	}


	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}


	public Set<InsuranceItem> getInsuranceItems() {
		return insuranceItems;
	}


	public void setInsuranceItems(Set<InsuranceItem> insuranceItems) {
		this.insuranceItems = insuranceItems;
	}

	
	
	
}
