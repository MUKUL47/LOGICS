c/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author admin
 */
public class Strong_Password {
    public static void main(String[] args) {
        int possibilities=4,c=0,c1=0;
        String Password="!tvk^w$xMIAqf-)pMjS*KZeytibKm+(xPIV@&)kBPd)a#L+K+*)QBSCr&BpC*kTk$P^wGgJAXS!ju@fSpo+I(Q^LC&Lh%^Ce-Su%";
        int passlength=Password.length();
        char P[]=Password.toCharArray();
        for(int i=0;i<P.length;i++){
            if(Special(P[i])==1){
             for(int j=i;j<P.length;j++){
                 if(Special(P[j])==1){
                     P[j]='\u0000';
                     
                 }}possibilities--;
            }
            else if(Upper(P[i])==1){
          
             for(int j=i;j<P.length;j++){
                 if(Upper(P[j])==1){
                     P[j]='\u0000';
                  
                 
             }  
            }     possibilities--;  
            }
            else if(Lower(P[i])==1){
            
             for(int j=i;j<P.length;j++){
                 if(Lower(P[j])==1){
                     P[j]='\u0000';
                    
                 
             }
            }   
            possibilities--;    }
            else if(Number(P[i])==1){
            
             for(int j=i;j<P.length;j++){
                 if(Number(P[j])==1){
                     P[j]='\u0000';
                    
                 }
               
            }   possibilities--;    
            }
        
            
          for(int l=0;l<P.length;l++){
              System.out.println(P[l]);
          }
        } int R1=0;
        if(possibilities>=0 && passlength>=6){
            if(possibilities==0){
               R1=0;
            }else R1=possibilities;
                
            }
            else if(possibilities>=0 && passlength<=5){
                int R=passlength+possibilities;
              System.out.println(possibilities);
                int c5=0;
                if(R<6){ 
                    while(R<6){
                        R++;
                        c5++;
                    }
                 
                } R1=c5+possibilities;
            }
        System.out.println(R1);
        
    }

    private static int Special(char c) {
        int yes=0;
        if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='+'||c=='-'){
            yes=1;
        }
        return yes;
    }

    private static int Upper(char c) {
   int yes=0;
   if(c=='A'||c=='B'||c=='C'||c=='D'||c=='E'||c=='F'
           ||c=='G'||c=='H'||c=='I'||c=='J'||c=='K'
           ||c=='L'||c=='M'||c=='N'||c=='O'||c=='P'
           ||c=='Q'||c=='R'||c=='S'||c=='T'||c=='U'
           ||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'){//A TO Z
       yes=1;
   }
   return yes;
    }

    private static int Lower(char c) {
   int yes=0;
   if(c=='a'||c=='b'||c=='c'||c=='d'||
          c=='e'||c=='f'||c=='g'||c=='h'||c=='i'
           ||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'
           ||c=='o'||c=='p'||c=='q'||c=='r'||c=='s'
           ||c=='t'||c=='u'||c=='v'||c=='w'||c=='x'||c=='y'
        ||c=='z'){
       yes=1;
   }return yes;
    }
    

    private static int Number(char c) {
        int yes=0;
        if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
            yes=1;
        }
        return yes;
    }
 
}
