package com.example.vk_bot.service.impl;

import com.example.vk_bot.service.MessageHandlerService;
import com.example.vk_bot.web.dto.event.EventRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageHandlerServiceImpl implements MessageHandlerService {

    @Override
    public String handleMessage(EventRequest eventRequest) {
        return null;
    }

}
