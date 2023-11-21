package com.example.test;

import com.example.test.Message;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.File;
import java.util.List;

@Service
public class MessageService {
    public List<Message> readMessagesFromFile() throws IOException {

        String filePath = "src/main/resources/messages.json";

        ObjectMapper objectMapper = new ObjectMapper();

        List<Message> messages = objectMapper.readValue(new File(filePath), new TypeReference<List<Message>>() {});

        for (Message message : messages) {
            String house = (String) message.getAdditionalProperties().get("house");
            message.getAdditionalProperties().remove("house");
            message.setHouse(house);
        }

        return messages;
    }
}
