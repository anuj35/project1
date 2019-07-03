package com.anujag.assignment.message.api;

import com.anujag.assignment.message.api.MessageNotFoundException;

public interface MessageService {
	public boolean addMessage();
	public Message getMessage(long id) throws MessageNotFoundException;
	public MessageStats getStats();
	public Long getMessage();

}
