package com.smartHome.commonLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CommonLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonLibraryApplication.class, args);
	}

}