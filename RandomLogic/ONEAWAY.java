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
public class ONEAWAY {
    public static void main(String[] args) {
        String s1="pale",s2="ple";
        String big="",small="";
        if(s1.length()>s2.length()){
            big=s1;
            small=s2;
        }else if(s1.length()<s2.length()){
            big=s2;
            small=s1;
        }
        else{
            big=s1;
            small=s2;
               }
        int i=0,edits=0,c=0;
       for( i=0;i<small.length();i++){
           
           for(int k=0;k<small.length() ;k++){
               if(big.charAt(i)==small.charAt(k)){
                   c++;
               }
           }
           if(c<1){
               edits++;
           }
       }
     ;
        System.out.println(edits+(big.length()-i));
//        
//        if(big.length()!=small.length()){
//        while(i<=big.length() && j<=small.length()){
//            System.out.println(big.charAt(i)+"<->"+small.charAt(j));
//            if(big.charAt(i)!=small.charAt(j) && j<=small.length()){
//                edits++;i++;j++;
//            }
//         else{
//                i++;j++;
//            }
//            System.out.println(edits);
//            if(j==small.length()){
//               
//                break;
//            }
//        }}
       
}}
