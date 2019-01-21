package com.abhishek.jsfConverter.custom;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "customConverterData", eager = true)
@SessionScoped
public class CustomConverterData implements Serializable {
	private static final long serialVersionUID = 1L;
	public UrlData data;

	public UrlData getData() {
		return data;
	}

	public void setData(UrlData data) {
		this.data = data;
	}
}
