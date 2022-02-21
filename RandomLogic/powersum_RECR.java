/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class powersum_RECR {
    public static void main(String[] args) {
        int sum=100,p=2,e=9,c=0;
       int a=10;
       while(true){
           if((Math.pow(a, p))<sum ){
               sum=sum-(int)Math.pow(a, p);
              a--;
               System.out.println(sum);
           }
           if((Math.pow(a, p)==sum)){
               c++;
               e=0;
              a--;
              if(a==0){
                  break;
              }
           }
         
       }
        System.out.println(c);  
    }
    
}
