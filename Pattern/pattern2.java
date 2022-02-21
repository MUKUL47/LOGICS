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
public class pattern2 {public static void main(String[] args) {
        /*
               . 
              ..
             ...  
    */int s=4,k=1;
        for(int i=1;i<=5;i++){
            System.out.print("\n");
           for(int j=1;j<=s;j++){
               System.out.print(" ");
           }
        for(int l=s+1;l<=5;l++){
            System.out.print("*");
        }
        s--;
        }
    }
    
}
