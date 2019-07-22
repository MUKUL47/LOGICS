/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class Ransom {
    public static void main(String[] args) {
        String mag="apgo clm w lxkvg mwz elo bg elo lxkvg elo apgo apgo w elo bg";
        String note="elo lxkvg bg mwz clm w";
        HashMap<String,Integer> magazine = new HashMap<>();
        String s="";int len=0;
        for(int i=0;i<mag.length();i++){
            if(mag.charAt(i)==' '){
                
               
                 if(magazine.containsKey(s)==true){
                      magazine.put(s, magazine.get(s)+1);
                   }else{
                magazine.put(s, 1);
                 }
                s="";
              
            }
            else{
                s+=mag.charAt(i);
           
            }
             if(i==mag.length()-1){
                if(magazine.containsKey(s)==true){
                      magazine.put(s, magazine.get(s)+1);
                   }else{
                magazine.put(s, 1);
                 }
            }
    }System.out.println(magazine);
       
   s="";len=0;
  boolean flag=false;
              for(int i=0;i<note.length();i++){
               if(note.charAt(i)==' '){
                      if(magazine.containsKey(s)==true){
                      magazine.put(s, magazine.get(s)-1);
                   }
               else {
              flag=true;
                   break;
               }
               s="";
            
            }
            else{
                s+=note.charAt(i);
                
           }
             if(i==note.length()-1){
               if(magazine.containsKey(s)==true){
                      magazine.put(s, magazine.get(s)-1);
                   }
               else {
                  
                   break;
               }
               
            }
              }
              System.out.println(magazine);
      if(flag==false){
          for(Map.Entry<String,Integer> e:magazine.entrySet()){
              if(e.getValue()<0){
                  flag=true;
                  break;
              }
          }
      }
        if(flag==true){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
     
       
}}
