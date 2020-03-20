package org.slk.MyFirst;

import javax.ws.rs.*;

@Path("/showroom")
public class brands {
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
