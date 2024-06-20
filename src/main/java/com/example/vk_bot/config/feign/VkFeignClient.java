package com.example.vk_bot.config.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "messages", url = "https://api.vk.com/method/messages.send")
public interface VkFeignClient {

    @PostMapping
    void sendMessage(
            @RequestParam(name = "access_token") String accessToken,
            @RequestParam("v") String v,
            @RequestParam MultiValueMap<String, String> map
    );
}
