package com.anujag.assignment.message.api;

@SuppressWarnings("serial")
public class MessageNotFoundException extends RuntimeException{
	
	public MessageNotFoundException() {};
	
	public MessageNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MessageNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MessageNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MessageNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	
}
