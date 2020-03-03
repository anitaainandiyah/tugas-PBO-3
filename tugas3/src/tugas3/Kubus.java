package tugas3;

public class Kubus extends Persegi implements BangunDatar{
    private double volume;

    public Kubus(double volume) {
        this.volume = volume;
    }

    public Kubus(double volume, double sisi) {
        super(sisi);
        this.volume = volume;
    }

    
    public Kubus() {
        this.volume = volume;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void hVolume (){
        volume = super.getSisi()*super.getSisi()*super.getSisi();
        System.out.println(volume);
    }
}
