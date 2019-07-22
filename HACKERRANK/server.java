/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPLEMENTATION_HACKERRANK;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class server {
    public static void main(String[] args) {
          Scanner ss=new Scanner(System.in);
      int n=95;  
       int[] position = new int[n];
         int[] height = new int[n];
         
         for(int p=0;p<n;p++){
             position[p]=ss.nextInt();
         }
         for(int p1=0;p1<n;p1++){
             height[p1]=ss.nextInt();
         }
                  int i=0,j=position.length-1,l=1,r=1,sum=0;
       N : for(i=0;i<position.length-1 ;i++){
            int m=height[i]+position[i];
 
            HELLO : while(m>0){int find= Arrays.binarySearch(position, m);
                if(find>=i+1)
                {                 
       
          i=find;
          i--;
          break HELLO;
         }
                if(find==i){
                    break N;
                }
        m--;
         }
       sum=j;}
        System.out.println("LEFT "+sum);
        int sj=0;
        int J=0;
        M : for(j=position.length-1 ;j>=0;j--){
            int m=position[j]-height[j];
         System.out.println(m);
            HELLO1 : while(m>0){int find= Arrays.binarySearch(position, m);
            
                if( find<=j-1)
                {        
                    
                    System.out.println("find "+find+"\n j"+j);
          j=find;
          j++;
          break HELLO1;
         }if(find==j){
                
             break ;
         }
               
              
        m++;
         }
     
        }
        
      
       }
}
