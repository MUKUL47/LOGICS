package Encryption;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN1
 */
public class Vigenère {
    public static void main(String[] args) {
        
        String plainText="GEEKSFORGEEKS".toLowerCase();
        String key="AYUSH".toLowerCase();
        System.out.println("Original Text : "+plainText);
        System.out.println("Encrypted Text : "+Encrypt(plainText, key));
        System.out.println("Decyrpted Text : "+Decrypt(Encrypt(plainText, key), key));
     
    }
    public static String Encrypt(String plainText , String key){
           int max=26,i=0,j=0; //i=left j=right
           String CT="";
           for(int k=0,l=0;k<plainText.length();k++,l++){            
            i=key.charAt(l)-96;
            j=plainText.charAt(k)-96;
            
            if((i+j)<=(max+1))CT+=(char)(i+(j-1)+96);
            else CT+=(char)((i+j-1)-max+96);
            
            if(l==key.length()-1) l=-1;
        }
        return CT;
    }
    public static String Decrypt(String CT , String key){
        String PT="";
        int i=0,j=0;
        for(int k=0,l=0;k<CT.length();k++,l++){
            i=CT.charAt(k)-96;
            j=key.charAt(l)-96;
            PT+=(char)((i-j+26)%26+97);
            if(l==key.length()-1) l=-1;
        }            
        return PT;
    }
}
