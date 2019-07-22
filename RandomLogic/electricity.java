/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class electricity {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3,4},
            {5,6,7,8},
            {3,1,3,4},
            {5,6,7,8}
        };
        int x=a.length-1;
        for(int i=0;i<a.length;i++){
            System.out.println("");
            x=i;
            for(int j=0;j<=x;j++){
                System.out.print(a[i][j]);
             }
            
        }
    }
 
}
