package com.capgemini.dd.ServiceTest;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.service.TrackService;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
public class TestTrackService {
	
	
	
	
	
	TrackService obj=new TrackService();
	
    Integer List[ ]= {7,6,5,4,3,2,1};
	
	@Test
	
	public void testGetId()
	{
		
		
		
		List<Integer>list=obj.getId();
		
		assertArrayEquals(List,list.toArray());
		
		
		
		
	}
	
	
	
	@Test
	public void testGetTrackOrderDetailsService()
	{
		
		assertEquals("order id is->7    supplier Name is-> pavan supplers     location --> banglore    expected delivery--> 2020-01-13",obj.getTrackOrderDetailsService(7));
	
		
		
	}
	
	
    @Test
    public void  testGetTrackOrderDetailsService1()
    {
    	
    	
    	assertEquals("not valid id",obj.getTrackOrderDetailsService(10));
    	
    }
	
	
	
	
	
	
	
	
	
	
	

}
