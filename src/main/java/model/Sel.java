package model;

public class Sel {
    private String nomorSel;
    private String blok;
    private int kapasitas;
    
    public Sel (String nomorSel, String blok, int kapasitas) {
        this.nomorSel = nomorSel;
        this.blok = blok;
        this.kapasitas = kapasitas;
    }
    
    public String getNomorSel() {
        return nomorSel;
    }
    
    public String getBlok() {
        return blok;
    }
    
    public int getKapasitas() {
        return kapasitas;
    }
   
}
