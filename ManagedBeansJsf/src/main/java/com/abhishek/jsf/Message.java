package com.abhishek.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message", eager = true)
@RequestScoped
public class Message {
	private String message1 = "Hello World Message!!";

	public Message() {
		System.out.println("Message started!");
	}

	public String getMessage() {
		return message1;
	}

	
}
