/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPLEMENTATION_HACKERRANK;

/**
 *
 * @author admin
 */
public class QUANTUM_TEST {
    public static void main(String[] args) {
        
          char a[][]=new char[][]{
        {'G','G','G','G','G','G'},
        {'G','G','G','G','G','G'},
        {'G','G','G','G','G','G'},
        {'G','G','G','B','B','G'},
        {'G','G','G','B','B','G'},
        {'G','G','G','G','G','G'}
    
        
       };
         int max=0; int m=0;
          for(int i=0;i<a.length;i++){
              
              for(int j=0;j<a.length;j++){
                 if(!(i==0 && a[i][j]=='G' || j==0 && a[i][j]=='G'||
                         j==a.length-1 && a[i][j]=='G' || i==a.length-1 && a[i][j]=='G') ){
                     
                 }else{
       
              if(i<j){
                  if((a.length-i-1)<(a.length-j-1)){
                      if(i<(a.length-i-1)){
                          max=i;
                      }
                      else{
                          max=a.length-i-1;
                      }
                  }else{
                       if(i<(a.length-j-1)){
                          max=i;
                      }
                      else{
                          max=a.length-j-1;
                      }
                  }
              }else if(j<i){
                   if((a.length-i-1)<(a.length-j-1)){
                      if(j<(a.length-i-1)){
                          max=j;
                      }
                      else{
                          max=a.length-i-1;
                      }
                  }else{
                       if(i<(a.length-j-1)){
                          max=j;
                      }
                      else{
                          max=a.length-j-1;
                      }
                  }
              }else{
                  if(i<(a.length-i-1)){
                  max=i;
              }else{
                      max=a.length-i-1;
                  }
                  
              }
                    
                if(m<max){
                    m=max;
                }
              }
          }
          
    }
          for(int i=0;i<a.length;i++){
              for(int j=0;j<a.length;j++){
                  if(a[i][j+1]=='G' &&  a[i+1][j]=='G' && 
                          a[i][j-1]=='G' && a[i-1][j]=='G' && !(i==0 && a[i][j]=='G' || j==0 && a[i][j]=='G'||
                         j==a.length-1 && a[i][j]=='G' || i==a.length-1 && a[i][j]=='G') ){
                      a[i][j]='*';
                  }
              }
          }
          
          for(int i=0;i<a.length;i++){
              System.out.println("");
              for(int j=0;j<a.length;j++){
                  System.out.print(a[i][j]);
              }}
          System.out.println(m);
}}
