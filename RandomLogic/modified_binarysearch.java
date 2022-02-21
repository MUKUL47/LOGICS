
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class modified_binarysearch {
    public static void main(String[] args) {
       int n=888888;
        int a[]= new int[9999999];
        for(int i=0;i<a.length;i++){
            a[i]=i;
        }
        
        int D=0;
        if(a.length%2!=0){
            D=(a.length+1)/2;
         
        }else{
            D=a.length/2; 
        }
       System.out.println(D);
        if(n>=D){
        for(int i=D;i<a.length;i++){
            System.out.println(a[i]);
            if(a[i]==n){
                System.out.println("YES1");
                break;
            }
        }}else{ for(int i=0;i<D;i++){
           System.out.println(a[i]);
            if(a[i]==n){
                System.out.println("YES11");
                break;
            }
        }
            
        }
        

    }
}
