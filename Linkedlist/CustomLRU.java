/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import sun.misc.Queue;

/**
 *
 * @author ADMIN1
 */
public class CustomLRU {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> stack = new Queue<Integer>();
       Stack<Integer> LRU = new Stack<Integer>();
        int a[]=new int[16];
        int cache=3;
      int pagefaults=0;
      Scanner S = new Scanner(System.in);
      for(int i=0;i<16;i++){
          a[i]=S.nextInt();
      }
        //value(process),key(count)
        for(int i=0;i<a.length;i++){
            int c=-999,key=0;
           if(i<cache){
               if(!LRU.contains(a[i])){
                   LRU.add(a[i]);
                   stack.enqueue(a[i]);
             System.out.println(a[i]+"T)"+LRU);
               }
           
           }
           
           else
           {if(!LRU.contains(a[i]) && LRU.size()==cache){
               pagefaults++;
              
                LRU.remove(0);
               LRU.add(a[i]);
              System.out.println(a[i]+"M)"+LRU);
           }
//           else if(LRU.contains(a[i]) && LRU.size()==cache){
//            int secondInd=LRU.get(1);
//            LRU.remove(0);
//            LRU.add(1, secondInd);
//           }
           else if(!LRU.contains(a[i]) && LRU.size()<cache){
               LRU.add(a[i]);
               System.out.println(a[i]+"L)"+LRU);
           }}}
     // System.out.println(a[i]+")"+LRU); }
       
          System.out.println(LRU+" with total "+(cache+pagefaults)+" page faults");
           
        
        
    }
}
class LRU1{
    int data;
    int count;

    public LRU1(int data, int count) {
        this.data = data;
        this.count = count;
    }
    
}
