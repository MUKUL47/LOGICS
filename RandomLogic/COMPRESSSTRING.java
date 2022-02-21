/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRACKTHECODE.ARRAYS.ARRAYS.ARRAYS.newpackage;

/**
 *
 * @author admin
 */
public class COMPRESSSTRING {
    public static void main(String[] args) {
        String ss="aabcccccaaa";
        char s[]=ss.toCharArray();
        String compressed="";
        int i=1,c=1,y=0;
        for(int j=1;j<s.length;j++){
            if(s[j]==s[j-1]){
                y=1;
                break;
            }
        }
        if(y==1){
         while(i<s.length){
           
             if(s[i-1]==s[i]){
                 c++;
                 
             }else{
                 compressed+=s[i-1]+""+c;
                 c=1;
             }
             if(i==s.length-1){
                 compressed+=s[i-1]+""+c;
                 c=1;
             }
            i++;
         }}else{
            compressed=ss;
        }
         
         System.out.println(compressed);
    }
}
