/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

/**
 *
 * @author ADMIN1
 */
public class LRU {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,2,5,3,4,5,8,9};
        lru(a,4);
    }
    private static void lru(int a[], int cache){
        Process P[] = new Process[cache];
        //reset data to -1 and count 0
        for(int i=0;i<cache;i++){
            P[i]= new Process();
            P[i].count=0;
            P[i].data=-1;
        }
        boolean exist=false;
        int pos=0,c=-999;
        for(int i=0,k=0;i<a.length;i++,k++){
            int data=a[i];
           if(k<cache){
                    boolean found=false;
                    for(int l=0;l<=k;l++){
                        if(P[l].data==data){
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                    pos=k;}
                  
                    
                }else{
            for(int j=0;j<cache;j++){
               System.out.print(P[j].data+"("+P[j].count+") ");
                    
           
                    
           
                P[j].count++;
            
                  if(P[j].count>c){
                      c=P[j].count;
                      pos=j;
                  }
                 
                if(a[i]==P[j].data){
                    exist=true;
                    break;
                }
               
                
                
            }}
            System.out.println("\n");
             System.out.println(a[i]+" K"+k+"");
            if(exist!=true){
                
                P[pos].data=a[i];
                    P[pos].count=0;
            }else
                
                exist=false;
            
        }
        for(int i=0;i<cache;i++){
            System.out.print(P[i].data+" ");
        }
   
    }
    public static void removeResidue(int size,Process p){
        
    }
    
        
    
}
class Process{
    int data;
    int count;
    Process nextProcess;
}