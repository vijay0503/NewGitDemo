package Org.Newt.RestApplication.Messenger2.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	private long id;
	private String message;
	private String author;
	private Date creator;
	public Message() {
	}
	
	
	public Message(long id, String message, String author) {

		this.id = id;
		this.message = message;
		this.author = author;
		this.creator = new Date();
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreator() {
		return creator;
	}
	public void setCreator(Date creator) {
		this.creator = creator;
	}


}
