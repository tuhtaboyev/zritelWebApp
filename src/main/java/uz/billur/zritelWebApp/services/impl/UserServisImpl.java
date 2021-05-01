package uz.billur.zritelWebApp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.billur.zritelWebApp.dao.UserDao;
import uz.billur.zritelWebApp.model.User;
import uz.billur.zritelWebApp.services.UserServis;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Component
public class UserServisImpl implements UserServis{
    @Autowired
    private UserDao userDao;

    @Override
    public boolean chekLogin(User user) throws IOException, SQLException {
        return userDao.chekLogin(user);
    }

    @Override
    public List<User> ListUser() throws IOException, SQLException {
        return userDao.ListUser();
    }

    @Override
    public User ShowUser(User user) throws IOException, SQLException {
        return userDao.ShowUser(user);
    }

    @Override
    public boolean SaveUser(User user) throws IOException, SQLException {
        return userDao.SaveUser(user);
    }

    @Override
    public void UpdateUser(User updatedUser) throws IOException, SQLException {
        userDao.UpdateUser(updatedUser);
    }

    @Override
    public void DeleteUser(User user) throws IOException, SQLException {
        userDao.DeleteUser(user);
    }

}
