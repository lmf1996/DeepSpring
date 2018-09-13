package cn.lmf.common.server.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user")
public class SimpleUserInfoProperties {
    private String name;
    private String age;

    public String getMyName() {
        return name;
    }

    public void setMyName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleUserInfoProperties{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
