import com.sun.scenario.effect.Merge;
import java.util.*;

public class leasdader{
   // int a[]={1,2,2,6};
    
    int a[]={1,3,1,4,2};
    int aa[]=a;
    int Store[]=new int[50];
    int store1[]=new int[50];
        int[] result= new int[store1.length+Store.length];
   int r=0;
    
  //  int el1[]={};
            int f=0;
    int r1=0;        int cc=0;

    public static void main(String[] args) {
        leasdader l = new leasdader();
        l.sumisUPBABE();
        
      
        
    }
    void sumisUPBABE(){
      
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
              if(i<j && i!=j){  r=a[i]+a[j]+f;
                f=a[j]+f;
                if(a[j]==a[a.length-1]){
                    f=0;
                                }
                r1=aa[i]+aa[j];
             
                  System.out.println("r1\t:"+r1);
                  System.out.println("r\t:"+r);
                  Store[i]=r;
                    store1[i]=r1;
                    System.out.println(store1[i]);
                    
                    System.out.println(Store[i]);
            }
            
    
       
            
        } 
               
           }
     
        
        
        for(int i=0;i<store1.length+Store.length;i++){
            
          
                            
                            ;
        }

        for(int i=0;i<store1.length;i++){
               result[i]=store1[i];
               cc++;
                       
            }
        
        for(int i=cc;i<Store.length;i++){
               result[i]=Store[i];
               
                       
            }
         int NOduplicate[]=new int[result.length];
       for(int i=0;i<result.length;i++){
          
          for(int j=0;j<result.length;j++){
          if(i!=j){
              if(result[i]==result[j]){{
                  result[i]-=result[j];
                  
              }
              }}
       }
        if(result[i]!=0){
              NOduplicate[i]=result[i];
                      
       System.out.println("no dup"+NOduplicate[i]);       
          
    }}}}

    
    
    
    
    
    
    
    
    
    
    
    
    