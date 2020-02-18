package com.capgemini.dd.util;
import java.util.*;


import com.capgemini.dd.dto.DistributorDetailsDto;


    
    public class DistributorRepository {
    	
    	
    private	DistributorRepository()
    {
    	
    	
    }
	
	static Map<Integer,DistributorDetailsDto> distributorMap=new HashMap<Integer,DistributorDetailsDto>();
	
	static 
	{
		
		
		
		distributorMap.put(1, new DistributorDetailsDto(1,"Dhanunjay Coke Services","vizag,Andhrapradesh",123456));
		distributorMap.put(2, new DistributorDetailsDto(2,"Sridhar Coke Services","hyderabad,Andhrapradesh",566747));
		distributorMap.put(3, new DistributorDetailsDto(3,"Jnanesh mazaa Services","vizag,Andhrapradesh",1234789));
		distributorMap.put(4, new DistributorDetailsDto(4,"saikiran pepsi Services","anakpalli,Andhrapradesh",123567));
		distributorMap.put(5, new DistributorDetailsDto(5,"bore sprite Services","kerala,Andhrapradesh",123444));
		distributorMap.put(6, new DistributorDetailsDto(6,"barcode limca Services","vizag,Andhrapradesh",123456));
	
	}
	
	static public Map<Integer,DistributorDetailsDto> get() 
	{
		
		
		return distributorMap ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}













