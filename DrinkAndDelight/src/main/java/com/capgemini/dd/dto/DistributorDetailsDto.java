package com.capgemini.dd.dto;

public class DistributorDetailsDto {
	
	
	int DistributorId;
	String DistributorName,address;
	double phoneNumber;
	
	
	
	public DistributorDetailsDto(int distributorId, String distributorName, String address, double phoneNumber) {
		super();
		DistributorId = distributorId;
		DistributorName = distributorName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public int getDistributorId() {
		return DistributorId;
	}
	
	public String getDistributorName() {
		return DistributorName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
	
	
	
	
	
	
	


}
