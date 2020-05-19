import dao.UserDaoMysqlImpl;
import dao.UserDaoOracleImpl;
import dao.UserDaoSqlserverImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceImpl;

public class MyTest {
    public static void main(String args[]){
        //获取ApplicationContext，拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = (UserService) context.getBean("serviceImpl");

        userService.getUser();
    }
}
