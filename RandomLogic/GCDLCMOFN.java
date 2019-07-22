
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
public class GCDLCMOFN {
    public static void main(String[] args) {
       GCDLCMOFN a1 = new GCDLCMOFN();
     int a[]={3000,197};
     Arrays.sort(a);
     int large=a[a.length-1];
     int small=a[0];
       a1.GCD(a,small);
       a1.LCDM(a,large);
       
    }

    private void GCD(int a[],int small) {
 int gcd=0;
        
        Arrays.sort(a);
       
  
        for(int i=small;i>0;i--){int c=0;
            for(int j=0;j<a.length;j++){
                if(a[j]%i==0){
               
                    c++;
                }
                
            }
        if(c==a.length){
            gcd=i;
            break;
        }    
            
        }System.out.println("gcd "+gcd);
        
    }

    private void LCDM(int[] a,int small) {
int mul=1;
int x=0,lcm=0;
        for(int i=0;i<a.length;i++){
    mul=mul*a[i];
        }
     
      for(int i=small;i<=mul;i++){int c=0;
           for(int j=0;j<a.length;j++){
           if(i%a[j]==0){
               c++;
           }
         }
         if(c==a.length){
             lcm=i;
             break;
         }
      }
        System.out.println("LCM "+lcm);
    
    }}