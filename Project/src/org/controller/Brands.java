package org.controller;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;



@Path("/Showroom")
public class Brands {


	@GET
	@Path("/getBrands")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBrands() {
		return "List of brands";
		
	}
	
	@POST
	@Path("/setBrand")
	@Produces(MediaType.TEXT_PLAIN)
	public String setBrands() {
		return "Add a new brand";
	}

}

