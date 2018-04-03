/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contoh;

/**
 *
 * @author ASUS
 */
public class Link {
    public int data;
    public Link next;
    private long nim;
    private double score;
    
    public Link(int Data){
        this.data= Data;
    }
    
    public void displayLink(){
        System.out.println(data+" ");
    }
    
}
