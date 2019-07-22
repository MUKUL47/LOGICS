/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class palindrome {
  public static void main(String[] args) {
        String s="apple";
   char ss[]=s.toCharArray(); 
    
   for(int i=ss.length-1;i>=0;i--){
       System.out.print(ss[i]);
}
 
  if(ss.length%2!=0){
      for(int i=0;i<ss.length-2;i++){
          int l=ss.length-1;
        char t=ss[i];
          ss[i]=ss[l];
          ss[l]=t;
          l--;
          System.out.println(ss[i]);
      }
  }
  
  }
}
