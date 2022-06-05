package model;
public class Tabung {
    public double r;
    public double T;
        public final double PI = 22.0/7;
    public double hitungLuasSelimut()
    {
        double LS = 2 * PI * r * T;
        return LS;        
    }
    public double hitungLuasPermukaan()
    {
        double LP = hitungLuasSelimut() + (2 * PI * Math.pow(r , 2));
        return LP;
    }
    public void tampilkanLS()
    {
        System.out.println("Luas Selimut Tabung = " + hitungLuasSelimut());
    }
    public void tampilkanLP()
    {
        System.out.println("Luas Permukaan Tabung = " + hitungLuasPermukaan());
    }
}