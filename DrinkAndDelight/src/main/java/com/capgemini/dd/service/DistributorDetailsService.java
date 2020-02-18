package com.capgemini.dd.service;

import com.capgemini.dd.dao.DistributorDetailsDao;
import com.capgemini.dd.exceptions.NoDataFoundException;

import java.util.*;


public class DistributorDetailsService 
{
	
	
	DistributorDetailsDao distributorDaoObj=new DistributorDetailsDao();
    
	List<Integer>IdList=new ArrayList<Integer>();
    public List<Integer> getId()
	{
		 IdList=distributorDaoObj.getIds();
		 return IdList;
	}
    
       
    
	
	public String getDistributorDetails(Integer orderId) throws  NoDataFoundException
	{
		
        String result=null;
		
		for(Integer i:IdList)
		{
			
			if(i.equals(orderId))
			{
				
			 result= distributorDaoObj.getDistributorDetailsDao(orderId);
			
			}
		
			
		}
	
		if(result ==null)
		{
			
			throw new NoDataFoundException(" not valid id");
		}
		else
		{
			return result;
		}
		
	}
	
}
