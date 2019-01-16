package com.abhishek.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(eager = true, name = "beanmessage")
@RequestScoped
public class BeanMessage {

	@ManagedProperty(value = "#{message}")
	private Message messageBean;

	private String message;

	public BeanMessage() {
		System.out.println("BeanMessage started!");
	}

	public String getMessage() {
		if (messageBean != null) {
			message = messageBean.getMessage();
		}
		return message;
	}

	public void setMessageBean(Message message) {
		this.messageBean = message;
	}

}
