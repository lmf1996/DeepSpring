package cn.lmf.common.server.controller;

import cn.lmf.common.server.config.SimpleUserInfoProperties;
import cn.lmf.common.server.vo.SimpleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Autowired
    SimpleUser simpleUser;

    @Autowired
    SimpleUserInfoProperties simpleUserInfoProperties;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserInfo(){
        return simpleUserInfoProperties.toString();
    }
}
