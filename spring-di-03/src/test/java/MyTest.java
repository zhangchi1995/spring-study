import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;
import pojo.User;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");

        System.out.println(user.toString());

        //  p 命名空间

        context = new ClassPathXmlApplicationContext("studentBeans.xml");

        Student student = context.getBean("student",Student.class);

        System.out.println(student.toString());
    }
}
