/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class pascaltriangle {
    public static void main(String[] args) {
    long n=1;
        for(long i=0;i<22;i++){
         if(i>0){
        n=n*i;
        }else{
         n=1;   
        }
        
         for(long j=0;j<=i;j++){
           
          
             if(j==0){
                System.out.print("1");
             } if( j>0 && j<i){
                      long r1=i-j;
                       long r=j,m;
                    
                       long R=1,R1=1;
             for(long k=1;k<=r1 ;k++){
                 R1=R1*k;               
             }
             for(long k=1;k<=r ;k++){
                 R=R*k;               
             }

              System.out.print("  "+n/(R1*R));
             }
             else if(j==i && i!=0){
               System.out.print("  1");
             }
             }System.out.print("\n");
            
         }
         
    
}    
   
}
