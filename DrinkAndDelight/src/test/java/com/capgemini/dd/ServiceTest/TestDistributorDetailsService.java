package com.capgemini.dd.ServiceTest;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.exceptions.NoDataFoundException;
import com.capgemini.dd.service.DistributorDetailsService;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.*;

public class TestDistributorDetailsService {
	
	
	
	
  DistributorDetailsService obj=new DistributorDetailsService();
  
  Integer List[]= {6,5,4,3,2,1};
  
  
  
  @Test
  
  public void testGetDistributorDetailsSerivice() 
  {
	  
	  
	  try
	  {
	  
	  assertEquals("1 Dhanunjay Coke Services vizag,Andhrapradesh 123456.0",obj.getDistributorDetails(1));
	  }
	  catch(NoDataFoundException e)
	  {
		  
		  
		  
	  }
	  
	  
	  
	  
	  
  }
  
  
  
  @Test
  
  public void testGetDistributorDetailsSerivice1() 
  {
	  
	  Throwable exception =assertThrows(
			  
			  NoDataFoundException.class,()->{
			  obj.getDistributorDetails(9);
              }
			  
			  
	  );
	  assertEquals(" not valid id",exception.getMessage());
  }
  
  
  
  @Test
  
  
  
	public void testgetId()
	{
	  
	 List<Integer>list= obj.getId();
	 
	 
	 assertArrayEquals(List,list.toArray());
	  
	  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
