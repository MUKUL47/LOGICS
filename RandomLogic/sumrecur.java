/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class sumrecur {

    public static void main(String[] args) {
        int a[]={1,2,33,4,5};
int n=0,s=0,size=0; 
int q=123;
float aaa=(float) 12.3;
  
        sumrecur a1 = new sumrecur();
        a1.sum(a, s, size);
        a1.multable(5,1,10);
        a1.digits(3143, 0);
        System.out.println((int)((aaa-q/10)*10));
        a1.findfirstandlast(2345);
        
       a1.palindromeofdigits();
       a1.maxmin(a, a[0], 0);
      
    
    }
    public void sum(int a[],int s,int size){
     
       if(size<a.length){
           if(a[size]%2==0){
           int sum=s+a[size];
           int si=size+1;
            
            sum(a, sum, si);
           }else{size=size+1;
           sum(a, s, size);
           }                  

        }
      
       
   }
    public void multable(int n, int till10,int tilll){
        if(till10<tilll+1){
            System.out.println(n+"*"+till10+"="+n*till10);
         int   till=till10+1;
            multable(n, till,tilll);
        }
    }
    public void digits(int n,int t){
        if(n>1){
          int m =n/10;
          int t1=t+1;
          digits(m,t1);
        }else{
            System.out.println(t);
        }
    }
    public void findfirstandlast(int n){
        
        int m=n;
        while(n>1){
            n=n/10;
   if(n>1 && n<10){
               System.out.println("first digit "+(int)(n));
           }
        }
        
        float n1=(float)m/10;
        System.out.println("last digit "+(int)((n1-m/10)*10));

   
        
    }
    
    public void palindromeofdigits(){
        int a=1234,n=0;String digi="";
        while(a!=0){
            n=a%10;
            a=a/10;
           
            System.out.print(digi+Integer.toString(n));
            System.out.print("");
        }
    }
    public void maxmin(int a[],int max,int size){
         if(a.length==0){
            System.out.println("max :"+a[0]);
        }
       if(max<a[size]){
           max=a[size];
    
           maxmin(a,max,size+1);
        System.out.println(max);}
      
    }
    
    }
