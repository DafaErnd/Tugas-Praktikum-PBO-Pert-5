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
public class Nilai_Akhir {
    String npm, nama, ket;
    char grade;
    double nKehadiran, nTugas, nUts, nUas;
    Scanner input = new Scanner(System.in);
    
    void inputNama(){
        System.out.print("Masukkan NPM : ");
        npm = input.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran : ");
        nKehadiran = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nUts = input.nextDouble();
        System.out.print("Masukkan Nilai Uas : ");
        nUas = input.nextDouble();        
    } 
    
    void perhitungan(){
       double nAkhir = (0.1 * nKehadiran) + (0.2 * nTugas) + (0.3 * nUts) + (0.4 * nUas);
     if (nAkhir >= 76){
        grade =  'A';
        ket = "ISTIMEWA";
     }else if (nAkhir >= 66){
        grade = 'B';
        ket = "BAIK";
     }else if (nAkhir >= 56){
        grade = 'C';
        ket = "CUKUP";
     }else if (nAkhir >= 46){
        grade = 'D';
        ket = "KURANG";  
     }else{
        grade = 'E';
        ket = "KURANG SEKALI";
     }
     System.out.println("NPM : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-Rata : " + nAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + ket);
    }
   
}
