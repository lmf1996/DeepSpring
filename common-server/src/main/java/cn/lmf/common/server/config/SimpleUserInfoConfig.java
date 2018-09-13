package cn.lmf.common.server.config;

import cn.lmf.common.server.vo.SimpleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SimpleUserInfoProperties.class)
public class SimpleUserInfoConfig {
    @Autowired
    SimpleUserInfoProperties simpleUserInfoProperties;



    @Bean
    public SimpleUser simpleUser(){
        SimpleUser simpleUser=new SimpleUser();
        simpleUser.setName(simpleUserInfoProperties.getMyName());
        simpleUser.setAge(simpleUserInfoProperties.getAge());
        return simpleUser;
    }
}
