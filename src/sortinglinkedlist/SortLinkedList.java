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
public class SortLinkedList {
    public static void main(String[] args) {
         
        mahasiswa mhs1 = new mahasiswa ("1765010", "Score ", 70);
        mahasiswa mhs2 = new mahasiswa ("1765027", "Score ", 100);
        mahasiswa mhs3 = new mahasiswa ("1765025", "Score ", 80);
        mahasiswa mhs4 = new mahasiswa ("1765009", "Score ", 95.0);
        mahasiswa mhs5 = new mahasiswa ("1765023", "Score ", 60);
        mahasiswa mhs6 = new mahasiswa ("1765029", "Score ", 55);
        
        LinkedList ssl = new LinkedList();
        ssl.buatNode(mhs1);
        ssl.buatNode(mhs2);
        ssl.buatNode(mhs3);
        ssl.buatNode(mhs4);
        ssl.buatNode(mhs5);
        ssl.buatNode(mhs6);
        
        ssl.cetak("NIM\t| Nama  \t| Score\t|");
        System.out.println("Sesudah DIURUTKAN :");
        ssl.sort();
        ssl.cetak("NIM\t| Nama  \t| Score\t|");
        System.out.println("Dimasukkan data baru ");
        ssl.sisip(mhs5, mhs2);
        System.out.println("Sebelum DIURUTKAN : ");
        ssl.cetak("NIM\t| Nama \t| Score\t|");
        System.out.println("sesudah diurutkan : ");
        ssl.sort();
        ssl.cetak("NIM\t| Nama\t| Score\t|");
//        ssl.hapusDiDepan();
//        ssl.cetak("NIM\t| Nama\t| Score\t|");
//        ssl.hapusData(mhs5);
//        ssl.cetak("NIM\t| Nama\t| Score\t|");
          
    }
}
