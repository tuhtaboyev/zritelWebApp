package uz.billur.zritelWebApp.model;

public class Ofise {
    private int  id;
    private String name;

    public Ofise(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Ofise() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,", id,name);
            }
}
