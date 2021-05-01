package uz.billur.zritelWebApp.dao.impl;

import org.springframework.stereotype.Component;
import uz.billur.zritelWebApp.dao.DbManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@Component
public class DbManagerImpl implements DbManager {
    String username = "root";
    String password = "Gl1758613";

    @Override
    public Connection MySqlAloqa() throws IOException {
        System.out.println("Ma'lumotlar Bazasiga ulanishni amalga oshirish ...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            FileInputStream manba= new FileInputStream("C:\\SQL.ini");
            Properties konf = new Properties();
            konf.load(manba);
            Connection connection = DriverManager.getConnection("jdbc:mysql://"+konf.getProperty("host")+
                    ":"+konf.getProperty("port")+"/"+konf.getProperty("DatabaseName")+
                    "?serverTimezone=UTC",username,password);
            System.out.println("Ma'lumotlar Bazasiga muvoffaqiyatli ulandi");
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException("Ma'lumotlar Bazasiga Ulanishda Hatolik", e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        new DbManagerImpl().MySqlAloqa();
    }
}
