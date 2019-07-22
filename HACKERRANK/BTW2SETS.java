package IMPLEMENTATION_HACKERRANK;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class BTW2SETS {
    public static void main(String[] args) {
        int FS[]={2,4};
        int SS[]={16,32,96};
        int M=FS[0],M1=SS[0],c=0,c1=0;
        String answer="";
        for(int i=0;i<FS.length;i++){
            if(FS[i]>M){
                M=FS[i];
            }
        }
        
        for(int i=0;i<FS.length;i++){
            if(SS[i]<M1){
                M1=SS[i];
            }
        }
        for(int i=M;i<=M1;i++){
            for(int j=0;j<FS.length;j++){
                if(i%FS[j]==0){
                    c++;
                    
                } 
            }
            for(int j=0;j<SS.length;j++){
                if(SS[j]%i==0){
                    c1++;
                }
                
            }
            if(c==FS.length && c1==SS.length){
                System.out.print(c1);break;
            }
            c=0;c1=0;
        }
       
        
    }
}
