/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author admin
 */
public class rotatearr {

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5};
        int r = 2, l = a.length;
        int a1[] = new int[a.length - 1];
        int i=r,j=0,flag=0;
     while(i<l){
         System.out.println(a[i]);
         if(r!=0 && i==l-1 && flag==0){
             i=-1;
             l=r;
             flag=1;
         }
         i++;
     }
    }
}
