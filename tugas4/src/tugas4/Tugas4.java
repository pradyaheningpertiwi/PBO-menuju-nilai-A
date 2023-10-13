/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PRADYA
 */
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
//        Scanner input = new Scanner(System.in);
//        
//        int angka = input.nextInt();
//        int n[] = new int[angka];
//        
//         int jumlah = 0;
//        for(int i = 0; i < n.length ; i++){
//            n[i] = input.nextInt();
//          
//           jumlah = jumlah + n[i];
//              
//        }
//        System.out.println(jumlah + " ");
        
//        Scanner input = new Scanner(System.in);
//        
//        int angka = input.nextInt();
//        int n[] = new int[angka];
//        
//         
//        for(int i = 0; i < n.length ; i++){
//            n[i] = input.nextInt();
//        
//        }
//        for(int i = 0; i < n.length - 1; i++){
//            for(int j = 0; j < n.length - i - 1; j++){
//                if (n[j] > n[j + 1]){
//                    int temp = n[j];
//                    n[j] = n[j + 1];
//                    n[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < n.length; i++) {
//            System.out.print(n[i]);
//            if (i < n.length - 1) {
//                System.out.print(" ");
//            }
//        }
        
        Scanner input = new Scanner(System.in);
        
        int angka = input.nextInt();
        int n[] = new int[angka];
        
         int jumlah = 0;
        for(int i = 0; i < n.length ; i++){
            n[i] = input.nextInt();
          
           jumlah = jumlah + n[i];
              
        }
        int x = input.nextInt();
        
        boolean temukan = false;
        for(int i = 0; i < n.length; i++){
            if (n[i] == x) {
                temukan = true;
                break;
            }
        }
        if(temukan){
            System.out.println("Nilai ditemukan");
        }else{
            System.out.println("Nilai tidak ditemukan");
        }
        
    
    }   
       
}