
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class quicksort {
    public static void main(String[] args) {
        int a[]={7,2,1,6,8,5,3,4};
      
       int pivot =4,x=0,pivotI=0;
      for(int i=0;i<a.length;i++){
          if(pivot==a[i]){
              pivotI=i;
          }
      }
      
      for(int i=0;i<a.length;i++){
             if(pivot<a[i] && pivotI>i){
                int swap=a[i];
                 a[i]=pivot;
                 pivot=swap;
                 pivotI=i;
             }
             else if(pivot >a[i] && pivotI<i){
                  int swap=a[i];
                 a[i]=pivot;
                 pivot=swap;
                 pivotI=i;
             }
          
      }
      while(x<a.length){
          System.out.println(a[x]);
          x++;
      }
 
    }}
