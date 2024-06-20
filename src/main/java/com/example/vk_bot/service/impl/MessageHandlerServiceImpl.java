package com.example.vk_bot.service.impl;

import com.example.vk_bot.config.feign.VkFeignClient;
import com.example.vk_bot.config.props.VkProps;
import com.example.vk_bot.domain.exception.InvalidMessageEventException;
import com.example.vk_bot.service.MessageHandlerService;
import com.example.vk_bot.web.dto.event.EventRequest;
import com.example.vk_bot.web.dto.message.MessageRequest;
import com.example.vk_bot.web.dto.message.MessageResponse;
import com.example.vk_bot.web.mapper.MessageMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;

@Service
@RequiredArgsConstructor
public class MessageHandlerServiceImpl implements MessageHandlerService {

    private final VkProps vkProps;

    private final MessageMapper messageMapper;

    private final ObjectMapper objectMapper;

    private final VkFeignClient vkFeignClient;

    @Override
    public String handleMessage(EventRequest eventRequest) {
        switch (eventRequest.getType()) {
            case confirmation -> {
                return vkProps.getConfirmation();
            }
            case message_new -> {
                MessageRequest messageRequest = messageMapper.toMessageRequest(eventRequest);
                handleMessageNewEvent(messageRequest);
                return "ok";
            }
            default -> throw new InvalidMessageEventException("Message event type not supported");
        }
    }

    private void handleMessageNewEvent(MessageRequest messageRequest) {
        MessageResponse messageResponse = messageMapper.toMessageResponse(messageRequest);
        vkFeignClient.sendMessage(
                vkProps.getAccessToken(),
                vkProps.getV().toString(),
                objectMapper.convertValue(messageResponse, LinkedMultiValueMap.class)
        );
    }

}
