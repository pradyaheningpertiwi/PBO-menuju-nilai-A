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
public class TugasPrak7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("pradya", "2217051005", 88.0, 72.0, 60.0);
        mhs.hitungNA();
        mhs.printData("Ilmu komputer");
//        ArrayList<Double> nilai = new ArrayList<>();
//        nilai.add(88.0);
//        nilai.add(76.0);
//        nilai.add(96.0);
//        nilai.add(65.0);
//        mhs.hitungTugas(nilai);
//        System.out.println(mhs.getNilaiTugas());        
//        mhs.printData("Ilmu Komputer");
//        
//        mhs.setNama("laras");
//        System.out.println("");
//        mhs.printData("Kimia");
//        
//        System.out.println("");
//        
//        System.out.println(mhs.getNama());
    }
    
}
