/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author naura
 */
public class SetterGetter {
    //atribut
    private String Username, Password, Nama, TahunMasuk, Tanggall, JenisKelamin, Goldar, Keterangan, Umur, Tinggi;
    
    //setter
    protected void setUsername (String Username) {
        this.Username = Username;
    }
    protected void setPassword (String Password) {
        this.Password = Password;
    }
    public void setNama (String Nama) {
        this.Nama = Nama;
    }
    public void setTahunMasuk (String TahunMasuk) {
        this.TahunMasuk = TahunMasuk;
    }
    public void setTanggall (String Tanggall){
        this.Tanggall = Tanggall;
    }
    public void setJenisKelamin (String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }
    public void setGoldar (String Goldar){
        this.Goldar = Goldar;
    }
    public void setKeterangan (String Keterangan){
        this.Keterangan = Keterangan;
    }
    public void setUmur (String Umur){
        this.Umur = Umur;
    }
    public void setTinggi(String Tinggi){
        this.Tinggi = Tinggi;
    }
    
    //getter
    protected String getUsername(){
        return Username;
    }
    protected String getPassword() {
        return Password;
    }
    public String getNama(){
        return Nama;            
    }
    public String getTahunMasuk (){
        return TahunMasuk;
    }
    public String getTanggall (){
        return Tanggall;
    }
    public String getJenisKelamin (){
        return JenisKelamin;
    }
    public String getGoldar (){
        return Goldar;
    }
    public String getKeterangan(){
        return Keterangan;
    }
    public String getUmur(){
        return Umur;
    }
    public String getTinggi(){
        return Tinggi;
    }
}
