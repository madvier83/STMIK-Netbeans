/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_102;
import java.util.Scanner;
/**
 *
 * @author Advie Rifaldy
 */
public class Soal_102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heredouble r, luas, keliling;
        double rupiah, dollar;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Soal 102\n");
        System.out.print("Masukan nilai rupiah : ");
        rupiah = input.nextDouble();
        
        dollar = rupiah * 0.000065;
        System.out.println("Nilai dalam dollar : $" + dollar);
    
    }
    
}
