package com.abhishek.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "managedbean", eager = true)
public class ManagedBeanTest {
	public ManagedBeanTest() {
		System.out.println("MessageBean started!");
	}

	public String getMessage() {
		return "Managed Bean example";
	}
}
