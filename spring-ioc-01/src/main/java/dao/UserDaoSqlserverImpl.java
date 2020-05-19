package dao;

public class UserDaoSqlserverImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("sqlserver获取用户数据");
    }
}
