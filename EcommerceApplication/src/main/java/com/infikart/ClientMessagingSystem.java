package com.infikart;

import com.infikart.service.MessageService;
import com.infikart.factory.MessageFactory;

public class ClientMessagingSystem {
	private MessageService messageService = MessageFactory.factoryMethod();
	public void send(String address, String message) {
		boolean messageStatus = this.messageService.sendMessage(address, message);
		if(!messageStatus) {
			System.out.println("Sorry Invalid Address Please Try again");
		}
	}
}
