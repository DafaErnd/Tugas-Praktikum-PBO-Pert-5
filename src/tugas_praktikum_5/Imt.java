/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum_5;
import java.util.Scanner;
/**
 *
 * @author dafae
 */
public class Imt {
    double bb, tb,imt;
    
    Scanner input = new Scanner(System.in);
    
    void masukan(){
        System.out.println("Masukkan Berat Badan(Kg) : ");
        bb = input.nextDouble();
        System.out.println("Masukkan Tinggi Badan(m) : ");
        tb = input.nextDouble();
        
    }
    
    void perhitungan(){
        imt = bb / (tb * tb);
        System.out.println("Nilai IMT anda = " + imt);
        if (imt >= 40){
            System.out.println("Sangat Gemuk");  
        }else if (imt >= 30 && imt <= 39.9){
            System.out.println("Gemuk");
        }else if(imt >=  25 && imt <= 29.9){
            System.out.println("Berat Badan Lebih");
        }else if (imt >= 18.5 && imt <= 24.9){
            System.out.println("Berat Badan Ideal");
        }else{
            System.out.println("Berat Badan Kurang");
        }
     }
}
    

