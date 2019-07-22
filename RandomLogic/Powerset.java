/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Powerset {
    public static void main(String[] args) {
       int j=0,i=0,c=1,x=0;
       String set="12345";
       String temp="";
       int size=(int)Math.pow(2, set.length());
        
       String PS[]=new String[size];
       temp="{}\n";
       while(j<set.length() && i<set.length() ){
           
           if(i==j){
               temp+=""+set.charAt(i)+"\n";
              c++;
           }
           if(i!=j){
               if(j<set.length()){
                  
               String tt=""+set.charAt(i)+"";
               int k,j1=j;
               for( k=j1;k<set.length();k++){ 
                  tt+=set.charAt(k);
                  temp+=tt+"\n";
                  if(k==set.length()-1 && j1<set.length()){
                     
                      j1++;
                      k=j1;
                       
                      tt=set.charAt(i)+"";
                       }
                }
                 
               
           }}
           if(j<set.length()){
              j++;
           }
           if(j==set.length()){
              i++;
              j=i;
           }
       
               
               
    }System.out.println(temp);
       
}}

