/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int angka = 5;
//        double angkaDouble = 2.5;
//        float angkaFloat = 2.5f;
//        long angkaLong = 20L;
//        
//        System.out.println(angka);
//        System.out.println(angkaDouble);
//        System.out.println(angkaFloat);
//        System.out.println(angkaLong);
//        
//        char karakter = 'c';
//        String kata = "ilkomp";
//        
//        System.out.println(karakter);
//        System.out.println(kata);
//        
//        boolean kondisi = true;
//        System.out.println(kondisi);
//        
//        double fromInt = angka;
//        int fromDouble = (int) angkaDouble;
//        System.out.println(fromInt);
//        System.out.println(fromDouble);
        

        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Tahun Angkatan: ");
//        int tahun = input.nextInt();
//        input.nextLine();
//        System.out.println("Nama: ");
//        String nama = input.nextLine();
//        System.out.println("Alamat: ");
//        String alamat = input.nextLine();
//        System.out.println("");
//        System.out.println("Nama            : " + nama);
//        System.out.println("Tahun Angkatan  : " + tahun);
//        System.out.println("Alamat          : " + alamat);
        
        String nama =JOptionPane.showInputDialog("input nama anda");
        String npm =JOptionPane.showInputDialog("input npm anda");
        JOptionPane.showMessageDialog(null, "Hello" + nama);
        JOptionPane.showMessageDialog(null, "Hello" + npm);
    }
    
