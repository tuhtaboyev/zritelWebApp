package uz.billur.zritelWebApp.dao;

import uz.billur.zritelWebApp.model.Ofise;
import uz.billur.zritelWebApp.model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface OfiseDao {

    // Jadvaldagi hamma malumotni o'qishi uchun
    public List<Ofise> ListOfise() throws IOException, SQLException;

    // Jadvaldagi bitta malumotni o'qishi uchun
    public Ofise ShowOfise(Ofise ofise) throws IOException, SQLException;

    // Jadvalga yozish uchun
    public boolean SaveOfise(Ofise ofise) throws IOException, SQLException;

    // Jadvaldagi malumotni o'zgartirish uchun
    public void UpdateOfise(Ofise updatedOfise) throws IOException, SQLException;

    // Jadvaldagi malumotni o'chirish uchun
    public void DeleteOfise(Ofise ofise) throws IOException, SQLException;


}
