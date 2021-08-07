package com.infikart.factory;

import com.infikart.service.MessageService;
import com.infikart.service.TwitterService;

public class MessageFactory {
	private static MessageService messageService;
	public static MessageService factoryMethod() {
		messageService = new TwitterService(70,"Tf256");
		return messageService;
	}
}
