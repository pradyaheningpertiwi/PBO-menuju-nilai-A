/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoripbo;

import java.util.Scanner;

/**
 *
 * @author PRADYA
 */
public class TeoriPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
    
    
        System.out.println("Masukan nilai : ");
        int nilai = input.nextInt();
        char huruf_mutu;
        
        if(nilai >= 76){
            huruf_mutu = 'A';
        }else if(nilai >= 71){
            huruf_mutu = 'B';
        }else if(nilai >= 66){
            huruf_mutu = 'C';
        }else{
            huruf_mutu = 'D';
        }
    
        
        switch(huruf_mutu){
            case 'A':
                System.out.println("Unggul");
                
            case 'B':
                System.out.println("Baik");
                
            case 'C':
                    System.out.println("Cukup");
                
            case 'D' :
                System.out.println("Kurang");
                
            default:
                System.out.println("huruf mutu tidak sesuai");
        }
    }
