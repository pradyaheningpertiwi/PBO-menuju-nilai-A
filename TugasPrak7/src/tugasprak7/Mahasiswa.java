/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak7;

import java.util.ArrayList;
/**
 *
 * @author PRADYA
 */
class Mahasiswa {
    private String nama;
    private String npm;
    private String jurusan;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;
    private double NA;


    public void printData(String jurusan){
         System.out.println("Nama\t : "+this.nama);
         System.out.println("NPM\t : "+this.npm);
         System.out.println("Jurusan\t : "+jurusan);
         System.out.println("Nilai tugas : "+this.nilaiTugas);
         System.out.println("Nilai UTS : "+this.nilaiUts);
         System.out.println("Nilai UAS : "+this.nilaiUas);    
         System.out.println("Nilai akhir : "+this.NA);
}

    public int sumValue (int x, int y){
        return x+y;
}

    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.NA = (this.nilaiTugas*0.3) + (this.nilaiUts*0.35) + (this.nilaiUas*0.35);
    }
    
    public void hitungNA(String pesan){
        System.out.println("Nilai tidak valid");
    }
    
    public void hitungNA(){
        this.NA = (this.nilaiTugas*0.3) + (this.nilaiUts*0.35) + (this.nilaiUas*0.35);
    }
    
    public void hitungTugas(ArrayList<Double> arrayNilai) {
    double total = 0;
    for (int i = 0; i < arrayNilai.size(); i++) {
        double n = arrayNilai.get(i); 
        total += n;
    }
    nilaiTugas = total / arrayNilai.size();
}
    

    public Mahasiswa(String nama, String npm, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.nama = nama;
        this.npm = npm;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }
    

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public double getNA() {
        return NA;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
    

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public void setNA(double NA) {
        this.NA = NA;
    }

    public void printData(){
         System.out.println("NPM : "+this.npm);
         System.out.println("Nama : "+this.nama);
         System.out.println("Nilai tugas : "+this.nilaiTugas);
         System.out.println("Nilai UTS : "+this.nilaiUts);
         System.out.println("Nilai UAS : "+this.nilaiUas);    
         System.out.println("Nilai akhir : "+this.NA);
    }
    
}