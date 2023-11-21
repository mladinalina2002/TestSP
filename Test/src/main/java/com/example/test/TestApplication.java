package com.example.test;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.test.Message;
import com.example.test.MessageService;
import com.example.test.MessageD;
import com.example.test.MessageDFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;
@SpringBootApplication
public class TestApplication {
	public static void main(String[] args) throws IOException {
		String filePath = "src/main/resources/messages.json";

		ObjectMapper objectMapper = new ObjectMapper();

		List<Message> messages = objectMapper.readValue(new File(filePath), new TypeReference<List<Message>>() {});

		for (Message message : messages) {
			System.out.println(message);
		}

	}
}






