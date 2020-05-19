package service;

import dao.UserDao;
import dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    //这样写不利于扩展和修改
//    private UserDao userDao = new UserDaoImpl();

    //把权限交给客户端
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
