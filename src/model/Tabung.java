package model;
public class Tabung {
    public double r = 14.0;
    public double T = 15.0;
    public double LS = 0;
    public double LP = 0;
    public final double PI = 22.0/7;
    public double hitungLuasSelimut()
    {
        /*System.out.println("Nilai dari jari-jari tabung (r) = " + r +" cm");
        System.out.println("Nilai dari tinggi tabung (T) = " + T +" cm");
        System.out.println("Nilai dari pi = " + PI);*/
        double LS = 2 * PI * r * T;
        return LS;        
    }
    public double hitungLuasPermukaan()
    {
        double LP = LS + (2 * PI * Math.pow(r , 2));
        return LP;
    }
    public void tampilkanLS()
    {
        System.out.println("\nLuas Selimut Tabung = " + LS);
    }
    public void tampilkanLP()
    {
        System.out.println("Luas Permukaan Tabung = " + LP);
    }
}