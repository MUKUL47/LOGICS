/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class stack {
    public static void main(String[] args) {
        
        String s="yoos";
        char c[]=s.toCharArray();
int mm=0;
    int nn=0;
        String paren="()";
        String CN="";
        char closed[]=paren.toCharArray();
     for(int i=0;i<closed.length-1;i++){
         if(closed[i]==')'){
             mm++;
             
         }for(int j=0;j<closed.length-1;j++){
         if(closed[j]=='('){
             nn++;
         }}
}
     if(nn==mm){
         System.out.println("BAlANCED");
     }
         
     }
}