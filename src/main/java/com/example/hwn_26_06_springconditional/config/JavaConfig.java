package com.example.hwn_26_06_springconditional.config;

import com.example.hwn_26_06_springconditional.DevProfile;
import com.example.hwn_26_06_springconditional.ProductionProfile;
import com.example.hwn_26_06_springconditional.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
