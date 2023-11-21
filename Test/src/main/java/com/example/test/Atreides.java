package com.example.test;

public class Atreides implements MessageD {
    @Override
    public String decode(String message) {
        message = message.replace("^", "M")
                .replace("q", "e")
                .replace("f", "s");

        message = message.replace("abc", "M")
                .replace("def", "e")
                .replace("ghi", "s");

        return message;
    }
}
