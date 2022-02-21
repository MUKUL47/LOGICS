/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class maxminrecu {
    public static void main(String[] args) {
        int a[]={5,2,3,84,51,6};
        int size=0;
        maxminrecu a1 = new maxminrecu();
   a1.maxmin(a, a[0], 0,a[0]);
        
    }
    public void maxmin(int a[],int max,int size,int min){
        if(a.length==size){
            System.out.println("max : "+max);
            System.out.println("min : "+min);
            
        }
        if(max<a[size] ){
            max=a[size];
        }
        if(min>a[size]){
            min=a[size];
        }
       
        
        maxmin(a, max, size+1,min);
        
    }
}
