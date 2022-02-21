/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPLEMENTATION_HACKERRANK;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BirthdayChocolate {
    public static void main(String[] args) {
   int a[]={1,2,1,2,1,1,2,1,1,1};
   int sum=4,times=3,i=0,c=1,c1=0,sum1=0;
       
   while(i<a.length){
       if(c<=times){
           sum1+=a[i];
       }
     if(a.length-i>=times){
      
       if(c==times ){
          System.out.println(sum1);
           if(sum1==sum){
               c1++;
           }c=1;sum1=a[i];
       }}
           
       i++;
       c++;
   }System.out.println(c1);
    
    }
    
}
