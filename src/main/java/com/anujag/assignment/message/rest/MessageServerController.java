package com.anujag.assignment.message.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.anujag.assignment.message.api.Message;
import com.anujag.assignment.message.api.MessageService;

@RestController
public class MessageServerController {
	 @Autowired
	 private MessageService service;
	
	@GetMapping("/message/{number}")
	public ResponseEntity<Message> getMessage(@PathVariable("number") long number){	
	
		System.out.println("In the GET Rest Controller");
		Message msg = service.getMessage(number);
		return new ResponseEntity<Message>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/message")
	public ResponseEntity<Long> getMessage(){
		Long l = service.getMessage();
		System.out.println(l);
		return new ResponseEntity<Long>(l, HttpStatus.OK);
		
	}
	
	}