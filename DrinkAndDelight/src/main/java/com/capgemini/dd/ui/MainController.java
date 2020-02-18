package com.capgemini.dd.ui;
import static java.lang.System.out;
import java.time.LocalDate;
import java.util.*;

import com.capgemini.dd.exceptions.NoDataFoundException;
import com.capgemini.dd.service.DistributorDetailsService;
import com.capgemini.dd.service.TrackService;
import com.capgemini.dd.service.UpdateDeliveryStatusService;
public class MainController {
	
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);	
	 
    
     control: while(true)
	 {
		
	 out.println("enter \n 1:track order  \n 2:updateDeliveryStatus  \n 3:distributorDetails \n 4:exit");
	 
	 int choice=sc.nextInt();
	 
	 switch(choice)
	 {
	 
	 case 1: 
	         TrackService obj=new TrackService();
             out.println("Tracking order");
	         out.println("---------------");
	         out.println("ur order ids are \n"+obj.getId());
	         out.println("enter order id from ur list");
	         int id=sc.nextInt();
	         out.println( obj.getTrackOrderDetailsService(id));
	         break;
	 case 2: out.println("employee updating the delivery status");
	         out.println("-------------------------------------");
	         UpdateDeliveryStatusService obj3=new UpdateDeliveryStatusService();
	         out.println("order ids for the employee are \n"+obj3.getId());
	         out.println("enter the id u want to update");
	         int orderId;
	         while(true)
	         {
	          orderId=sc.nextInt();
	         try
	         {
	         if(obj3.validateIdService(orderId))
	         {
	        	 break;
	         }
	         }
	         catch (NoDataFoundException e)
	         {
	        	 out.println(e);
	        	 
	         }
	         }
	        	 
	         out.println("enter the updated place");
	         String orderPlace=sc.next();
	         out.println("enter the expected delivery date ,format:yyyy-mm-dd");
	         while(true)
	         {
	         String orderDate=sc.next();
	         if(obj3.dateValidate(orderDate))
	         {
	        	 LocalDate convertedDate=LocalDate.parse(orderDate);
	        	 out.println(obj3.updateDeliveryStatusService(orderId, orderPlace,convertedDate));
	        	 break ;
	         }
	         else
	         {
	        	 
	        	 out.println("please enter the date in same format");
	         }
	         }
	         		
	         
	         break;
	 case 3: 
	         DistributorDetailsService distributorDetailsService=new  DistributorDetailsService();
	         out.println("Distributors ids are");
	         out.println(distributorDetailsService.getId());
	         out.println("enter the distributor id u want to know about");
             int distributorId=sc.nextInt();
             sc.nextLine();
             
             try
             {
	         out.println(distributorDetailsService.getDistributorDetails(distributorId));
             }
             catch(NoDataFoundException e)
             {
            	 out.println(e);
             }
	         break;
	 case 4: break control;
	 default:out.println("you entered wrong choice");
	 
	 
	
	 
	 
	   }
	 
	  out.println("----------------------------------------------------------------------------------------------------------------------------------");
	 }
	 sc.close();
  }
	
}
