/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yohomiee;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class minimum_cost_house {
    public static void main(String[] args) {
        Scanner SS=new Scanner(System.in);
        int prices[]=new int[5],i=0,sum=5,x=0,min=999999,M=0;
        for(int p=0;p<prices.length;p++){
            prices[p]=SS.nextInt();
        }int l=1;
        int S[]= new int[l];
        
        while(i<prices.length && x<=sum){
            
            
            if(x>i && prices[i]>prices[x] ){
                
              
                
            
              if(i==prices.length-1){
              
              }
            } 
          
           
            
           
            x++;
           
            if(x==sum){
               i++;
               x=0;
            
            
            }
        }Arrays.sort(S);
        System.out.println(S[0]);
        
    }}
    

