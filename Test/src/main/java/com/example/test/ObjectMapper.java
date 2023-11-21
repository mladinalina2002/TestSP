package com.example.test;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.util.List;

public class ObjectMapper {
    private ObjectMapper objectMapper;

    public List<Message> readValue(File file, TypeReference<List<Message>> typeReference) {
        return objectMapper.readValue(file, typeReference);
    }
}
