package com.capgemini.dd.util;

import java.time.LocalDate;
import java.util.*;

import com.capgemini.dd.dto.TrackOrderDetailsDto;

public class TrackOrderRepository {
	
	
	
	private TrackOrderRepository()
	
	{
		
		
	}
	
	 static Map<Integer,TrackOrderDetailsDto>trackMap=new HashMap<Integer,TrackOrderDetailsDto>();
	 
	 
	 
	 static 
	 {
		 
		 
		trackMap.put(1,new TrackOrderDetailsDto(1,"sai suppliers","banglore",LocalDate.of(2020, 01, 15)));
		trackMap.put(2,new TrackOrderDetailsDto(2,"Jai suppliers","Hyderabad",LocalDate.of(2020, 01, 25)));
		trackMap.put(3,new TrackOrderDetailsDto(3,"Eswari suppliers","Visakhapatnam",LocalDate.of(2020, 01,9)));
		trackMap.put(4,new TrackOrderDetailsDto(4,"laxmi suppliers","mumbai",LocalDate.of(2020, 01, 17)));
		trackMap.put(5,new TrackOrderDetailsDto(5,"sridhar suppliers","delhi",LocalDate.of(2020, 01, 20)));
		trackMap.put(6,new TrackOrderDetailsDto(6,"kiran supplers","punee",LocalDate.of(2020, 01, 17)));
		trackMap.put(7,new TrackOrderDetailsDto(7,"pavan supplers","banglore",LocalDate.of(2020, 01, 13)));
		
		 
		 
		 
		 
	 }
	 
	 
	 static public  Map<Integer,TrackOrderDetailsDto> get()
	 {
		 
		 
		 return trackMap;
		 
		 
	 }
	 
	 
	 
	
	
	
	
	
	
	
	
	

}
