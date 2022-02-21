package Linkedlist;


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
public class HASH_linearProbing {
    public static void main(String[] args) {
       Scanner S = new Scanner(System.in);int sum=0;
        int size=10;String store[]= new String[size];       
       for(int i=0;i<size;i++){
           System.out.println(HASH(S.nextLine(),size,store,0,sum));
       }
    }

    private static String HASH(String nextInt, int size, String[] store,int next,int s) {
  if(next==0){
        for(int i=0;i<nextInt.length();i++){
       s+=nextInt.charAt(i);
        }}
  
        int storehere=s%size;
        if(store[storehere]==null){
           store[storehere]=nextInt; 
        }else{
            return HASH(nextInt, size, store, next+1, s+1);
        }
        
    
    return nextInt+" is Stored at "+storehere;
    }
}
