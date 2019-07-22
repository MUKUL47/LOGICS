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
public class breakDrecords {
    public static void main(String[] args) {
       Scanner S1 = new Scanner(System.in);
        int size=S1.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=S1.nextInt();
        }
        int small,large,i=1,S=0,L=0;
        small=large=a[0];
        while(i<a.length){
            if(a[i]>small){
                small=a[i];
                i++;
                L++;
            }
            else if(a[i]<large){
                large=a[i];
                i++;
                S++;
            }
            else{
                i++;
            }
    }
        System.out.println(L+" "+S);
}
}