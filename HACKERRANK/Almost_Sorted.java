/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPLEMENTATION_HACKERRANK;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class Almost_Sorted {
    public static void main(String[] args) {
        int a[]={1,2,3,7,6,5,4};
        int a2[]={1,2,3,7,6,5,4};
        for(int i6=0;i6<a.length;i6++){
        for(int j6=0;j6<a.length;j6++){
            if(j6>i6 && a[i6]>a[j6]){
                int tt=a[i6];
                a[i6]=a[j6];
                a[j6]=tt;
            }
        }    
        }
       String A="",B="";
        for(int i=0;i<a.length;i++){
            A+=a[i];
            B+=a2[i];
        }
        
        
        System.out.println(B);
        int i=0,j=1,m1=0,i2=0,j2=0;
        while(i<a.length && j<a.length && i<=j){
            if(a2[i]>a2[j]){
            
                int t=a2[i];
                a2[i]=a2[j];
                a2[j]=t;
            
                String s="";
                for(int i3=0;i3<a2.length;i3++){
                    s+=a2[i3];
                }
                if(A.equals(s)){
                    System.out.println("SWAP "+a2[i]+" WITH "+a2[j]);
                    m1=1;
                    break;
                }else{
                int t1=a2[j];
                a2[j]=a2[i];
                a2[i]=t;    
                }}
            
            if(j<a.length){
                j++;
            }
            if(j==a.length){
                i++;
                j=i+1;
            }
            
    }String s5="";
        if(m1==0){
             while(i2<a2.length && j2<a2.length && j2>=i2){
           
            s5+=a2[j2];
            if(s5.length()>2){
           char s55[]=s5.toCharArray();
           String s555="";
           for(int i1=s55.length-1;i1>=0;i1--){
               s555+=s55[i1];
           }
              if(CHECK(i2,j2,A,s555,a)==1){
                  System.out.println("SWAP FROM "+a2[i2]+ " TO "+a2[j2]);
                  break;
              }
            s555="";
            }
           
             if( j2<a2.length){
                j2++;
            }
             if(j2==a2.length){
              
                 i2++;
                 j2=i2; 
                 s5="";
             }
            
        }
        
    
}}

    private static int CHECK(int i2, int j2, String A, String s555,int a[]) {
        int check=0,i=0;
        String thisS="";
        while(i<a.length){
            if(i==i2){
                thisS+=s555;
                i=j2;
               i++;
            }
            else{
                thisS+=a[i];
                i++;
            }
            
        }
        if(thisS.equals(A)){
            check=1;
        }
      
        return check;
    }
}
