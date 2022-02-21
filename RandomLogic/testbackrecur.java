/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class testbackrecur {
   
    public static void main(String[] args) { int a[]={4,3,0,5,6,0,0};
     int length=a.length-1;
      //  System.out.println(length);
       testbackrecur aa=new testbackrecur();
      aa.a(2,length, a);
     
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
        
    }
    void a(int i,int length, int a[]){
       if(a[length]!=0){
        //   System.out.println(a[length]+""+i);
         int t=a[length];
         
        a[length]=a[i];
           
        a[i]=t;
          
           
       }else{
         
      a(i,length-1,a);
       }
        
    }
}
