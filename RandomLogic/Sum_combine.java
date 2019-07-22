/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Sum_combine {
    public static void main(String[] args) {
        int a[]={5,2,1,3,5,61,1,17,34
     
     },min=0,j=1;
        System.out.println(a.length);
//        for(int i=0;i<a.length;i++){
//            if(a[i]<min){
//                min=a[i];
//            }
//        }
        min=min-1;
        int k=0,stop=0;
        while(k<a.length && j<a.length ){
             for(int i=0;i<a.length;i++){
                 if(a[i]!=min){
                     System.out.print(" "+a[i]);
                 }
             }System.out.println("");
            if((a[k]+a[j])%2==0 && (a[j]!=min && a[k]!=min) && j!=k){
           
              a[j]=a[j]+a[k];  
            a[k]=min;
              
               
               
                j=0;
                stop=1;
            }
            if(stop==0 && j<a.length && ((a[j]+a[k])%2!=0  || a[j]==min || a[k]==min || k==j )){
                j++;
            }
            if(k!=a.length-1 && j==a.length-1  && ((a[j]+a[k])%2!=0  || a[j]==min || a[k]==min || k==j )){
             
                k=k+1;
                j=0;
            }stop=0;
         
            
            
    }int k1=0;
            while(k1<a.length){
                if(a[k1]!=min){
                    System.out.println(a[k1]);
                    k1++;
                }else{k1++;
            }
     
        
}}}
