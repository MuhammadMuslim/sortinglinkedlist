/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contoh;

import contoh.LinkedList;
import contoh.Link;

/**
 *
 * @author ASUS
 */
public class LinkedListApp {
     public static void main(String[] args) {
        LinkedList theList= new LinkedList();
        
        //theList.insertFirst(22);
        theList.insertFirst(70);
        theList.insertFirst(85);
        theList.insertFirst(95);
        theList.displayList();
        //slh
//        while(!theList.isEmpty()){
//            Link aLink= theList.deleteFirst();
//            System.out.println("Deleted");
//            aLink.displayLink();
//            System.out.println("");
//        }
        
       // theList.displayList();
        
        theList.insertFirst(77);
        theList.insertFirst(88);
        theList.displayList();
        
        theList.insertFirst(50);
        theList.insertFirst(60);
        theList.insertFirst(100);
        theList.insertFirst(65);
        theList.insertFirst(75);
        theList.displayList();
        //slh
//        Link f= theList.find(77);
//        if(f!=null){
//            System.out.println("Ketemu "+f.Data);
//        }else{
//            System.out.println("Link tidak Ditemukan");
//        }
        
//        Link d= theList.delete(88);
//        if(d!=null){
//            System.out.println("Hapus Link dengan key "+d.Data);
//        }else{
//            System.out.println("Link tidak ditemukan");
//        }
//        theList.displayList();
    }
}
