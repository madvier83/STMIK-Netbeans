/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_3;
import java.util.Scanner;

/**
 *
 * @author Advie Rifaldy
 */
public class Tugas_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int workHour = 0, salary = 0;
        
        System.out.print("Masukan jam kerja/minggu karyawan : ");
        workHour = input.nextInt();
        
        if(workHour >= 50 && workHour <= 60) {
            salary = workHour * 5000;
        }else if(workHour > 60) {
            salary = (workHour - 60) * 8000 + (60 * 5000);
        }else if(workHour < 50) {
            salary = workHour * 2500;
        }
        
        System.out.println("Gaji karyawan tersebut sebesar : Rp." + salary);
    }
    
}
