/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Fractionalknapsack {
    public static void main(String[] args) {
        int item[]={10,20,30};
        float value[]={60,100,120};
           int max=50,size=0,i2=0;
           System.out.println("MAX SIZE : "+max);
        int i=0;
        while(i<value.length){
            value[i]=value[i]/item[i];
            i++;
        }
        for(int i1=0;i1<item.length;i1++){
            for(int j=0;j<item.length;j++){
                
                if(j>i1 && value[i1]<value[j]){
                    
                    
                    float t=value[i1];
                    value[i1]=value[j];
                    value[j]=t;
                    
                    int t1=item[i1];
                    item[i1]=item[j];
                    item[j]=t1;
                 
                    
                }
            }
        }
        for(int m=0;m<item.length;m++){
             value[m]=(float) value[m]*item[m];
        }
        float cost=0;
        while(size<=max){
            if(size+item[i2]>max){break;}
            size+=item[i2];
            
            cost+=value[i2];
            i2++;
            
        }
        
       //System.out.println("O1 KNAPSACK COST :"+cost+" OF TOTAL SIZE :"+size);
        int size2=0;
        if(max>size){
            size2=max-size;
        }
        float remainingcost=(float) size2/item[i2];
        
        System.out.println("FRACTIONAL KNAPSACK COST : "+(remainingcost*value[i2]+cost)+" OF TOTAL SIZE "+(size+size2));
        
    }
  
}
