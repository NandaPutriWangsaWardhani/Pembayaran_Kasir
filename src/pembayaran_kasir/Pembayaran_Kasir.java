/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaran_kasir;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pembayaran_Kasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah, harga = 0, total, pilihan,jlh_data;
        float diskon = 0;
        String peralatantulis,buku,i;
        Scanner input = new Scanner(System.in);
        
        System.out.println ("=== Pembayaran Kasir===");
        System.out.println("Daftar alat tulis dan Buku");
        System.out.println ("1. Pensil");
        System.out.println("2. Pulpen");
        System.out.println("3. Pengahapus");
        System.out.println ("4. Penggaris");
        System.out.println("5. Jangka");
        System.out.println("6. Rautan");
        System.out.println("7. Buku Gambar");
        System.out.println ("8. Buku Tulis");
        System.out.println("9. Lem");
        System.out.println ("10. Gunting");
        
        System.out.print("Inputkan Kode Barang : ");
        pilihan = input.nextInt();
        
        if (pilihan == 1){
            harga = 15000;
            System.out.println ("Harga : Rp " + harga);
        }else if (pilihan == 2){
            harga = 20000;
            System.out.println("Harga : Rp " + harga);
        }else if (pilihan == 3){
            harga = 10000;
            System.out.println("Harga : Rp " + harga);
        }else if (pilihan == 4){
            harga = 30000;
            System.out.println("Harga : Rp " + harga);
        }else if (pilihan == 5){
            harga = 10000;
            System.out.println("Harga : Rp " + harga);
        }else if (pilihan == 6){
            harga = 75000;
            System.out.println("Harga : Rp " + harga);  
        }else if (pilihan == 7){
            harga = 45000;
            System.out.println("Harga : Rp " + harga);
        }else if (pilihan == 8){
            harga = 23000;
            System.out.println("Harga : Rp " + harga);
        }else if (pilihan == 9){
            harga = 4300;
            System.out.println("Harga : Rp " + harga);
        }else if (pilihan == 10){
            harga = 9800;
            System.out.println("Harga : Rp " + harga);
        }
        System.out.print("Jumlah barang ? : ");
        jlh_data = input.nextInt();
            total = harga * jlh_data; 
            System.out.println("Anda harus membayar : Rp. " + total);
            if (total > 100000){
                diskon = (float) (0.1*total);
            }
            if (total > 200000){
                diskon = (float) (0.1*total);
            }
            if (total > 500000){
                diskon = (float) (0.1*total);
            }
            total = (int) (total-diskon);
            System.out.println (" Thank You ");
    }
    
}
