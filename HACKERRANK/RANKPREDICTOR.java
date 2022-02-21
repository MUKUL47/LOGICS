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
public class RANKPREDICTOR {
    public static void main(String[] args) {
        int a[]={100,100,50,40,40,20,10};
        int alice[]={5,25,50,120};
        int alicerank[]=new int[alice.length-1];
        Arrays.sort(a);
        Arrays.sort(alice);
       int max=a[a.length-1];
       int Rank[]=new int[a.length];
       int c=1,x=0;
       
        
       for(int i=a.length-1;i>=0;i--){
           if(i==a.length-1){
               Rank[x++]=c;
           }
           if(max!=a[i] && i!=a.length-1){
              c++;
              Rank[x++]=c;
              max=a[i];
          }
           else if(i!=a.length-1){
              Rank[x++]=c;
          }
       }
    
       int min2=99999,min3=0,remainingscores=0,i11=0,i1=0;
       for(int i=0;i<alice.length;i++){
        if(alice[i]<a[0]){
            remainingscores++;
        }
           for(int j=0,k=a.length-1;j<a.length && alice[i]>=a[0];j++,k--){
           
               min3=alice[i]-a[j];
               if(min3<0){
                   min3=min3*-1;
               }
               
               if(min3<min2  ){
                   min2=min3;
                   i1=Rank[k];
                   
               }
               if(j==a.length-1){
                   alicerank[i11++]=i1;
                   System.out.println(i1);
               }
           }min2=9999;
       }
        
       int finalrank=Rank[Rank.length-1];
        
        int prev=0;
        for(int i=remainingscores-1;i>=0;i--){
            
            if(i!=remainingscores-1){
                if(alice[i]<prev){
                    finalrank++;
                }
                prev=alice[i];
            }
            else{
                finalrank++;
                prev=alice[i];
            }
            System.out.println(finalrank);
        }
   
        
        
        
        
      
        }
}
