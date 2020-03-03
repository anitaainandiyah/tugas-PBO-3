package tugas3;

public abstract class Lingkaran implements BangunDatar{
    private double r = 21;
    private double pi = 3.14;
    public Lingkaran() {
        this.r = r;
        this.pi = 3.14;
    }

    public Lingkaran(double r, double pi) {
        this.r = r;
        this.pi = 3.14;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public void Luas() {
        System.out.println(pi*r*r);
    }

    @Override
    public void Keliling() {
        System.out.println(2*pi*r);
    }
}
