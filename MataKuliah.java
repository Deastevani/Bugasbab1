/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugasbab1;

/**
 *
 * @author Lenovo
 */
public class MataKuliah {
   
    public static void main(String[] args){
        SistemPerencanaanStudi Sistem1 = new SistemPerencanaanStudi();
        
        
        
        Sistem1.namaMataKuliah = "Bahasa Inggris";
        Sistem1.kategoriMataKuliah = "Wajib";
        Sistem1.jumlahSks = 3;
        
        //lalu ditampilkan
        System.out.println("Mata Kuliah");
        System.out.println("Nama Mata Kuliah " + Sistem1.namaMataKuliah);
        System.out.println("Kategori Mata Kuliah : " + Sistem1.kategoriMataKuliah);
        System.out.println("Jumlah SKS : " + Sistem1.jumlahSks);
    }
}

