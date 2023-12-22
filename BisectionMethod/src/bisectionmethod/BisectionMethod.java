/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bisectionmethod;

/**
 *
 * @author Advie Rifaldy
 */
public class BisectionMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 1.0; // Batas awal selang
        double b = 0.0; // Batas akhir selang
        double c = 0.0; // Hasil metode bagi dua

        System.out.println(bisectionMethod(a, b, c));
        
    }

    public static double bisectionMethod(double a, double b, double c) {
        double epsilon = 0.000001;
        double epsilon_mesin = 1; // Nilai epsilon mesin yang sesuai

        do {
            c = (a + b) / 2;
            if (Math.abs(f(c)) < epsilon_mesin) {
                a = c;
                b = c;
            } else if (f(a) * f(c) < 0) {
                b = c; // selang baru [a,b] = [a,c]
                System.out.println("Selang baru [a,b] = [a,c]");
            } else {
                a = c; // selang baru [a,b] = [c,b]
                System.out.println("Selang baru [a,b] = [c,b]");
            }
//            System.out.println(Math.abs(a - b));
        } while (Math.abs(a - b) > epsilon);

        return c;
    }

    public static double f(double x) {
        // Implementasikan fungsi yang ingin dievaluasi di sini
        return x * x - 2;
    }
}
