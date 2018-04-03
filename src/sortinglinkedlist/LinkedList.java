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
public class LinkedList {
    private Node pointer;    
    // contructor LL
    public LinkedList() {
        pointer = null;
    }
    
    //deklarasi method
    // membuat suatu node baru
    public void buatNode(mahasiswa dt) {
        Node nodeBaru = new Node();
        nodeBaru.data = dt;
        nodeBaru.score = dt.getScore();
        nodeBaru.next = pointer;
        pointer = nodeBaru;
    }
    
    public boolean sisip(mahasiswa dt1, mahasiswa dt2) {
        Node n = pointer; //n digunakan utk mencari posisi dt2
        while ((n != null) && (n.data != dt2)) {
            n = n.next;
        }
        if (n == null) {
            return false;
        }
        Node nn = new Node();
        nn.data = dt1;
        nn.next = n.next;
        n.next = nn;
        return true;
    }
    
    public Object hapusDiDepan() {
        Node hapus = pointer;
        pointer = pointer.next;
        return hapus.data;
    }
    
    public void sisipDataDiAkhir(mahasiswa data) {
        Node pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = pointer;
        Node baru = new Node();
        baru.data = data;
        baru.next = null;
        while (pAkhir != null) {
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next;
        }
        pSblAkhir.next = baru;
    }
    
    public void hapusData(mahasiswa dataHapus) {
        Node n = pointer;
        while ((n != null) && (n.next.data != dataHapus)) {
            n = n.next;
        }
        n.next = n.next.next;
    }
    public Node getPointer() {
        return pointer;
    } 
    
    //untuk mengurutkan
    public void sort(){
        Node i = pointer;
        while(i != null){
            Node j = i.next;
            while(j != null){
                if( i.score < j.score){
                    Object tmp = i.data;
                    i.data = j.data;
                    j.data = tmp;
                    double tem = i.score;
                    i.score = j.score;
                    j.score = tem;
                }
                j = j.next;
            }
            i = i.next;
        }
    }
              
    // cetak data
    public void cetak(String kom) {
        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println(kom);
        System.out.println("=================================");
        Node n = pointer;
        while (n!= null) {
            System.out.print(n.data+"");
            n = n.next;
        }
        System.out.println("=================================\n");
    }      

}
