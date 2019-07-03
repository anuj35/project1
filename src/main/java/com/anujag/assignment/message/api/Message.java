package com.anujag.assignment.message.api;

import java.security.Timestamp;

public class Message {
	
	private long messageId;
	private String description;
	private Enum MessgeType;
	private long deviceId;
	private Timestamp messageTime;
	private Timestamp dateAdded;
	
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Enum getMessgeType() {
		return MessgeType;
	}
	public void setMessgeType(Enum messgeType) {
		MessgeType = messgeType;
	}
	public long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}
	public Timestamp getMessageTime() {
		return messageTime;
	}
	public void setMessageTime(Timestamp messageTime) {
		this.messageTime = messageTime;
	}
	public Timestamp getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Timestamp dateAdded) {
		this.dateAdded = dateAdded;
	}


}
