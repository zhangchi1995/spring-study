import config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import user.User;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类的方法去做，那只能通过AnnotationConfigApplicationContext来获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = context.getBean("getUser",User.class);

        System.out.println(user.getName());
    }
}
