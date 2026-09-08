package model;

public class Narapidana {
    private String idNapi;
    private String nama;
    private String kasus;
    private int masaTahanan;
    private String nomorSel;
    
    public Narapidana(String idNapi, String nama, String kasus, int masaTahanan, String nomorSel) {
        this.idNapi = idNapi;
        this.nama = nama;
        this.kasus = kasus;
        this.masaTahanan = masaTahanan;
        this.nomorSel = nomorSel;
    }
    
    public String getIdNapi() {
        return idNapi;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getKasus() {
        return kasus;
    }
    
    public int getMasaTahanan() {
        return masaTahanan;
    }
    
    public String getNomorSel() {
        return nomorSel;
    }
    
    public void setNomorSel(String nomorSel) {
        this.nomorSel = nomorSel;
    }
    
}
