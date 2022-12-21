package com.ab.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String generateWishMessage() {
		LocalDateTime ldt = LocalDateTime.now();
		
		int hours = ldt.getHour();
		
		if(hours < 12)
			return "Good Morning";
		else if (hours < 16)
			return "Good AfterNoon";
		else if (hours < 20)
			return "Good Evening";
		else
			return "Good Night";
	}

}
