/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author admin
 */
public class leaderrecur {
    public static void main(String[] args) {
        int a[]={6,5,4,7,3,5};
           int c=0,m=a.length-1;
           for(int i=0;i<a.length;i++){
               for(int j=0;j<a.length;j++){
                   if(i<j){
                       if(a[i]>a[j]){
                           //System.out.println(a[i]+" "+a[j]);
                           c++;
                          // System.out.println("c="+c);
                       }
                   }}
                   if(c==m){
                       System.out.println(a[i]);
                   }m--;c=0;
                   
               
           }
    
    }}