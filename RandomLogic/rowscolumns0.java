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
public class rowscolumns0 {
    public static void main(String[] args) {
        int ar[][]={
            {0,0,0,0},
            {0,0,1,0},
            {0,0,0,1}};
        int h=3,w=4;
        
        for (int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(ar[i][j]==1){
                   int xi1,xi2;
                   xi1=xi2=i;
                   int yj1,yj2;
                   yj1=yj2=j;
                    while(ar[i][0]==ar[i][w-1] && ar[0][j]==ar[h-1][j] && ar[i][w-1]==ar[0][j] && ar[i][0]!=9){
                        
                        if(yj1>=0){
                        ar[i][yj1--]=9;    
                        }
                        if(yj2<=w){
                            ar[i][yj2++]=9;
                        }
                        if(xi1>=0){
                            ar[xi1--][j]=9;
                        }
                        if(xi2<h){
                            ar[xi2++][j]=9;
                        }
                        
                        
                        
                        
                    }
                }
            }
        }
        for (int i=0;i<h;i++){
            System.out.println("");
            for(int j=0;j<w;j++){
                System.out.print(ar[i][j]);
            }
        }
        System.out.println("");
    }
}
