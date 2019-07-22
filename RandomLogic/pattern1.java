/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class pattern1 {
    public static void main(String[] args) {
        char c[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q'};
        int band=16;
        String space=" ";
        int space1=1;
        int j=0,k=16;
        for(int i=0;i<=17;i++){
           while(j<band){
                System.out.print(c[j]);
               j++;
              
            }if(i>=1){
                for(int i1=0;i1<space1;i1++){              
                    System.out.print(space);
                
                }space1=space1+2;
            }
            while( k>=0){
                  System.out.print(c[k]);
                  k--;
                
            }
            if(i==1){
                j=0;
                k=15;
            }
            else if(i>1 && i<=16){
               
              j=0;
              k=16;
              k=k-(i);
               band=band-1;
                
                
            }
            System.out.println("");
        }
    }
 
}
