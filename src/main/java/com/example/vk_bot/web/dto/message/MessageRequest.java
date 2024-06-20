package com.example.vk_bot.web.dto.message;

import lombok.Data;
@Data
public class MessageRequest {

    private Long id;

    private Long date;

    private Long peerId;

    private Long fromId;

    private String text;
}
