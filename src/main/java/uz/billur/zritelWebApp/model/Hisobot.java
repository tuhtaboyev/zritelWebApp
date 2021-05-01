package uz.billur.zritelWebApp.model;

import java.util.Date;

public class Hisobot {
    private int id;
    private String ofis;
    private String joylashishi;
    private String company;
    private String modelKam;
    private String nomlanishi;
    private String olchovi;
    private double soni;
    private Date sana;

    public Hisobot() {}

    public Hisobot(int id, String ofis, String joylashishi,
                   String company, String modelKam,
                   String nomlanishi, String olchovi,
                   double soni, Date sana) {
        this.id = id;
        this.ofis = ofis;
        this.joylashishi = joylashishi;
        this.company = company;
        this.modelKam = modelKam;
        this.nomlanishi = nomlanishi;
        this.olchovi = olchovi;
        this.soni = soni;
        this.sana = sana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOfis() {
        return ofis;
    }

    public void setOfis(String ofis) {
        this.ofis = ofis;
    }

    public String getJoylashishi() {
        return joylashishi;
    }

    public void setJoylashishi(String joylashishi) {
        this.joylashishi = joylashishi;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModelKam() {
        return modelKam;
    }

    public void setModelKam(String modelKam) {
        this.modelKam = modelKam;
    }

    public String getNomlanishi() {
        return nomlanishi;
    }

    public void setNomlanishi(String nomlanishi) {
        this.nomlanishi = nomlanishi;
    }

    public String getOlchovi() {
        return olchovi;
    }

    public void setOlchovi(String olchovi) {
        this.olchovi = olchovi;
    }

    public double getSoni() {
        return soni;
    }

    public void setSoni(double soni) {
        this.soni = soni;
    }

    public Date getSana() {
        return sana;
    }

    public void setSana(Date sana) {
        this.sana = sana;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                id,ofis,joylashishi,company,modelKam,nomlanishi,olchovi,soni,sana);
    }
}
