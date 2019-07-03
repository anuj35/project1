package com.anujag.assignment.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.anujag"})
public class MessageServer {

	public static void main(String[] args){
           SpringApplication.run(MessageServer.class, args);	
	}
}
