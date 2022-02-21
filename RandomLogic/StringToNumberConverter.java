/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class StringToNumberConverter {
    public static void main(String[] args) {
        StringToNumberConverter s = new StringToNumberConverter();
        System.out.println(s.MyParse("343")+100);
        
        
    }
    int MyParse(String number){
        int l=number.length()-1;
        int times=(int)Math.pow(10, l);
        int on=0,cn=0;
        for(int i=0;i<number.length();i++){
            
            cn=(int)number.charAt(i)-48;
            cn*=times;
            on+=cn;
            times/=10;
        }
        return on;
    }
    
}
