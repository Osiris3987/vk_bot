package com.example.vk_bot.web.mapper;

import com.example.vk_bot.web.dto.event.EventRequest;
import com.example.vk_bot.web.dto.message.MessageRequest;
import com.example.vk_bot.web.dto.message.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MessageMapper {

    public MessageRequest toMessageRequest(EventRequest eventRequest) {
        Map<String, Object> map = eventRequest.getObject().get("message");
        MessageRequest messageRequest = new MessageRequest();
        messageRequest.setId(Long.parseLong(map.get("id").toString()));
        messageRequest.setFromId(Long.parseLong(map.get("from_id").toString()));
        messageRequest.setPeerId(Long.parseLong(map.get("peer_id").toString()));
        messageRequest.setDate(Long.parseLong(map.get("date").toString()));
        messageRequest.setText(map.get("text").toString());
        return messageRequest;
    }

    public MessageResponse toMessageResponse(MessageRequest request) {
        MessageResponse response = new MessageResponse();
        response.setMessage("Вы сказали: " + request.getText());
        response.setRandomId(0L);
        response.setPeerId(request.getPeerId());
        return response;
    }

}
