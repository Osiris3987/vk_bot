package com.example.vk_bot.web.dto.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MessageResponse {

    @JsonProperty(value = "peer_id")
    private Long peerId;

    @JsonProperty(value = "random_id")
    private Long randomId;

    @JsonProperty(value = "message")
    private String message;

}
