/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRACKTHECODE.ARRAYS.ARRAYS.ARRAYS.newpackage;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author admin
 */
public class PRINTPERMUTATION {
    public static void main(String[] args) {
     String ss="Tact coa";
     String sss=ss.toLowerCase();
     char s[]=sss.toCharArray();
        int c=0,no=0;
       for(int i=0;i<s.length && s[i]!=32;i++){
           int T=s[i];
           for(int j=0;j<s.length && i!=j  ;j++){
               if(T==s[j]){
                   c++;
               }
           }
           if(c%2!=0){
               no++;
           }c=0;
       }
       if(no>=2){
           System.out.println("NOT");
       }else{
           System.out.println("YES");
       }
     
}}
