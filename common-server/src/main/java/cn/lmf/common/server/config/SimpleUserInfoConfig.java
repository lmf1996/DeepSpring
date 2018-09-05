package cn.lmf.common.server.config;

import cn.lmf.common.server.vo.SimpleUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleUserInfoConfig {
    SimpleUserInfoProperties simpleUserInfoProperties;

    @Bean
    public SimpleUser simpleUser(){
        SimpleUser simpleUser=new SimpleUser();
        simpleUser.setName(simpleUserInfoProperties.getName());
        simpleUser.setAge(simpleUserInfoProperties.getAge());
        return simpleUser;
    }
}
