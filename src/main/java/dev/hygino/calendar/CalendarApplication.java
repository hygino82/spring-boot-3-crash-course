package dev.hygino.calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarApplication.class, args);
		// ConfigurableApplicationContext context =
		// SpringApplication.run(CalendarApplication.class, args);
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
