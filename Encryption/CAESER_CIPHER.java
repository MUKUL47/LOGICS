package Strings;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class CAESER_CIPHER {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter A String");
        String s=S.nextLine();
        System.out.println("Enter A Key");
        int key=S.nextInt();
        char s1[]=s.toCharArray(),sc[]=s1;
        
        System.out.println("Encrypted Text : ");
        for(int i=0;i<s1.length;i++){
         int m=(int )s1[i]+key;
         s1[i]=(char) m;
            System.out.print(s1[i]);
            if(s1[i]==32){
                System.out.print("\t");
            }
        }
        System.out.println("");
        while(true){
            System.out.println("Enter A Key to Decrypt");
            int key1=S.nextInt();
            if(key<0){
                key1=-key1;
                System.out.println("");
                  for(int i=0;i<s1.length;i++){
         int m=(int )s1[i]+key1;
         s1[i]=(char) m;
            System.out.print(s1[i]);
            if(s1[i]==32){
                System.out.print("\t");
            
            }
        }
            
            }else{
                
                  for(int i=0;i<s1.length;i++){
         int m=(int )s1[i]-key1;
                    
        s1[i]=(char) m;
            System.out.print(s1[i]);
            if(s1[i]==32){
                System.out.print("\t");
            }
        }System.out.println("");
            }
            System.out.println("\nGOT?? 0YES ");
            int mmm=S.nextInt();
            if(mmm==0){
                break;
            }
        }
        System.out.println("");
    }
}
