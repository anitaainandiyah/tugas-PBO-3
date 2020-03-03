package tugas3;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
       Scanner scint = new Scanner (System.in);
       PersegiPanjang pp = new PersegiPanjang() {};
       Persegi p = new Persegi () {};
       Lingkaran l = new Lingkaran () {};
       Segitiga  s = new Segitiga () {};
       Kubus k = new Kubus ();
       Silinder si = new Silinder ();
       Balok bl = new Balok();
       int menu;
       System.out.print("1. Persegi Panjang\n" +
                          "2. Lingkaran \n"+
                          "3. Persegi \n"+
                          "4. Segitiga \n"+
                          "5. Kubus \n"+
                          "6. Silinder \n"+
                          "7. Balok \n");
       System.out.print("Pilihan :");
       menu = scint.nextInt();
           if (menu == 1){
               System.out.print("Luas :");
               pp.Luas();
               System.out.print("Keliling :");
               pp.Keliling();
           }
           else if (menu == 2){
               System.out.print("Luas :");
               l.Luas();
               System.out.print("Keliling :");
               l.Keliling();
           }
           else if (menu == 3){
               System.out.print("Luas :");
               p.Luas();
               System.out.print("Keliling :");
               p.Keliling();
           }
           else if (menu == 4){
               System.out.print("Luas :");
               s.Luas();
               System.out.print("Keliling :");
               s.Keliling();
           }
           else if (menu == 5){
               System.out.print("Volume :");
               k.hVolume();
           }
           else if (menu == 6){
               System.out.print("Volume :");
               si.hsVolume();
           }
           else if (menu == 7){
               System.out.print("Volume :");
               bl.hlVolume();
           }
    }
}
