package tugas3;

public abstract class Segitiga implements BangunDatar{
    private double alas = 10;
    private double tinggi = 20;
    private double sisi = 20; // asumsi sisi dari alas 
    public Segitiga() {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    
    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void Luas() {
        System.out.println((alas*tinggi)/2);
    }

    @Override
    public void Keliling() {
        System.out.print(sisi+sisi+sisi);
    }
    
}
