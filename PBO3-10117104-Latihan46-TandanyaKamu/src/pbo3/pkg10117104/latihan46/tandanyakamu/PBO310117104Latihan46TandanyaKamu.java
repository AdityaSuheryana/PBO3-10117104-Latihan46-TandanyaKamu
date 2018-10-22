/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan46.tandanyakamu;


import java.util.Scanner;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan Keterangan 
 * Tanda sesuai ketentuan dari umur yang di inputkan oleh keyboard user 
 */
public class PBO310117104Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Age s = new Age();
        System.out.printf("Masukkan Tahun Lahir Anda : ");
        s.setYearBirth(scn.nextInt());
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir Anda : "+s.getYearBirth());
   
        System.out.println("Hari ini tahun : "+s.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                +s.hitungUmur()+" tahun");
   
        System.out.println("Tandanya Kamu : "+s.tandanyaKamu(s.hitungUmur()));
    }
    
}
