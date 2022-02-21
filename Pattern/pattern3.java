/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author admin
 */
public class pattern3 {
    /*
      *
     * *
    * * *  
     */
    
    public static void main(String[] args) {
        
      int fh=13/2-2,mh=13/2+1,m=13/2-1;
      
        for(int i=0;i<13;i++){
            System.out.println("");
            
           if(i==0 || i==12){
            for(int k=0;k<13;k++ ){
                System.out.print("*");
            }}
           else{
           
               
               for(int p=0;p<=fh;p++){
                   System.out.print("*");
               }
               for(int q=fh;q<=mh+1;q++){
                   System.out.print(" ");
               }
               for(int r=12;r>=mh+1;r--){
                   System.out.print("*");
               }
               if(i>=1 && i<=5){
                   fh--;
                   mh++;
               }else{
                   fh++;
                   mh--;
               }
               
               
           }
           
            }
        
    }
}
