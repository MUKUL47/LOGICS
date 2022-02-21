/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class CRC {
    public static void main(String[] args) {
       int p=101101,polynomial=p,msg=100,m2=msg;
       int n=1,pc=0,mc=0;
       while(p>=1 ){
           p=p/10;
          pc++;
       }
       while(msg>=1){
           msg=msg/10;
           mc++;
       }
 
     String add="";
     String m1=Integer.toString(m2);
       
     for(int i=0;i<pc-mc;i++){
         add=add+"0";
     
     }
     m1=m1+add;
    int mm1=Integer.parseInt(m1);
        System.out.println(mm1+"\n"+polynomial);
        char newmsg[]=new char[pc];
        char poly[]= new char[pc];
        for(int i=0;i<pc;i++){
        newmsg[i]=(Integer.toString(mm1)).charAt(i);
        poly[i]=(Integer.toString(mm1)).charAt(i);
        }
        char remainder[]= new char[pc];
     int till=pc-mc;
     do{
         for(int i=0,j=0;i<pc && j<pc;i++,j++){
           
               
                     if(newmsg[i]==poly[j]){
                        
                         remainder[i]='0';
                     }
                     else{  
                         remainder[i]='1';
                     }
                 }
             
             for(int i=0;i<pc-1;i++){
             remainder[i]=remainder[i+1];
             }  
             for(int i=0;i<pc;i++){
                 System.out.print(remainder[i]);
             }System.out.println("");
             newmsg=remainder;   
             
         
         till--;
         
     }while(till>=0);
     
        for(int i=0;i<pc;i++){
            System.out.println(remainder[i]);
        }
       
   
        
    }
   
    
}
