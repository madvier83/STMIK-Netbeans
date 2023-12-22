/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_101;
import java.util.Scanner;
/**
 *
 * @author Advie Rifaldy
 */
public class Soal_101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r, luas, keliling;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Soal 101\n");
        System.out.print("Masukan jari jari lingkaran : ");
        r = input.nextFloat();
        
        luas = Math.PI*r*r;
        keliling = Math.PI*(r+r);
        System.out.println("Luas lingkaran tersebut : " + luas);
        System.out.println("Keliling lingkaran tersebut : " + keliling);
        
    }
    
}
