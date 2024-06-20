package com.example.vk_bot.service;

import com.example.vk_bot.web.dto.event.EventRequest;

public interface MessageHandlerService {

    String handleMessage(EventRequest eventRequest);

}
