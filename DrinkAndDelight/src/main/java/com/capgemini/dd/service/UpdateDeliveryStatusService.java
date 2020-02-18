package com.capgemini.dd.service;
import java.time.LocalDate;
import java.util.*;
import com.capgemini.dd.dao.UpdateDeliveryStatusDao;
import com.capgemini.dd.exceptions.NoDataFoundException;

public class UpdateDeliveryStatusService {
	
	
	
	UpdateDeliveryStatusDao updateDeliveryDaoObj=new UpdateDeliveryStatusDao();
	
	public String updateDeliveryStatusService(int id,String place,LocalDate date)
	{
		
		
		
		String result="Not valid Id";
		List<Integer>list=updateDeliveryDaoObj.getId();
		for(Integer i:list)
		{
			if(i==id)
			{
				
				result=updateDeliveryDaoObj.updateDeliveryStatusDao(id, place, date);
			}
		}
		 
	
		return result;
		
	 }
	
	
	  public boolean validateIdService(int id) throws NoDataFoundException
	  {
		  boolean check=false;
		 for(Integer i:updateDeliveryDaoObj.getId())
		 {
			 if(id==i)
			 {
				check=true; 
			 }
			 
		 }
		 
		 if(check)
		 {
			 return check;
		 }
		 else
		 {
			 throw new NoDataFoundException("Not valid id ,,,please enter id from above list" );
		 }
		  
		  
		  
		  
	  }
	
	 public boolean dateValidate(String date)
	    {
	    	
	    	if(date.matches("\\d{4}-\\d{2}-\\d{2}"))
	    	
	    		return true ;
	    	
	    	else
	    	
	    		return false;
	    	
	    	
	    }
	    

	
	
	 public List<Integer>getId()
	 {
		
		return updateDeliveryDaoObj.getId();
	 }
	
	
	
	
	

}
