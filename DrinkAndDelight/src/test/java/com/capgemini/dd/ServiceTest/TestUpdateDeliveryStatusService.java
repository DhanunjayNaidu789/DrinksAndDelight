package com.capgemini.dd.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.exceptions.NoDataFoundException;
import com.capgemini.dd.service.UpdateDeliveryStatusService;

public class TestUpdateDeliveryStatusService {
	
	
	UpdateDeliveryStatusService obj=new UpdateDeliveryStatusService();
	Integer List[]= {7,6,5,4,3,2,1};
	
	@Test
	
	
	public void testgetId()
	{
		
		List<Integer>list=obj.getId();
		
		assertArrayEquals(List,list.toArray());
		
		
		
	}
	
	
	@Test
	
	public void testValidateDate()
	{
		
		
		assertTrue(obj.dateValidate("2020-01-24"));
		
		
		
	}
	
	
	@Test
	public void testValidateDate1()
	{
		
		assertFalse(obj.dateValidate("20-01-2020"));
		
	}
	
	
	
	
	
	@Test
	public void testUpdateDeliveryStatusService()
	{
		
		
		
		
		assertEquals("data updated successully",obj.updateDeliveryStatusService(1, "jalandhar",LocalDate.of(2020, 01, 25)));
		
		
	}
	
	
	@Test
	
	public void testUpdateDeliveryStatusService1()
	{
		
		assertEquals("Not valid Id",obj.updateDeliveryStatusService(10, "jalandhar",LocalDate.of(2020,01,20)));
		
	}
	
	
	@Test
	
	public void getValidateIdService() throws NoDataFoundException
	{
		
		
		
		assertTrue(obj.validateIdService(1));
		
		
		
	}
	
	
	@Test
	
	public void getValidateIdService1() 
	{
		Throwable exception =assertThrows(
				  
				  NoDataFoundException.class,()->{
				  obj.validateIdService(10);
	              }
				  
				  
		  );
		  assertEquals("Not valid id ,,,please enter id from above list",exception.getMessage());
		
		
		
		
	}
	
	
	
	
	
	
	

}
