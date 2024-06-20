package com.example.vk_bot.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {
    private final MessageHandlerService messageHandlerService;

    @PostMapping
    @ResponseBody
    public String handleCallback(@RequestBody EventRequest eventRequest) {
        return messageHandlerService.handleMessage(eventRequest);
    }

}