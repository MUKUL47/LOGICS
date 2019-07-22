/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

import java.util.Scanner;

/**
 *
 * @author ADMIN1
 */
public class Cipher {
    public static void main(String[] args) {
      
        System.out.println("Enter a text");
        Scanner S  = new Scanner(System.in);
        
        String PlainText=S.nextLine();
        String CipherText="";
        //PlainText=PlainText.toLowerCase();
         System.out.println("Enter Skip");
        int skip=S.nextInt();
        for(int i=0; i <PlainText.length();i++){
            CipherText+=(char)(PlainText.charAt(i)+skip);
        }
        System.out.println("Cipher Text : "+CipherText);
        PlainText=CipherText;
        CipherText="";
        
        for(int i=0; i <PlainText.length();i++){
            CipherText+=(char)(PlainText.charAt(i)-skip);
        }
       System.out.println("Plain Text : "+CipherText);
    }
}
