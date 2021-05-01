package uz.billur.zritelWebApp.dao;
import uz.billur.zritelWebApp.model.Hisobot;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface HisobotDao {
    public List<Hisobot> ListHisobot() throws IOException, SQLException;
}
