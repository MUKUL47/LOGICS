2

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
public class kthmaxmin {
    public static void main(String[] args) {
        int a[]={3,6,1,23,6,1,9,6,3,1,6,1,3};
        System.out.println("ENTER Kth");
        Scanner S = new Scanner(System.in);
        int aa=S.nextInt();
        if(aa>a.length){
            System.out.println("EXCEDING LIMIT");
        }
        else{ int m=0,i1=0;
            while(m<=aa-1){int max=a[0];
                for(int i=0;i<a.length;i++){
                    for(int j=0;j<a.length;j++){
                        if(max<a[j] ){
                            max=a[j];
                            i1=j;
                        }
                    }
                }if(m<aa){
                   a[i1]=0; 
                }
                if(m==aa-1){
                    System.out.println(max);
                }
                m++;
            }
            
        }
    }
}
