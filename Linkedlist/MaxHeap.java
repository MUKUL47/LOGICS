/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

/**
 *
 * @author ADMIN1
 */
public class MaxHeap {
    public static void main(String[] args) {
          int a[]= new int[]{45,26,27,10,37,13,15,28};
        try{
      
        int size=a.length-1;
        for(int i=0;i<=(size/2);i++){
      //   System.out.println(a[i]+"(1)->"+a[i*2+1]);
    //  System.out.println(a[i]+"(2)->"+a[i*2+2]);
      if(a[i]<a[i*2+1]){
          System.out.println(a[i]+"<"+a[i*2+1]);
          swap(i, i*2+1, a);
      }
      if(a[i]<a[i*2+2]){
          System.out.println(a[i]+"<"+a[i*2+2]);
          swap(i, i*2+2, a);
      }}}
    catch(Exception e){
        System.out.println();
    }show(a);
    }
 public static void swap(int a1, int b,int a[]){
     int t=a[a1];
     a[a1]=a[b];
     a[b]=t;
 }
static void show(int a[]){
    
                for(int i=0;i<(a.length/2);i++){
                      System.out.println(a[i]+"(1)->"+a[i*2+1]);
      System.out.println(a[i]+"(2)->"+a[i*2+2]);
                }
 }
}
class headNode{
    int data;
    headNode right;
    headNode left;
}