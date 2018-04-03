/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortinglinkedlist;

/**
 *
 * @author ASUS
 */
public class mahasiswa {
    private String nim;
    private String nama;
    private double score;
    
    //deklarasi konstruktor
    public mahasiswa (String nim, String nama, double score){
        
        this.nama = nama;
        this.score = score;
        this.nim = nim;
    } 
    //deklarasi method
    //ambil nilai ipk
    public double getScore (){
        return this.score;
    }
    
    //ambil nilai nim
    public String getNim(){
        return this.nim;
    }
    
    //ambil nilai nama
    public String getNama(){
        return this.nama;
    }
    
    //cetak di format dalam bentuk string
    public String toString (){
        return String.format("%s\t| %.6s\t| %s\t|\n", nim, nama, score);
    }
}
