package uz.billur.zritelWebApp.services;

import uz.billur.zritelWebApp.model.Hisobot;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface HisobotServis {
    public List<Hisobot> ListHisobot() throws IOException, SQLException;
}
