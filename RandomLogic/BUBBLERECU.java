/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class BUBBLERECU {
    public static void main(String[] args) {
        int a[]={1,2,6,5,4,8,6,2};
       
//        
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a.length;j++){
//                if(i<j){
//                    if(a[i]>a[j]){
//                        int t= a[i];
//                        a[i]=a[j];
//                        a[j]=t;
//                    }
//                }
//            }
//        }
//       for(int i=0;i<a.length;i++){
//        //   System.out.println(a[i]);
//       }
    BUBBLERECU a1 = new BUBBLERECU();
  int s=0,s1=0;
       a1.bubble(a, s, s1);
       a1.bs(a,s);
    }
   
    public void bubble(int a[],int size,int size1){
     try{  int a1=0;
        if(size1<a.length){
            if(size1>size){
                
                if(a[size]>a[size1]){
                     int t= a[size];
                     a[size]=a[size1];
                       a[size1]=t;
                       
                }
            }
          bubble(a,size, size1+1);
          
            
        }if(size1==a.length-1){
            bubble(a, size+1, 0);
        }if(size==a.length-1)
        while(a1<a.length){
            System.out.println(a[a1]);a1++;
        }
     }catch(Exception e){System.out.println();}    
 }

void bs(int[] a, int s) {

      
    }
    
}
