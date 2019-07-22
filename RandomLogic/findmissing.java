
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class findmissing {
    
    public static void main(String[] args) {
    int a[]={5,3,3,7,1};
    int x=0;int m=0,n=0;
   
   Arrays.sort(a);
    a[0]=a[a.length-1];

    while(++x<a[0]){
        for(int j=1;j<a.length;j++){
            if(x==a[j]){
              m =a[j];
            }
            if(1==a[j]){
               n=1; 
            }
        }
        if(n==1){
            System.out.println("yes");
        }
      if(x!=m )
            System.out.println(x); 
    }
    
    
     
}}