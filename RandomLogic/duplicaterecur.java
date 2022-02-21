/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class duplicaterecur {
    public static void main(String[] args) {
        int a[]={5,4,3,4,2,1,3,1,0};
        
    int n=0;
        int size=0,c=0;
        int size1=1;
        duplicaterecur d = new duplicaterecur();
     // d.dup(a, 0, 0, 1);
        d.iterate(a, 0,n,0);
        
      
    }

public void dup(int a[],int size,int c,int s1){//size=0 size1=1

if( s1<a.length ){
    
   if(a[size]==a[s1] && s1>size){
   s1++;
   c++;
    dup(a, size, c,s1);
 
}  if(s1==a.length){
        
         System.out.println(a[size]+" "+c+" Times");
size=size++;
     s1=size+1;
     
     
         dup(a, size, 0, s1);
    
  
} 
   } 
   else{
       s1++;
       dup(a, size, c,s1++);if(s1==a.length){
        
         System.out.println(a[size]+" "+c+" Times");
size=size++;
     s1=size+1;
     
     
         dup(a, size, 0, s1);
    
  
} }
      

    
}

public void iterate(int a[],int size,int n,int c){
   
   
       
   }
}}