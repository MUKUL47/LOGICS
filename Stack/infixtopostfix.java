/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Stack;

/**
 *
 * @author admin
 */
public class infixtopostfix {

    public static void main(String[] args) {
    String Exp="a*a+a*a";
    String finalExp="";
    Stack<Character> Operator = new Stack<Character>();
    for(int i=0;i<Exp.length();i++){ 
        if(Exp.charAt(i)=='a'){ finalExp += Exp.charAt(i); }
        else{
            while(!Operator.isEmpty() && priority(Exp.charAt(i))<= priority(Operator.get(Operator.size()-1))){
                finalExp+=Operator.pop();
            }
            Operator.push(Exp.charAt(i));
        }
    }
    while(!Operator.isEmpty()) { finalExp += Operator.pop(); }
        System.out.println(finalExp);
        
    }
   static int priority(char operator){
        switch(operator){
            case '+' : 
            case '-' : return 1;
            case '*' : 
            case '/' : return 2;
            case '^' : return 3;
            
        }
        return -1;
    }
}
