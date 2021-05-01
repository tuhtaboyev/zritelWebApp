package uz.billur.zritelWebApp.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.billur.zritelWebApp.dao.HisobotDao;
import uz.billur.zritelWebApp.model.Hisobot;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class HisobotDaoImpl implements HisobotDao {
    @Autowired
    private DbManagerImpl con;

    PreparedStatement psmt;
    ResultSet rs;
    @Override
    public List<Hisobot> ListHisobot() throws IOException, SQLException {
        List<Hisobot> hisobotlar = new ArrayList<>();
        psmt = con.MySqlAloqa().prepareStatement("SELECT * FROM videonab.umumiy");
        rs = psmt.executeQuery();
        while (rs.next()){
            Hisobot hisobot = new Hisobot();
            hisobot.setId(rs.getInt("ID"));
            hisobot.setOfis(rs.getString("Ofis"));
            hisobot.setJoylashishi(rs.getString("Joylashishi"));
            hisobot.setCompany(rs.getString("Companiya"));
            hisobot.setModelKam(rs.getString("ModelKam"));
            hisobot.setNomlanishi(rs.getString("Nomlanishi"));
            hisobot.setOlchovi(rs.getString("Olchovi"));
            hisobot.setSoni(rs.getDouble("Soni"));
            hisobot.setSana(rs.getDate("OrnatilganSana"));
            hisobotlar.add(hisobot);
        }
        rs.close();
        psmt.close();
        return hisobotlar;
    }

    public static void main(String[] args) throws IOException, SQLException {
        List list = new HisobotDaoImpl().ListHisobot();

        System.out.println(list);
    }

}
