package io.hellsing.email.collector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="io.hellsing")
public class EmailListApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailListApiApplication.class, args);
	}

}
