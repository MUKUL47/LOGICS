/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class binarytodec {
    public static void main(String[] args) {
String bin="1011001";
char a1[]=new char[bin.length()];
for(int i=0;i<bin.length();i++){
    a1[i]=bin.charAt(i);
}

 int sum=1,sum2=0;
    for(int i=a1.length-1,j=0;i>=0&&j<a1.length;i--,j++){
       if(a1[i]=='1'){
        sum=(int) Math.pow(2, j);
        sum2=sum+sum2;
       
       sum=0;
    
          
         }}
     sum2=10;
 String b="";
        int y=sum2,i=0;
        while(sum2>=1){
         b=sum2%2+b;
          sum2=sum2/2;
          
        }
        System.out.println(b);
        
        System.out.println();
      
    
    
    
    
    
    }}