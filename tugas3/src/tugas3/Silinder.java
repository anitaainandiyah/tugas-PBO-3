package tugas3;
import java.lang.reflect.Field;

public class Silinder extends Lingkaran implements BangunDatar{
    private double volume;
    private double tinggi = 5;
   
    public Silinder() {
        this.volume = volume;
        this.tinggi = tinggi;
    }

    public Silinder(double volume, double r, double pi) {
        super(r, pi);
        this.volume = volume;
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
    
    public void hsVolume(){
        volume = super.getPi()*super.getR()*super.getR()*super.getR()*tinggi;
        System.out.println(volume);
    }
    
}
