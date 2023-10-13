/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

import java.util.Scanner;

/**
 *
 * @author PRADYA
 */
public class Tugas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      
//      NO 1
//        String n = input.nextLine();
//        
//        int x = input.nextInt();
//        int y = input.nextInt();
//        
//        System.out.println(n.substring(x, y));
        
//      NO 2        
//         String str1 = input.nextLine();
//         String str2 = input.nextLine();
//         
//         if (str1.contains(str2)){
//             System.out.println("YA");
//         }else{
//             System.out.println("TIDAK");
//         }
        
         
//      NO 3
        int n = input.nextInt();
        input.nextLine(); 
        
        String penggabung = "";

        for (int i = 0; i < n; i++) {
            String str = input.nextLine();

            penggabung += str + " ";
        }

        System.out.println(penggabung);
    }
    
}
        
