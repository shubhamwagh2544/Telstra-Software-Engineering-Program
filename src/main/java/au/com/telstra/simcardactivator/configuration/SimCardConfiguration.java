package au.com.telstra.simcardactivator.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SimCardConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}