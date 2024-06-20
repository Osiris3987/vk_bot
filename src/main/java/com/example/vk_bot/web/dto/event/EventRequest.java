package com.example.vk_bot.web.dto.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventRequest {

    @JsonProperty(value = "secret")
    private String secret;

    @JsonProperty(value = "event_id")
    private String eventId;

    @JsonProperty(value = "type")
    private EventType type;

    @JsonProperty(value = "object")
    private Map<String, Map<String, Object>> object;

}
