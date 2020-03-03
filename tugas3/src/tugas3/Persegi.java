package tugas3;

public abstract class Persegi implements BangunDatar{
    private double sisi = 10;
    public Persegi() {
        this.sisi = sisi;
    }

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void Luas() {
        System.out.print(sisi*sisi);
    }

    @Override
    public void Keliling() {
        System.out.print(4*sisi);
    }
    
}
