package uz.billur.zritelWebApp.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import uz.billur.zritelWebApp.dao.OfiseDao;
import uz.billur.zritelWebApp.model.Ofise;
import uz.billur.zritelWebApp.model.User;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfiseDaoImp implements OfiseDao {
    @Autowired
    private DbManagerImpl con;
    PreparedStatement psmt;
    ResultSet rs;


    @Override
    public List<Ofise> ListOfise() throws IOException, SQLException {
        List<Ofise> ofises = new ArrayList<>();
        psmt = con.MySqlAloqa().prepareStatement("SELECT * FROM videonab.users");
        rs = psmt.executeQuery();
        while (rs.next()){
            Ofise ofise = new Ofise();
            ofise.setId(rs.getInt("idofise_tab"));
            ofise.setName(rs.getString("name_ofise"));
            ofises.add(ofise);
        }
        rs.close();
        psmt.close();
        con.MySqlAloqa().close();
        return ofises;
    }

    @Override
    public Ofise ShowOfise(Ofise ofise) throws IOException, SQLException {
        return null;
    }

    @Override
    public boolean SaveOfise(Ofise ofise) throws IOException, SQLException {
        return false;
    }

    @Override
    public void UpdateOfise(Ofise updatedOfise) throws IOException, SQLException {

    }

    @Override
    public void DeleteOfise(Ofise ofise) throws IOException, SQLException {

    }
}
