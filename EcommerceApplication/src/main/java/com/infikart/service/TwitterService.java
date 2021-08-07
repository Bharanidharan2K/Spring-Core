package com.infikart.service;

public class TwitterService implements MessageService{
	
	private int characterLength;
	private String twitterId;
	public TwitterService(int characterLength, String twitterId) {
		this.characterLength = characterLength;
		this.twitterId = twitterId;
	}

	public boolean sendMessage(String address, String message) {
		boolean messageStatus = false;
		if(address.contains("@") && message.length() <= characterLength) {
			messageStatus = true;
			System.out.println("The Message is "+ message+ " Send to "+ address);
		}
		return messageStatus;
	}
	
}
