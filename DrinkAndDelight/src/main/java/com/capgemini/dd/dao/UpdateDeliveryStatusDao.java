package com.capgemini.dd.dao;

import java.util.Map;
import java.time.LocalDate;
import java.util.*;
import com.capgemini.dd.dto.TrackOrderDetailsDto;
import com.capgemini.dd.util.TrackOrderRepository;

public class UpdateDeliveryStatusDao {
	
	
	
	
	
	
	Map<Integer,TrackOrderDetailsDto>trackMap;
	
	//constructer
	public UpdateDeliveryStatusDao()
	{
		
		trackMap=TrackOrderRepository.get();
		
		
	}
	//this function is used to getting order ids and returning aslist
	public List<Integer> getId()
	{
		
		
		List<Integer> OrderIdList=new ArrayList<Integer>();
		
		for(Map.Entry<Integer,TrackOrderDetailsDto>map:trackMap.entrySet())
		{
			
			
			OrderIdList.add(map.getKey());
			
		}
		
		
		return OrderIdList;
		
	}
	
	//This function is used for updating delivery status
	public String  updateDeliveryStatusDao(int id,String place,LocalDate date)
	{
		
		String check="not valid Id";
		
		for(Map.Entry<Integer, TrackOrderDetailsDto>map:trackMap.entrySet())
		{
			
			
		    if(map.getKey()==id)
		    {
		    	
		    	map.getValue().setPlace(place);
		    	map.getValue().setDate(date);
		    	
		    	check="data updated successully";
		    	
		    }
			
		}
		
		
		return check;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
