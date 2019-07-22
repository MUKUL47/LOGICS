/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class consecutive {
    public static void main(String[] args) {
        int a[]={1,4 , 5,10,4,11,16,3,1,2,12,15,13};
        int a1[]= new int[a.length];
        int c1=0,c=0,x=1,i1=0,i2=0;
   
        for(int i=0;i<a.length ;i++){
       x=a[i]+1;
  
int j=0;
         while( j<a.length ){ 
            
                  if(x==a[j]){ 

                      c++;
                      x++;
                   
                    j=-1;
                  }
              
                    j++;
                 
                  }
     
                if( c>c1 ){
                c1=c;
                     i1=a[i];
                    i2=c+a[i];
                  }c=0;
        }
      int m=0; 

        for(int i=i1;i<=i2;i++){
            m=0;
          while(m<a.length){
              if(a[m]==i){
                  a1[m]=a[m];
                 
              }
              m++;
          }}
int n=0;
while(n<a1.length ){
    if(a1[n]!=0){
            System.out.println(a1[n]);
            
        }n++;
    }}}

