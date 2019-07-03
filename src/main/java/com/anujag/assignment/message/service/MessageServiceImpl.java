package com.anujag.assignment.message.service;

import org.springframework.stereotype.Service;

import com.anujag.assignment.message.api.Message;
import com.anujag.assignment.message.api.MessageService;
import com.anujag.assignment.message.api.MessageStats;

@Service
public class MessageServiceImpl  implements MessageService {

	public boolean addMessage() {
		
		return false;
	}

	
	public Message getMessage(long id) {
		// TODO Auto-generated method stub
		Message msg1 = new Message();
		msg1.setDescription("test");
		msg1.setMessageId(id);
		System.out.println(msg1.getMessageId());
		return msg1;
	}

	public MessageStats getStats() {

		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Long getMessage() {
		// TODO Auto-generated method stub
		return 999L;
	}

}
