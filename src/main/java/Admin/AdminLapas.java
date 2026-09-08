package admin;

import model.Narapidana;
import model.Sel;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class AdminLapas {
    private ArrayList<Narapidana> daftarNarapidana;
    private ArrayList<Sel> daftarSel;
    
    private Scanner scanner;
    
    public AdminLapas(Scanner scanner) {
        this.daftarNarapidana = new ArrayList <>();
        this.daftarSel = new ArrayList<>();
        this.scanner = scanner;
    }
    
    //CREATE
    public void tambahNarapidana() {
        System.out.println();
        System.out.print("ID Narapidana Baru: ");
        String id = scanner.nextLine();
    
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Kasus: ");
        String kasus = scanner.nextLine();
        
        System.out.print("Masa Tahanan(bulan): ");
        int masaTahanan = scanner.nextInt();
        scanner.nextLine();

        
        System.out.print("Nomor Sel: ");
        String nomorSel = scanner.nextLine();
        
        Narapidana napiBaru = new Narapidana(id, nama, kasus, masaTahanan, nomorSel);
        
        daftarNarapidana.add(napiBaru);
        
        System.out.println("Data Narapidana berhasil ditambahkan.");
    }
    
    //READ (Napi)
    public void tampilkanNarapidana() {
        System.out.println();
        System.out.println("------ DAFTAR NARAPIDANA ------");
        for (int i = 0; i < daftarNarapidana.size(); i++) {
            Narapidana n = daftarNarapidana.get(i);
            System.out.println("ID Narapidana   : " + n.getIdNapi());
            System.out.println("Nama            : " + n.getNama());
            System.out.println("Kasus           : " + n.getKasus());
            System.out.println("Masa Tahanan    : " + n.getMasaTahanan());
            System.out.println("Nomor Sel       : " + n.getNomorSel());
            System.out.println("-------------------------------");
        }
    }
    
    
    //DELETE
    public void hapusNarapidana() {
        System.out.println();
        System.out.print("Masukan ID Narapidana: ");
        String idTarget = scanner.nextLine();
        boolean ditemukan = false;
        
        for (int i = 0; i < daftarNarapidana.size(); i++) {
            if (daftarNarapidana.get(i).getIdNapi().equals(idTarget)) {
                daftarNarapidana.remove(i);
                System.out.println("Data Narapidana berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if(!ditemukan) {
            System.out.println("ID Narapidana tidak ditemukan.");
        }
    }
    
    //UPDATE
    public void updateNomorSel() {
        System.out.println();
        System.out.print("Masukan ID Narapidana:");
        String idTarget = scanner.nextLine();
        boolean ditemukan = false;
        
        for (Narapidana n : daftarNarapidana) {
            if (n.getIdNapi().equals(idTarget)) {
                System.out.print("Nomor Sel Baru: ");
                String selBaru = scanner.nextLine();
                n.setNomorSel(selBaru);
                System.out.println("Nomor sel berhasil diperbarui.");
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("ID Narapidana tidak ditemukan.");
        }
    }
    
    //READ (Sel)
    public void tampilkanSel() {
        System.out.println();
        System.out.println("------ DAFTAR SEL ------");
        for (Sel s : daftarSel) {
            System.out.println("Nomor Sel : " + s.getNomorSel());
            System.out.println("Blok      : " + s.getBlok());
            System.out.println("Kapasitas : " + s.getKapasitas());
            System.out.println("------------------------");
        }
    }
    
    //Data awal Sel
    public void tambahSel(String nomorSel, String blok, int kapasitas) {
        daftarSel.add(new Sel(nomorSel, blok, kapasitas));
    }
    
    //Data awal Napi
    public void tambahNarapidana(String id, String nama, String kasus, int masaTahanan, String nomorSel) {
        daftarNarapidana.add(new Narapidana(id, nama, kasus, masaTahanan, nomorSel));
        
    }
        
}
