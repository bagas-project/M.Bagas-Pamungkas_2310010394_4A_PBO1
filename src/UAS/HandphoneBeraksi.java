
package UAS;

import java.util.Scanner;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Smartphone[] daftarHp = new Smartphone[3]; // Array
            int index = 0;
            
            System.out.println("=== Data Handphone ===");
            
            while (index < daftarHp.length) {
                try {
                    System.out.print("Masukkan Merek: ");
                    String merek = scanner.nextLine();
                    
                    System.out.print("Masukkan RAM (GB): ");
                    int ram = Integer.parseInt(scanner.nextLine());
                    
                    System.out.print("Masukkan Storage (GB): ");
                    int storage = Integer.parseInt(scanner.nextLine());
                    
                    System.out.print("Masukkan OS: ");
                    String os = scanner.nextLine();
                    
                    daftarHp[index] = new Smartphone(merek, ram, storage, os);
                    index++;
                    
                    System.out.println("Data berhasil ditambahkan!\n");
                } catch (NumberFormatException e) {
                    System.out.println("Input angka tidak valid. Silakan coba lagi.\n"); // Error handling
                }
            }
            
            System.out.println("\n=== Daftar Handphone ===");
            for (Smartphone hp : daftarHp) {
                hp.tampilkanInfo();
                System.out.println("---");
                
                // Seleksi: tampilkan jika RAM di atas 4GB
                if (hp.getRam() > 4) {
                    System.out.println("Ini adalah handphone spek tinggi!\n");
                }
            }
        } // Array
    }
}

