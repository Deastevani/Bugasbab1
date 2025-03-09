/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugasbab1;

/**
 *
 * @author Lenovo
 */
public class SistemPerencanaanStudi {
   
    String kategoriMataKuliah, namaMataKuliah;
    int jumlahSks;
    void dataNamaMataKuliah(String NamaMataKuliah){
        this.namaMataKuliah = NamaMataKuliah;
    }
    void dataKategoriMataKuliah(String KategoriMataKuliah){
        this.kategoriMataKuliah = KategoriMataKuliah;
    }
    void dataJumlahSks(int JumlahSks){
        this.jumlahSks = JumlahSks;
    }
    
    String NamaNamaMataKuliahuku(){
        return namaMataKuliah;
    }
    String KategoriMataKuliah(){
        return kategoriMataKuliah;
    }
    int JumlahSks(){
        return jumlahSks;
    }
}
