/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.*;

/**
 *
 * @author dell
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih, ulang;
        float p, l, t, r;
        double lpBalok, vBalok, lPersegiPjg, kPersegiPjg;
        double lpTabung, vTabung, lLingkaran, kLingkaran;
        do{
            System.out.println("========");        
            System.out.println("Menu");
            System.out.println("========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
        
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih : ");
            pilih = input.nextInt();
        
            if(pilih == 1){
                System.out.print("Masukkan panjang : ");
                p = input.nextFloat();
                System.out.print("Masukkan lebar : ");
                l = input.nextFloat();
                System.out.print("Masukkan tinggi : ");
                t = input.nextFloat();

                Balok balok = new Balok(p, l, t);
                vBalok = balok.volume();
                System.out.println("\nBalok");
                System.out.println("Volume : "+vBalok);
                lpBalok = balok.luasPermukaan();
                System.out.println("Luas Permukaan : "+lpBalok);

                PersegiPanjang persegiPanjang = new PersegiPanjang(p, l);
                kPersegiPjg = persegiPanjang.keliling();
                System.out.println("\nPersegi Panjang");
                System.out.println("Keliling : "+kPersegiPjg);
                lPersegiPjg = persegiPanjang.luas();
                System.out.println("Luas : "+lPersegiPjg);
            }else if(pilih == 2){
                System.out.println("phi : "+Math.PI);
                System.out.print("Masukkan jari-jari : ");
                r = input.nextFloat();
                System.out.print("Masukkan tinggi : ");
                t = input.nextFloat();
                
                Tabung tabung = new Tabung(r ,t);
                vTabung = tabung.volume();
                System.out.println("\nTabung");
                System.out.println("Volume : "+vTabung);
                lpTabung = tabung.luasPermukaan();
                System.out.println("Luas Permukaan : "+lpTabung);

                Lingkaran lingkaran = new Lingkaran(r);
                kLingkaran = lingkaran.keliling();
                System.out.println("\nLingkaran");
                System.out.println("Keliling : "+kLingkaran);
                lLingkaran = lingkaran.luas();
                System.out.println("Luas : "+lLingkaran);
            }else if(pilih == 3){
                System.out.println("Program selesai....");
                System.exit(0);
            }else{
                System.out.println("Inputan Salah...");
            }
            System.out.print("ulang[1 = ya / 0 = tidak]? ");
            ulang = input.nextInt();
        }while(ulang == 1);
    }
}
