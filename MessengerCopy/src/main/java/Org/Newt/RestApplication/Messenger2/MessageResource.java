package Org.Newt.RestApplication.Messenger2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/test")
public class MessageResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		return "HelloWorld";
	}

}