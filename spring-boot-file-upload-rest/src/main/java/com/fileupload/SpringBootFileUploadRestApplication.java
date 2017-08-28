package com.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFileUploadRestApplication {
	private int maxUploadSizeInMb = 10 * 1024 * 1024;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFileUploadRestApplication.class, args);
	}
}
