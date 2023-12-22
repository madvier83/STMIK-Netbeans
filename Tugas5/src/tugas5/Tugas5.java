/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

/**
 *
 * @author Advie Rifaldy
 */
public class Tugas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 30;
        for (int i = 1; i < n; i++) {
            System.out.println(fibonacci(i) + ", ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package tugas5;
//
//import java.util.Scanner;
//
///**
// *
// * @author Advie Rifaldy
// */
//public class Tugas5 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan bilangan : ");
//        int n = input.nextInt();
//
//        if (isPrime(n)) {
//            System.out.println(n + " adalah bilangan prima");
//        } else {
//            System.out.println(n + " BUKAN bilangan prima");
//        }
//
//        for (int i = 1; i <= 100; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + ", ");
//            }
//        }
//    }
//
//    public static boolean isPrime(int n, int divisor) {
//        if (n < 2) {
//            return false;
//        }
//        if (n == 2) {
//            return true;
//        }
//        if (n % divisor == 0) {
//            return false;
//        }
//        if (divisor * divisor > n) {
//            return true;
//        }
//        return isPrime(n, divisor + 1);
//    }
//
//    public static boolean isPrime(int n) {
//        return isPrime(n, 2);
//    }
//
//}
