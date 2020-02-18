package com.capgemini.dd.dto;

import java.time.LocalDate;

public class TrackOrderDetailsDto {
	
	
	int order_Id;
	String SupplierName;
	String place;
	LocalDate Date;
	
	
	
	public TrackOrderDetailsDto(int order_Id, String supplierName, String place, LocalDate date) {
		super();
		this.order_Id = order_Id;
		SupplierName = supplierName;
		this.place = place;
		this.Date = date;
	}
	public int getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
