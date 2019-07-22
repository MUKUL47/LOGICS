package Strings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class panagram {
    public static void main(String[] args) {
        int sum=352,s4=1;
        String s3= "qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun";
        String s1=s3.toLowerCase();
        char s[]=s1.toCharArray();
       
    
      int c=0, sum1=1,addthis=0;
 
      
       for(int i=0;i<s.length;i++){
           if(s[i]!=32){addthis=s[i]-96;
             for(int j=i+1;j<s.length;j++){
                 if(s[i]==s[j]){
                     s[j]=' ';
                   
                  }
              }
              sum1+=addthis;
            addthis=0;
            }
           
   }
        if(sum1==sum){
            System.out.println("PANAGRAM");
        }else{
            System.out.println("NOT PANAGRAM");
        }
}}
