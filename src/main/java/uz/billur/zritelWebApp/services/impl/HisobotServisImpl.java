package uz.billur.zritelWebApp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.billur.zritelWebApp.dao.HisobotDao;
import uz.billur.zritelWebApp.model.Hisobot;
import uz.billur.zritelWebApp.services.HisobotServis;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Component
public class HisobotServisImpl implements HisobotServis {

    @Autowired
    private HisobotDao hisobotDao;

    @Override
    public List<Hisobot> ListHisobot() throws IOException, SQLException {
        return hisobotDao.ListHisobot();
    }
}
