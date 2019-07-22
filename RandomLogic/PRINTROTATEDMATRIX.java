/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRACKTHECODE.ARRAYS.ARRAYS.ARRAYS.newpackage;

/**
 *
 * @author admin
 */
public class PRINTROTATEDMATRIX {
    public static void main(String[] args) {
        int a[][]=
           {{1,2,3,4},
            {5,6,7,8},
            {9,1,1,2},
            {1,5,7,7}};
        int F=a.length,S=a.length;
        int x=0,z=0,l=1,x1=0;
       
       
        while(F-l>=l){
            
        for(int i=x1;i<F-l;i++){   
            System.out.print(a[x][z++]+" ");
         
        }
        for(int i=x1;i<F-l;i++){
            System.out.print(a[x++][z]+" ");
         
        }
        for(int i=x1;i<F-l;i++){
            System.out.print(a[x][z--]+" ");
            
        }
        for(int i=x1;i<F-l;i++){
            System.out.print(a[x--][z]+" ");
        }
        x++;
        z=x;
        l++;
        x1++;
        }

        System.out.println("");
    }
 
}
