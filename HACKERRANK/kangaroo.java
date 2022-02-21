/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPLEMENTATION_HACKERRANK;

/**
 *
 * @author admin
 */
public class kangaroo {
    public static void main(String[] args) {
        int Jumps[]={0,2,5,3};
        int first=Jumps[1]-Jumps[0];
        int second=Jumps[2]-Jumps[3];
        int FS=Jumps[0];
        int SS=Jumps[2];
        if(first>second){
        while(FS!=SS){
            FS+=first;
            SS+=second;
        if(FS==SS){
            System.out.println("BOTH STOPPING AT "+FS);
            break;
        }
        }
        
        }else{
            System.out.println("NOT POSSIBLE");
        }
        
    }
}
