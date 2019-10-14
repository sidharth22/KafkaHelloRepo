package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.course.producer.HelloKafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner {

	
	@Autowired
	private HelloKafkaProducer helloKafkaProducer;
	public static void main(String[] args)   {
		// System.out.println("Hello Kafka...Producer !!0");
		
		
		
		SpringApplication.run(KafkaProducerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		helloKafkaProducer.sendHello("Timotius " + Math.random());
	}

}
