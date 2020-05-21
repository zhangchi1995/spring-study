package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 相当于 <bean id="user" class="pojo.User" />
// @Component 组件
@Component
@Scope("singleton")
public class User {

    @Value("张驰")
    public String name;
}
