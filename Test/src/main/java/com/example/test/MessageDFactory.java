package com.example.test;

import org.springframework.stereotype.Component;

@Component
public class MessageDFactory {

    public MessageD createDecoder(String house) {
        switch (house.toLowerCase()) {
            case "atreides":
                return new Atreides();
            case "harkonnen":
                return new Harkonnen();
            default:
                throw new IllegalArgumentException("Nu s-a putut crea un decodor pentru casa: " + house);
        }
    }
}