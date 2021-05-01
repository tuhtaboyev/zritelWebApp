package uz.billur.zritelWebApp.dao;

import java.io.IOException;
import java.sql.Connection;

public interface DbManager {
    public Connection MySqlAloqa() throws IOException;
}
