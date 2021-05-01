package uz.billur.zritelWebApp.dao;

import uz.billur.zritelWebApp.model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public boolean chekLogin(User user) throws IOException, SQLException;
    // Jadvaldagi hamma malumotni o'qishi uchun
    public List<User> ListUser() throws IOException, SQLException;

    // Jadvaldagi bitta malumotni o'qishi uchun
    public User ShowUser(User user) throws IOException, SQLException;

    // Jadvalga yozish uchun
    public boolean SaveUser(User user) throws IOException, SQLException;

    // Jadvaldagi malumotni o'zgartirish uchun
    public void UpdateUser(User updatedUser) throws IOException, SQLException;

    // Jadvaldagi malumotni o'chirish uchun
    public void DeleteUser(User user) throws IOException, SQLException;

}
