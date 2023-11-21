package com.example.test;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.Map;
@Data
public class Message {
    private LocalDateTime date;
    private String message;
    private String house;
    private Map<String, Object> additionalProperties;
}
