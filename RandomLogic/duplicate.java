/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class duplicate {
    String s="10000";
    char c[]=s.toCharArray();
    
   
    public static void main(String[] args) {
   long a=0;
   String k="K",m="M",B="B"; 
   a=23;int c=0;String com="";
     int m1=0,b1=0;
     long b11 = 0;
     b11=a;
  int x=0; long b=a;
   while(a!=0){

       a=a/10;
       
       c++;
       
    
   }
   
  
   if(c==6){
       System.out.println(b/1000+k);
   }
   else if(c>=7 && c<10){
       while(m1<5){
              x=(int)b%10;
    
     b=b/10;
     m1++;
       com=x+com;
       }
        float million=(float)(b11-Integer.parseInt(com))/1000000;
      System.out.println(million+"MILLION");
   }
    }
    }
