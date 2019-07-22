/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class mm {
    public static void main(String[] args) {
        double h =2332;
        int f=0,i=0;
        while(h>0){
       
        if(h<30 && h!=0){
            h=h-2.5;
            i++;
           
        }else{
             h=h-30;
        f++;
        }
        }
        System.out.println(f+"."+i);
    }
    
}
