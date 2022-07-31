package com.lta.springtaskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldTask {

	@Scheduled(fixedRate = 1000)
	public void startTask() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println("Hello world!!! " + dateFormat.format(new Date()));
	}
}
