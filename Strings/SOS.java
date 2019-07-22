/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author admin
 */
public class SOS {
    public static void main(String[] args) {
        String s="SOSOOSOSOSOSOSSOSOSOSOSOSOS",s2="";
        
        char s1[]=s.toCharArray();
        int i=0,c=0,signal=s.length()/3;
        while(i<s1.length){
            s2+=s1[i];
           
               if(s2.length()==3){
                  char check[]=s2.toCharArray();
                  if(check[0]!='S'){
                      c++;
                  }
                  if(check[1]!='O'){
                      c++;
                  }
                  if(check[2]!='S'){
                      c++;
                  }
                   s2="";
               }
               
                        i++;
    }
        System.out.println(c);
    }
}
