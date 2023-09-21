package com.UrlHitCounter.UrlHitCounter.BeanManager;

import com.UrlHitCounter.UrlHitCounter.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
@Configuration
public class BeanFactory {
    @Bean
    public ArrayList<User> returnList(){
      return new ArrayList<>();
    }
}
