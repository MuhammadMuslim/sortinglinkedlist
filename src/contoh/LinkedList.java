/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contoh;

import contoh.Link;
import soalgenap.Node;

/**
 *
 * @author ASUS
 */
public class LinkedList {
     private Link first;
     private Node pointer;    
    // contructor LL
    public LinkedList() {
        pointer = null;
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int Data) {
        Link newLink = new Link(Data);
        newLink.next = first;
        first = newLink;
        
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key) {
        Link current = first;
        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }

        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public void sort(){
//        Node i = pointer;
//        while(i != null){
//            Node j = i.next;
//            while(j != null){
//                if( i.score < j.score){
//                    Object tmp = i.data;
//                    i.data = j.data;
//                    j.data = tmp;
//                    double tem;
//                    tem = i.score;
//                    i.score = j.score;
//                    j.score = tem;
//                }
//                j = j.next;
//            }
//            i = i.next;
//        }
    }
     
    public void displayList() {
        System.out.println("Daftar Nilai Mahasiswa ");
        Link current = first; // current kemungkinan array 
        // current [bilangn insertfirst]
        while (current != null) {
            current.displayLink();
            current = current.next;
            
//            for(int a = 0 ; a < array dari insertfirst : a++){
//                if (array dari insertfirst[a] > array dari inserfirst[b+1]){
//                    int temp = array dari insertfirst[a];
//                    array dari insertfirst[a] = array dari insertfirst[a+1];
//                    array dari insert first[a+1] = temp;
//                }
//                System.out.println(Arrays.toString(array dari insertfirst));
//            }
        }
        System.out.println(" ");

    }

    
}
