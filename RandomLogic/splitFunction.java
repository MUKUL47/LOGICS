/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN1
 */
public class splitFunction {
    public static void main(String[] args) {
        int number = 987654321,n1=9;
        String Number=""+number;
        StringBuilder s = new StringBuilder();
        s.append(Number);
         s=s.reverse();
         String n="";
        Number =s.toString();
        while(n1>=0){System.out.println(n1);
            if(n1>3){
                System.out.println(  Number.substring(0, 3));
               n1-=3;           
            }if(n1<=3){
                
            System.out.println( Number.substring(3, Number.length())); 
            n1-=Number.length();
            
            break;}
            
            
        } 
            
        
    }
}
