/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class anagram {
    public static void main(String[] args) {
        String s1="mcn";
        
        String s2="abcc";
      int a[]= new int[26];
        for(int i=0;i<26;i++){
            a[i]=0;
        }
        for(int i=0;i<s1.length();i++){
            int position=(int)s1.charAt(i)-97;
                       a[position]++;

            
        }
        for(int i=0;i<s2.length();i++){
            int position=(int)s2.charAt(i)-97;
           a[position]--;
            
        }
        
        
        
        
        
        int c=0;
        for(int i=0;i<a.length;i++){
            
            c+=(int)Math.abs(a[i]);
            System.out.println((char)(i+97)+"->"+a[i]);
        }
        System.out.println(c);
        
       
    }
}
