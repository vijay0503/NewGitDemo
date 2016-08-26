package Org.Newt.RestApplication.Messenger2.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Org.Newt.RestApplication.Messenger2.model.Message;
import Org.Newt.RestApplication.Messenger2.service.MessageService;



@Path("/message")
public class MessageResource {
	MessageService messageService=new MessageService();
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Message> getMessage(){
		//return "HelloWorld";
		return messageService.getAllMessages();
	}
}
