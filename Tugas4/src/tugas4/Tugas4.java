///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package tugas4;
//
///**
// *
// * @author Advie Rifaldy
// */
//import java.util.Scanner;
//
//public class Tugas4 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner input = new Scanner(System.in);
//
//        int jumlah;
//        boolean prima = true;
//
//        System.out.print("Masukan jumlah bilangan prima : ");
//        jumlah = input.nextInt();
//
//        System.out.println();
//
//        int num = 2;
//        while (jumlah > 0) {
//            for (int j = 2; j < num; j++) {
//                if (num % j == 0) {
//                    prima = false;
//                }
//            }
//            if (prima == true) {
//                System.out.print(num + ", ");
//                jumlah--;
//            }
//            prima = true;
//            num++;
//        }
//
//    }
//
//}

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package tugas4;
//
///**
// *
// * @author Advie Rifaldy
// */
//
//import java.util.Scanner;
//
//public class Tugas4 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner input = new Scanner(System.in);
//        
//        int pinjaman, bulan, bunga, angsuran = 0;
//        
//        System.out.print("Masukan jumlah pinjaman : ");
//        pinjaman = input.nextInt();
//        System.out.print("Masukan lama angsuran   : ");
//        bulan = input.nextInt();
//        System.out.print("Masukan bunga perbulan  : ");
//        bunga = input.nextInt();
//        
//        System.out.println();
//        for(int i = 0; i < bulan; i++) {
//            angsuran += (pinjaman / bulan)+ (pinjaman / bulan / bunga);
//            System.out.println("Pembayaran bulan " + (i+1) + " = Rp." + ((pinjaman / bulan)+ (pinjaman / bulan / bunga)));
//        }
//        
//        System.out.println();
//        System.out.println("Total angsuran = Rp." + angsuran);
//        
//    }
//    
//}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author Advie Rifaldy
 */

public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int r = 5; r>0; r--) {
            for(int c = r; c > 0; c--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}

