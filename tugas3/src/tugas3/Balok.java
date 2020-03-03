/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

public class Balok extends PersegiPanjang implements BangunDatar{
    private double volume;
    private double tinggi = 6;

    public Balok(double volume, double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.volume = volume;
        this.tinggi = tinggi;
    }

    public Balok(double volume, double tinggi) {
        this.volume = volume;
        this.tinggi = tinggi;
    }

    public Balok() {
        this.volume = volume;
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return volume;
    }
    
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public void hlVolume(){
        volume = tinggi * super.getLebar() * super.getPanjang();
        System.out.println(volume);
    }
}
