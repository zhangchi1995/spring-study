package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import user.User;

//它也会被注册到spring容器中被托管，因为他本身就是一个@Component
// @Configuration代表这是一个配置类，相当于beans.xml
@Configuration
public class MyConfig {

    //注册一个bean，相当于<bean>标签
    //这个方法的名字，相当于<bean>标签中的id属性
    //这个方法的返回值，相当于<bean>标签中的class属性
    @Bean
    public User getUser(){
        return new User();
    }
}