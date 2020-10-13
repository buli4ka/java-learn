package test.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("test.simple")
public class SampleSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSimpleApplication.class, args);
	}

}