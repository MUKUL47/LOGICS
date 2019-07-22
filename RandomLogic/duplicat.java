/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class duplicat {
    public static void main(String[] args) {
        
    
    int a[]={1,2,3,1,4,5,2,4,1};
    int length=a.length-1;
    
  for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++)
      {
          if(i<j && a[i]==a[j]){
              a[j]=0;
              swap(j,length,a);
          }
      }
          }
    
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    }

    private static void swap(int i, int length, int[] a) {
        
        if(a[length]!=0 && a[length]==a[i] ){
            int t=a[length];
          a[length]=a[i];
            a[i]=t;
            
        }else if(a[length]==0 && a[length]!=a[i]){
         
            swap(i,length-1,a);
        }
        
    }
}