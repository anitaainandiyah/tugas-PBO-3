package tugas3;

public abstract class PersegiPanjang implements BangunDatar{
    private double panjang = 5;
    private double lebar = 5;
   
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public PersegiPanjang() {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public void Luas() {
        System.out.println(panjang * lebar);
    }

    @Override
    public void Keliling() {
        System.out.print((2*panjang) + (2*lebar));
    }
    
}
