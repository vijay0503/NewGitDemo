package Org.Newt.RestApplication.Messenger2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Org.Newt.RestApplication.Messenger2.model.Message;
public class MessageService {
	
//private Map<Long,Message> messages=DataBaseClass.getMessages();
	
	/*public MessageService(){
		messages.put(1L,new Message(1,"Hello","babu"));
		messages.put(2L,new Message(2,"Hello2","vijay2"));
	}*/
	
	public List<Message> getAllMessages(){
		Message m1=new Message(1,"HelloNewt","Vijay");
		Message m2=new Message(2,"HelloJersey","Babu");
		List<Message> list=new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
		//return new ArrayList<Message>(messages.values());
		
		
	}

}
