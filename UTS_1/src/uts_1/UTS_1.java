/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_1;

/**
 *
 * @author Advie Rifaldy
 */
import java.util.Scanner;

public class UTS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukan jumlah buku yang akan dicatat : ");
        int jumlah = input.nextInt();
        
        String[] judul = new String[jumlah];
        int[] stock = new int[jumlah];
        int[] tahun = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan judul buku ke-" + (i+1) + " : ");
            judul[i] = input2.nextLine();
            System.out.print("Masukan stok buku ke-" + (i+1) + " : ");
            stock[i] = input.nextInt();
            System.out.print("Masukan tahun terbit buku ke-" + (i+1) + " : ");
            tahun[i] = input.nextInt();
        }
        
        System.out.printf("\n| %-20s | %-10s | %-10s | \n", "Judul", "Stok", "Tahun");
        for(int i = 0; i < jumlah; i++) {
            System.out.printf("\n| %-20s | %-10s | %-10s | \n", judul[i], stock[i], tahun[i]);
        }
//        int n = 5;
//        for (int i = 0; i <= n; i++) {
//            for(int j = 0; j< i; j++) {
//                System.out.print("^ ");
//            }
//            System.out.println();
//        }
    }
}



//        Scanner input = new Scanner(System.in);
//        Scanner input2 = new Scanner(System.in);
//        System.out.print("Masukan jumlah buku yang akan dicatat : ");
//        int jumlah = input.nextInt();
//        
//        String[] judul = new String[jumlah];
//        int[] stock = new int[jumlah];
//        int[] tahun = new int[jumlah];
//        
//        for (int i = 0; i < jumlah; i++) {
//            System.out.print("Masukan judul buku ke-" + (i+1) + " : ");
//            judul[i] = input2.nextLine();
//            System.out.print("Masukan stok buku ke-" + (i+1) + " : ");
//            stock[i] = input.nextInt();
//            System.out.print("Masukan tahun terbit buku ke-" + (i+1) + " : ");
//            tahun[i] = input.nextInt();
//        }
//        
//        System.out.printf("\n| %-20s | %-10s | %-10s | \n", "Judul", "Stok", "Tahun");
//        for(int i = 0; i < jumlah; i++) {
//            System.out.printf("\n| %-20s | %-10s | %-10s | \n", judul[i], stock[i], tahun[i]);
//        }
        
