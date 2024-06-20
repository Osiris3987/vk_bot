package com.example.vk_bot.util.validation;

import java.security.InvalidParameterException;

public class MessageValidator {

    public static void checkSecretIsValid(String secret, String receivedSecret) {
        if (!secret.equals(receivedSecret)) {
            throw new InvalidParameterException("Invalid secret");
        }
    }

}
