package com.capgemini.dd.daoTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.dao.UpdateDeliveryStatusDao;

public class TestUpdateDeliveryStatusDao {
	
	
	UpdateDeliveryStatusDao obj=new   UpdateDeliveryStatusDao();
	
	Integer List[]= {7,6,5,4,3,2,1};
	@Test
	
	
	public void testGetId()
	{
		
	 java.util.List<Integer> list=obj.getId();
	 
	 assertArrayEquals(List,list.toArray());
		
		
	}
	
	
	@Test
	
	public void testUpdateDeliveryStatusDao()
	{
		
		
		assertEquals("data updated successully",obj.updateDeliveryStatusDao(1, "jalandhar",LocalDate.of(2020, 01, 25)));
		
		
	}
	
	
	
	@Test
	
	public void testUpdateDeliveryStatusDao1()
	{
		
		assertEquals("not valid Id",obj.updateDeliveryStatusDao(10, "jalandhar",LocalDate.of(2020, 01, 25)));
		
		
	}

	
	
	
	
	
	
	
	
	
	

}
