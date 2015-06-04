package com.nyu.location;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/*
This takes in address attribute and checks if the user location matches with the office location
*/
@Path("/address")
public class Location {

	 @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public String checkLocationValidity(@QueryParam("address") String addr) {
		
		// JSONObject obj = new JSONObject();
		 String response;
		 if(checkaddress(addr)) {
			 //obj.put("Location", "Office");
			 response = ConstructJSON.constructJSON("Yes Office", true);
		 } else {
			 //obj.put("location", "not office");
			 response = ConstructJSON.constructJSON("NOT Office", false);
		 }
		 System.out.println("----*****-----"+response);
	    return response;
	  }
	 
	 public boolean checkaddress(String address) {
		 boolean flag;
		 if(address.contains("2685")) {
			 flag = true;
		 } else {
			 flag = false;
		 }
		 return flag;
		 
	 }
	 
	
}
