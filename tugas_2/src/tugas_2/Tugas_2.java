/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tugas_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Advie Rifaldy
 */
public class Tugas_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BufferedReader datain = new BufferedReader (new InputStreamReader(System.in));
        double a = 0, t = 0;
        System.out.print("Masukan alas segitiga : ");
        
        try {
            a = Double.parseDouble(datain.readLine());
            System.out.print("Masukan tinggi segitiga : ");
            t = Double.parseDouble(datain.readLine());
        }catch(IOException e){
            System.out.println("error");
        }
        
        System.out.println("Luas segitiga tersebut = " + a * t / 2);
    }
    
}


///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package tugas_2;
//
//import java.util.Scanner;
//
///**
// *
// * @author Advie Rifaldy
// */
//public class Tugas_2 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//
//        Scanner datain = new Scanner(System.in);
//        int i = 0;
//        System.out.print("Masukan bilangan : ");
//
//        i = datain.nextInt();
//
//        if (i % 2 == 1) {
//            System.out.println(i + " Adalah bilangan ganjil");
//        } else {
//            System.out.println(i + " Adalah bilangan genap");
//        }
//    }
//
//}
