package com.capgemini.dd.dao;
import java.util.*;
import java.util.Map;

import com.capgemini.dd.dto.TrackOrderDetailsDto;
import com.capgemini.dd.util.TrackOrderRepository;

public class TrackDao {
	
	

	
	 Map<Integer,TrackOrderDetailsDto>trackMap;
	 //constructer
	 public TrackDao()
	 {
		 
		 
		 
		 trackMap=TrackOrderRepository.get();
		 
	 }
	 
	 
	 
	 //this function is used to get order ids and return ids in list form
	 
	 public List<Integer> getId()
	 {
		 List<Integer> list=new ArrayList<Integer>();
		 for(Map.Entry<Integer,TrackOrderDetailsDto>map:trackMap.entrySet())
		 {
			 
			list.add(map.getKey()) ;
			 
		 }
		 
		 return list;
	 }
	
	
	//this function gives the result by validating the id 
	 
	 public String getTrackOrderDetailsDao(Integer id)
	 {
		 String result="no data found";
		
		 for(Map.Entry<Integer,TrackOrderDetailsDto> map:trackMap.entrySet())
		 {
			 
			 
			if(map.getKey().equals(id))
			{
				
				
			  result= "order id is->"+ map.getValue().getOrder_Id()+"    supplier Name is-> "+map.getValue().getSupplierName()+"     location --> "+map.getValue().getPlace()+"    expected delivery--> "+map.getValue().getDate();
				
				
				
			}
			 
			 
		 }
		 
		
		 return result;
		
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
