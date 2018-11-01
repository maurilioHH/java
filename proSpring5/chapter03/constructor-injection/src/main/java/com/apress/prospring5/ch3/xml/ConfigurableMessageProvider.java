package com.apress.prospring5.ch3.xml;

import com.apress.prospring5.ch2.decoupled.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider {
	private String message = "Default message";

	public ConfigurableMessageProvider() {
		System.out.println("empty constructor");
	}

	public ConfigurableMessageProvider(String message) {
		System.out.println("ConfigurableMessageProvider(String) constructor");
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
