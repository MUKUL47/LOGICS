
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class commonstring {
    public static void main(String[] args) {
        String s="ABCDEF";
        String s1="FBDAMN";
        char ss[]=s.toCharArray();
        int c=0,c1=0,p=-1,j=0,found=0;
        for(int i=0;i<s1.length();i++){
            if(p<0){
            for(j=0;j<ss.length;j++){
            if(s1.charAt(i)==ss[j]){
                p=j;
                c++;
                break;                
            }}}
            else{
               
               for(int k=p;k<ss.length;k++){
                
                   if(s1.charAt(i)==ss[k]){
                       found=1;p=k;break;
                   }
                  
               } 
               if(found!=1){
                   for(int l=0;l<p;l++){
                       
                     if(s1.charAt(i)==ss[l]){
                       found=2;p=l;break;
                         }}}
               if(found==1){
                   c++;
                   
                   if(c>c1){
                       c1=c;
                   }
               }
               else if(found==2){
                   c=1;
                   
               }
               
               ss[p]='_';
               found=0;
            }
        }
        System.out.println(c1);
     
    }}

