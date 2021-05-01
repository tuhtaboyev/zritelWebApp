package uz.billur.zritelWebApp.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.billur.zritelWebApp.dao.UserDao;
import uz.billur.zritelWebApp.model.User;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao{
    @Autowired
    private DbManagerImpl con;
    PreparedStatement psmt;
    ResultSet rs;

    @Override
    public boolean chekLogin(User user) throws IOException, SQLException {
        psmt = con.MySqlAloqa().prepareStatement("SELECT * FROM videonab.users WHERE name_user = ? AND pass_user = ?");
        psmt.setString(1, user.getName());
        psmt.setString(2,user.getPass());
        rs = psmt.executeQuery();
        while (rs.next()){
            return true;
        }
        rs.close();
        psmt.close();
        con.MySqlAloqa().close();
        return false;
    }

    @Override
    public List<User> ListUser() throws IOException, SQLException {
        List<User> users = new ArrayList<>();
        psmt = con.MySqlAloqa().prepareStatement("SELECT * FROM videonab.users");
        rs = psmt.executeQuery();
        while (rs.next()){
           User user = new User();
            user.setId(rs.getInt("idUSERS"));
            user.setName(rs.getString("name_user"));
            user.setPass(rs.getString("pass_user"));
            users.add(user);
        }
        rs.close();
        psmt.close();
        con.MySqlAloqa().close();
        return users;
    }

    @Override
    public User ShowUser(User user) throws IOException, SQLException {
        User userid = new User();
        psmt = con.MySqlAloqa().prepareStatement("SELECT * FROM videonab.users WHERE videonab.users.idusers =?");
        psmt.setInt(1,user.getId());
        rs = psmt.executeQuery();
        while (rs.next()){

            userid.setId(rs.getInt("idUSERS"));
            userid.setName(rs.getString("name_user"));
            userid.setPass(rs.getString("pass_user"));

        }
        rs.close();
        psmt.close();
        con.MySqlAloqa().close();
        return userid;
    }

    @Override
    public boolean SaveUser(User user) throws IOException, SQLException {
        psmt = con.MySqlAloqa().prepareStatement("INSERT INTO videonab.users (name_user, pass_user) VALUE (?,?)");
        psmt.setString(1,user.getName());
        psmt.setString(2,user.getPass());
        psmt.executeUpdate();
        psmt.close();
        con.MySqlAloqa().close();
        return true;
        }

    @Override
    public void UpdateUser(User updatedUser) throws IOException, SQLException {
        psmt = con.MySqlAloqa().prepareStatement("UPDATE videonab.users u SET u.name_user = ?," +
                " u.pass_user = ? WHERE u.idusers = ?");
        psmt.setString(1,updatedUser.getName());
        psmt.setString(2,updatedUser.getPass());
        psmt.setInt(3,updatedUser.getId());
        psmt.executeUpdate();
        psmt.close();
        con.MySqlAloqa().close();

    }

    @Override
    public void DeleteUser(User user) throws IOException, SQLException {
        psmt = con.MySqlAloqa().prepareStatement("DELETE FROM videonab.users WHERE " +
                "videonab.users.idusers = ?");
        psmt.setInt(1,user.getId());
        psmt.executeUpdate();
        psmt.close();
        con.MySqlAloqa().close();

    }


    public static void main(String[] args) throws IOException, SQLException {

    }

}
