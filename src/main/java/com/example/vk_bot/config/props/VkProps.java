package com.example.vk_bot.config.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "vk.api")
public class VkProps {

    private Double v;

    private String confirmation;

    private String secret;

    private String accessToken;

}
