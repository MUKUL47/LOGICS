/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author admin
 */

public class parenthesis_Checking {
    public static void main(String[] args) {
        String parenthesis1="[()][{()[]}][]";
        char parenthesis[]=parenthesis1.toCharArray();
        if(parenthesis1.length()%2==0){
        char[] Open=new char[parenthesis.length-1];
        int top=-1,stop=0;
        
        for(int i=0;i<parenthesis.length;i++){
            
        
        if(parenthesis[i]=='{' ||
           parenthesis[i]=='[' || 
           parenthesis[i]=='(')
        {
           Open[++top]=parenthesis[i];
        
        }
        if(parenthesis[i]=='}' || parenthesis[i]==']' || parenthesis[i]==')')
        {
            if(Open[top]=='{' && parenthesis[i]=='}' || 
               Open[top]=='(' && parenthesis[i]==')' ||
               Open[top]=='[' && parenthesis[i]==']' ){
                System.out.print(Open[top]+""+parenthesis[i]);
               top--;
               stop=1;
               
            }
            else
            {
                System.out.println("UNBALANCED");
                stop=0;
                break;
            }
        }
       
        }
        if(stop==1  ){
            System.out.println("BALANCED");
        }
        }else{
            System.err.println("UNBALANCED (UNEVEN CLOSING AND OPENING BRACES)");
        }
        
}}
