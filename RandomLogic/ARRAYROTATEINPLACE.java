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
public class ARRAYROTATEINPLACE 
{
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int a11[]=a;
        int k=2,j=0,l=0;
        
        for(int i=0;i<k;i++){
            int T=a11[i];
          //  System.out.println(T);
            l=i;
            j=0;
            while(j==0){
                int index=(l+k)%(a.length);
                if(index==i){
                    a[l]=T;
                    j=1;
                   
                }else{
                    
                    a[l]=a[index];
                    l=index;
                }
                
            }
        }
        
        for(int i1=0;i1<a.length;i1++){
            System.out.println(a[i1]);   
        }
                
    }
   
}