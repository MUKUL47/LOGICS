/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class alternate {
    public static void main(String[] args) {
        int a[]={1,1,1,1,1,-1,-1,-1,-1,-1};  
        for(int i=0;i<a.length;i++){
            if(i%2==0){//odd
                if(a[i]>0){
                    for(int j=i;j<a.length;j++){
                        if(a[j]<0){
                            int t=a[j];
                            a[j]=a[i];
                            a[i]=t;
                        }
                    }
                }
            }
            else if(i%2!=0){//even
                
                if(a[i]<0){
                    for(int j=i;j<a.length;j++){
                       if(a[j]>0){
                            int t=a[j];
                            a[j]=a[i];
                            a[i]=t;
                        } 
                    }
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    
    } 
    
}
