///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package tugas6;
//import java.util.Scanner;
///**
// *
// * @author Advie Rifaldy
// */
//public class Tugas6 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        String[] hewan = {"gajah", "singa", "jerapah", "harimau", "kuda"};
//        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan nomor indeks: ");
//        int index = input.nextInt();
//        
//        if (index >= 0 && index < hewan.length) {
//            System.out.println(index + ". " + hewan[index]);
//        } else {
//            System.out.println("Invalid");
//        }
//    }
//    
//}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;
import java.util.Scanner;
/**
 *
 * @author Advie Rifaldy
 */
public class Tugas6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();
        int[] data = new int[n];

        // input data
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i+1) + ": ");
            int nilai = input.nextInt();

            // validasi nilai antara 0 sampai 100
            if(nilai >= 0 && nilai <= 100) {
                data[i] = nilai;
            } else {
                System.out.println("Nilai harus antara 0 sampai 100");
                i--;
            }
        }

        System.out.print("\nData yang diinput: ");
        for(int nilai : data) {
            System.out.print(nilai + " ");
        }

        double sum = 0;
        for(int nilai : data) {
            sum += nilai;
        }
        double mean = sum / n;

        System.out.println("\nMean dari data yang diinput adalah " + mean);
    }
    
}
