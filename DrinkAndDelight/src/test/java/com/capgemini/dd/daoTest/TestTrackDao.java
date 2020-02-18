package com.capgemini.dd.daoTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.dao.TrackDao;

public class TestTrackDao {
	
	
	
	
	TrackDao obj=new TrackDao();
    Integer List[]= {7,6,5,4,3,2,1};
	
	@Test
	
	
	
	public void testgetId()
	{
		
		
		List<Integer> list=obj.getId();
		
		assertArrayEquals(List,list.toArray());
		
		
	}
	
	
	@Test
	
	public void testGetTrackOrderDetailsDao()
	{
		
		assertEquals("order id is->7    supplier Name is-> pavan supplers     location --> banglore    expected delivery--> 2020-01-13",obj.getTrackOrderDetailsDao(7));
		
	}
	
	
	@Test
	
	public void testGetTrackOrderDetailsDao1()
	{
		
		assertEquals("no data found",obj.getTrackOrderDetailsDao(10));
		
	}
	
	
	
	
	

}
