
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
public class yesorno {
    public static void main(String[] args) {
        int yes=0,no=0,result=0;
       
        int choice=1;
        while(yes>=0 && no>=0 ){
         
           Scanner S = new Scanner(System.in);
            System.out.println("ENTER CHOICE 1(yes) or 0(no)");
            int answer = S.nextInt();
            if(answer==1 ){
                yes++;
System.out.println(no);                System.out.println(result);
                
            }
          if(answer==0){
                no++;
              System.out.println(no);
                 System.out.println(result);
            } 

            
            
            
        }
        
        
    }
}
