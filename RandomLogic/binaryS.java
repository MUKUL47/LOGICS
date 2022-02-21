
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
public class binaryS {
    public static void main(String[] args) {
        int a[]=new int[1000000];
        int UB=a.length-1,s=650003,mid=0,LB=0,stop=222;
        for(int i=a.length-1;i>=0;i--){
            a[i]=i;
        }
        Arrays.sort(a);
       BS(UB,LB,s,mid,a);
       
       
            
           
        
        
    
}

    private static int BS(int UB, int LB, int s, int mid, int a[]) {
int position=0;
if(LB<=UB){
mid=(UB+LB)/2;System.out.println(mid);
if(a[mid]==s){
    position=mid;    System.out.println("FOUND AT "+mid);

    
}
if(a[mid]>s){
    UB=mid-1; return BS(UB, LB, s, mid, a);
}else{
    LB=mid+1;
return BS(UB, LB, s, mid, a);
}



    }
   return -13333;    
    
}}
