/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author ADMIN1
 */
public class AlterString {
    public static void main(String[] args) {
        String sent= "ab";
        char sents[] = sent.toCharArray();
        String temp="";
        boolean last=false, started=true;
        int start=0,end=0;
        System.out.println((int)'z');
         for(int i=0;i<sents.length;i++){
        System.out.print(sents[i]);
    }
        System.out.println("");
       
        for(int i=0;i<sents.length;i++)
        {           
            if(sents[i]!=' '){
                temp+=sents[i];
                if(started){ started = false; start=i; } 
                if(i==sents.length-1) last=true;
            }
            if((i<sents.length-1 && sents[i+1]==' ') || last){
                if(temp.length()>1){
                    started=true;
                    end=i;
                    
                    int length=end-start+1;
                    for(int j=start;j<=end;j++){                      
                        if(sents[j]+length>122){
                            sents[j]+=length;
                            sents[j]-=26;
                        }else {sents[j]+=length;}
                        
                       length--;
                    }
                }
                temp="";
            }
        }
    for(int i=0;i<sents.length;i++){
        System.out.print(sents[i]);
    }
        System.out.println("");
       
    }
}
