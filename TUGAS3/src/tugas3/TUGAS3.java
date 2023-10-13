/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author PRADYA
 */
public class TUGAS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport java.util.Scanner;
    Scanner input = new Scanner(System.in);

         String npm;
        do {
            System.out.print("Masukkan NPM: ");
            npm = input.nextLine();
            if (!npm.equals("2217051005")) {
                System.out.println("NPM Salah. Silakan coba lagi.");
            }
        } while (!npm.equals("2217051005"));
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 76) {
            System.out.println("A");
        } else if (nilai >= 71 && nilai < 76) {
            System.out.println("B+");
        } else if (nilai >= 66 && nilai < 71) {
            System.out.println("B");
        } else if (nilai >= 61 && nilai < 77) {
            System.out.println("C+");
        } else if (nilai >= 56 && nilai < 61) {
            System.out.println("C");
        } else if (nilai >= 50 && nilai < 56) {
            System.out.println("D");
        } else if (nilai < 50) {
            System.out.println("E");
        } else if (nilai > 100 || nilai < 0) {
            System.out.println("Nilai Melebihi Range");
        }
    }
}

