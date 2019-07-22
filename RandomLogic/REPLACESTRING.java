/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRACKTHECODE.ARRAYS.ARRAYS.ARRAYS.newpackage;

/**
 *
 * @author admin
 */
public class REPLACESTRING {
    public static void main(String[] args) {
        String ss= "A  C";
        char s[]=ss.toCharArray();
        int spaces=0;
        for(int i=0;i<s.length;i++){
            if(s[i]==32){
                spaces++;
            }
        }
       int storage=ss.length()-spaces;
       int M=3*spaces+storage;
        char S[]= new char[M];
        int c=0;
       for(int i=0;i<s.length;i++){
           if(s[i]==32){
               
               S[c]='%';System.out.println(S[c]);
               S[c+1]='2';System.out.println(S[c+1]);
               S[c+2]='0';System.out.println(S[c+2]);
              
           }
           else{
               S[c]=s[i];System.out.println(S[c]);
               
           }c++;
       } 
    
      
      
            }
        
    }

