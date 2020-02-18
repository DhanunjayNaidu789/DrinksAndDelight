package com.capgemini.dd.service;

import com.capgemini.dd.dao.TrackDao;
import java.util.*;
public class TrackService
{

	
	 TrackDao obj=new TrackDao();
	 
	 public List<Integer> getId()
	 {
	     return  obj.getId();
	 }
	 
	 public String getTrackOrderDetailsService(Integer id)
	 {
		 String result ="not valid id";
		 
		 for(Integer i:obj.getId())
		 {
			 if(i.equals(id))
			 {
				result= obj.getTrackOrderDetailsDao(id); 
				 
			 }
			 
			 
		  }
		
		 return result;
		 
	   }

}
