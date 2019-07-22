/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class majority {
    public static void main(String[] args) {
        int a[]={1, 3   , 2,3,4,1,3,1,3,1,3,1},c=0,c1=0;String majority=""; 
        boolean yes=true;
        for(int i=0;i<a.length;i++){
          for(int j=0;j<a.length;j++){
          
              if( i<j && a[i]==a[j]){
                 c++;
                   
              }
            
              
          }

          if(c>0 && c1<c){
              c1=c;
          
            majority=Integer.toString(a[i]);
          
          }
          else if(c==c1){
              majority="ALL EQUAL";
          }
       
       
         
        c=0;}

        System.out.println(majority);
       
        
    }
}
