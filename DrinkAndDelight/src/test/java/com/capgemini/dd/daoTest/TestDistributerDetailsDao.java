package com.capgemini.dd.daoTest;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.dao.DistributorDetailsDao;


;public class TestDistributerDetailsDao {
	
	
    DistributorDetailsDao obj=new DistributorDetailsDao();
    Integer List[]= {6,5,4,3,2,1};
   
 
    
    
    
    
    
	@Test
	
	public void testGetDistributorDetailsDao()
	{
		
		
		
		assertEquals("1 Dhanunjay Coke Services vizag,Andhrapradesh 123456.0",obj.getDistributorDetailsDao(1));
		
		
		
	}
	
	
	@Test
	public void testGetDistributorDetailsDao1()
	{
		
		
		
		assertEquals(null,obj.getDistributorDetailsDao(9));
		
		
	}
	
	@Test
	public void testGetIds()
	{
		
		
		List<Integer> list=obj.getIds();
       
       // list.toArray();
        assertArrayEquals(List,list.toArray());
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
