package com.mycompany.lapas;

import admin.AdminLapas;
import java.util.Scanner;
        

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        AdminLapas admin = new AdminLapas(scanner);
        
        admin.tambahNarapidana("N001", "Galeh Pramudi", "Penipuan", 12, "A1");
        admin.tambahNarapidana("N002", "Glen Allen", "Pencurian", 8, "A2");
        
        admin.tambahSel("A1", "Blok A", 4);
        admin.tambahSel("A2", "Blok A", 4);
        admin.tambahSel("A3", "Blok A", 4);
        
        boolean berjalan = true;
        
        while (berjalan) {
            System.out.println("\n==========================================");
            System.out.println("      SISTEM PENGELOLAAN DATA NARAPIDANA");
            System.out.println("==========================================");
            System.out.println("1. Tampilkan Narapidana");
            System.out.println("2. Tampilkan Sel");
            System.out.println("3. Tambah Narapidana");
            System.out.println("4. Update Sel Narapidana");
            System.out.println("5. Hapus Narapidana");
            System.out.println("6. keluar");
            System.out.print("Pilih menu (1-6): "); 
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1 -> admin.tampilkanNarapidana();
                case 2 -> admin.tampilkanSel();
                case 3 -> admin.tambahNarapidana();
                case 4 -> admin.updateNomorSel();
                case 5 -> admin.hapusNarapidana();
                case 6 -> {
                    System.out.println("");
                    System.out.println("Keluar dari program...");
                    berjalan = false;
                }
                default -> System.out.println("Pilihan tidak valid.");
                
            }
        }
        scanner.close();
    }
}
