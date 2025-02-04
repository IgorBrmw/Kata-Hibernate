package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserDao userDao = new UserDaoHibernateImpl(new Util());
        userDao.createUsersTable();
        userDao.saveUser("Name1", "LastName1", (byte) 23);
        userDao.saveUser("Name2", "LastName2", (byte) 19);
        userDao.saveUser("Name3", "LastName3", (byte) 46);
        userDao.saveUser("Name4", "LastName4", (byte) 39);

        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
