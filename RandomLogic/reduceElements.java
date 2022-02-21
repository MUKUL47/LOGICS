/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class reduceElements {
    public static void main(String[] args) {
        int n[]={2,5,1,3,5,1,2,4,1};
        int length1;
        int length=length1=n.length-1;
        int i=0,j=i+1,c=0,m=0,n1=0;
       while(i<n.length){
           if(j<n.length-1){
           while(j<n.length){
               if(((n[i]+n[j])%2==0) && j!=i && n[j]!=0){
                   
                 n[i]+=n[j];
                 n[j]-=n[j];
                 j++;
                 m=n1=1;
               }else{
                   j++;}          
               
               if(m==1){
                   i=0;
                   j=0;
                    m=0;}
               
           }}i++;
             if(n1==1){
                 i=0;
                 n1=0;
             }
          
       if(j==n.length-1){
           i++;
           j=i;
       }
       
       }int c1=0;
       for(int i1=0;i1<n.length;i1++)
               {
                   if(n[i1]!=0){
           System.out.println(n[i1]);c1++;}
       }
        System.out.println("LENGTH "+c1);
    
    
    }

}