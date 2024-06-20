package com.example.vk_bot.domain.exception;

public class InvalidMessageEventException extends RuntimeException {
    public InvalidMessageEventException(String message) {
        super(message);
    }
}
