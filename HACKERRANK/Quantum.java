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
public class Quantum {
    public static void main(String[] args) {
        int i=0,j=0,c=0,c1=1;
        int min=0,SUM=0,m=0;
        int max[]= new int[10];
        char a[][]=new char[][]{
        {'B','G','B','B','G','B'},
        {'G','G','G','G','G','G'},
        {'B','G','B','B','G','B'},
        {'G','G','G','G','G','G'},
        {'G','G','G','G','G','G'},
        {'G','G','G','G','G','G'},
        
       };
      //  System.out.println(a.length);
        while(i<a.length && j<a.length){
          if(i==0 && a[i][j]=='G' || j==0 && a[i][j]=='G'||
                  j==a.length-1 && a[i][j]=='G' || i==a.length-1 && a[i][j]=='G' ){
              c1=1;
          }
          if(!(i==0||j==0||i==a.length-1||j==a.length-1) && a[i][j]=='G'){
       
              if(i<j){
                  if((a.length-i-1)<(a.length-j-1)){
                      if(i<(a.length-i-1)){
                          min=i;
                      }
                      else{
                          min=a.length-i-1;
                      }
                  }else{
                       if(i<(a.length-j-1)){
                          min=i;
                      }
                      else{
                          min=a.length-j-1;
                      }
                  }
              }else if(j<i){
                   if((a.length-i-1)<(a.length-j-1)){
                      if(j<(a.length-i-1)){
                          min=j;
                      }
                      else{
                          min=a.length-i-1;
                      }
                  }else{
                       if(i<(a.length-j-1)){
                          min=j;
                      }
                      else{
                          min=a.length-j-1;
                      }
                  }
              }else{
                  if(i<(a.length-i-1)){
                  min=i;
              }else{
                      min=a.length-i-1;
                  }
                  
              }
              
               for(int i1=1;i1<=min;i1++){
                   if(a[i+c1][j]==a[i-c1][j] && a[i][j+c1]==a[i][j-c1] && a[i][j+c1]=='G' && a[i+c1][j]=='G'){
                          a[i][j]='x';
                       a[i+c1][j]='X';
                           a[i-c1][j]='X';
                               a[i][j+c1]='X';
                                   a[i][j-c1]='X';
                                   
                                   for(int a1=0;a1<a.length;a1++){
                                       System.out.println();
                                   for(int a2=0;a2<a.length;a2++){
                                       System.out.print(a[a1][a2]);
                                       }    
                                   } System.out.println("\n\n\n");
                       c1++;
                   }
               }if(c1!=1){
              // System.out.println(c1+1);
               max[m++]=c1+1;
               }else{
                 ///  System.out.println(c1);
                   max[m++]=c1;
               }c1=1;
               min=-999;
          }
           
            
            
            j++;
            if(j==a.length){
                i++;
                j=0;
                
            }
        }int M=max[0];
        for(int i1=0;i1<max.length;i1++){
            if(M<max[i1]){
                M=max[i];
            }
        }
        int find=M*2-1,c11=0;
        for(int i1=0;i1<max.length;i1++){
            if(M==max[i1]){
                c11++;
            }
        }int u=1;
        for(int i1=0;i1<c11;i1++){
            u*=find;
        }
        System.out.println(u);
        
    }
}
