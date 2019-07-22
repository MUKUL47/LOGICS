
import static java.lang.Double.max;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class linearcongrentialequation {
    public static void main(String[] args) {
       int randomNum=0;
        
        Scanner S = new Scanner(System.in);
    
        String s="";int sum=0;
        
   System.out.println("GUESS THE SUM");
   int ans= S.nextInt();
            for(int i=0;i<3;i++){
     randomNum = (int) (Math.random()*6);
         sum+=randomNum;
    
        }if(sum==ans){
            System.out.println("CORRRECT");
        }else{
            System.out.println("NOPE");
        }
            System.out.println("SUM WAAS "+sum);
        
        }
}
