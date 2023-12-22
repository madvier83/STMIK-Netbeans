/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktek_101;
import java.util.Scanner;
/**
 *
 * @author Advie Rifaldy
 */
public class Praktek_101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world!");
        System.out.println();
        
        Scanner masukan = new Scanner(System.in);
        float celcius, reamur;
        
        System.out.print("Masukan nilai suhu (celcius) : ");
        celcius = masukan.nextFloat();
        reamur = 0.8f * celcius;
        
        System.out.println();
        System.out.println("Nilai suhu dalam reamur : " + reamur);
    }
    
}
