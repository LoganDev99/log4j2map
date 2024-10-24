package com.example.log4j2map;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.message.MapMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class Log4j2mapApplication {

	public static void main(String[] args) {
		SpringApplication.run(Log4j2mapApplication.class, args);

		log.info(new MapMessage<>()
				.with("METHOD", "main()")
				.with("MESSAGE", "My Map Message Event")
		);
	}

}
