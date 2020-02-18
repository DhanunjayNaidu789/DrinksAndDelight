package com.capgemini.dd.dao;

import java.util.Map;
import java.util.*;

import com.capgemini.dd.dto.DistributorDetailsDto;

import com.capgemini.dd.util.DistributorRepository;


public class DistributorDetailsDao {
	
	
	Map<Integer,DistributorDetailsDto> repositoryMap;
	
	//constructer
	public DistributorDetailsDao()
	{
		
		repositoryMap=DistributorRepository.get();
		
		
	}
	
	//this function get the order ids and return list
	public List<Integer> getIds()
	{
		List<Integer> orderIdList=new ArrayList<Integer>();
		for(Map.Entry<Integer, DistributorDetailsDto> obj:repositoryMap.entrySet())
		{
			
			orderIdList.add(obj.getKey());
			
		}
		return orderIdList;
		
	}
	
	//this function give the result by validating the id 
    public String getDistributorDetailsDao(Integer id)
	{
		String result=null;
		for(Map.Entry<Integer,DistributorDetailsDto> obj:repositoryMap.entrySet())
		{
			if(obj.getKey().equals(id))
			{
					
				result=obj.getValue().getDistributorId()+" "+obj.getValue().getDistributorName()+" "+obj.getValue().getAddress()+" "+obj.getValue().getPhoneNumber();
			
				
					
			}
				
		 }
			
			
		 return result;

	  }
		
		
		
		
	}
	
	
	
	


