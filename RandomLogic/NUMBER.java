/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRACKTHECODE.ARRAYS.ARRAYS.ARRAYS.newpackage;

/**
 *
 * @author admin
 */
public class NUMBER {
    public static void main(String[] args) {
String single_digits[] = { "zero", "one", "two", "three", "four",
                              "five", "six", "seven", "eight", "nine"};
 
    /* The first string is not used, it is to make array indexing simple */
    String two_digits[] = { "ten", "eleven", "twelve", "thirteen", "fourteen",
                     "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
 
    /* The first two string are not used, they are to make array indexing simple*/
    String tens_multiple[] = {"", "", "twenty", "thirty", "forty", "fifty",
                             "sixty", "seventy", "eighty", "ninety"};
       
   String tens_power[] = {"hundred", "thousand","million"};
        int n=513904215,n1=n,t=0,k=-1;
        String y="",ym="",local="";
        while(n>0){
         k++;
            n=n/10;
           
           
        }
     System.out.println(k);
       if(k>5 && k<=8 ){//million
           int kthousand=0,mc=n1,c2=0,m=0,fm=0,sm=0,tm=0;
           String kth="";
           while(mc>0 && c2<=5){
               kth=mc%10+kth;
              mc=mc/10;
              c2++;
           }
       
          c2=0;
           System.out.println(mc);
          while(mc>0){
              m=(mc%10);
              if(c2==0){
                 fm=m;
              }
              if(c2==1){
                  sm=m;
              }
              if(c2==2){
                  tm=m;
              }              
              mc=mc/10;
              c2++;
          }
          
          if(c2==3 && tm!=0){
          ym=single_digits[tm]+" "+tens_power[0]+" ";}
           System.out.println(ym);
          
          if(sm>=1 && fm==0){
              
              ym=ym+tens_multiple[sm]+" MILLION ";
              
          }
          else if(sm==1 && fm>0){
            
              ym=ym+two_digits[fm]+" MILLION ";
          }else if(sm>=1 && fm!=0){
              ym=ym+tens_multiple[sm]+" "+single_digits[fm]+" MILLION ";
          }
          else if(sm==0 && fm>=1){
              ym=ym+single_digits[fm]+" MILLION ";
          }
          
          
         
           
           
          
          
              int newkth=Integer.parseInt(kth);
          n1=newkth;k=5;
       }
        
    
        if(k<=5 && k>=0){
          int c=0,first=0,second=0;
           while(n1>=1){
               int x=(n1%10);
              
            if(c==0 ){ String tens=""; 
                 second=x;
            } else if(c==1){
            first=x;
            }
                   if(c==1){
                       
                     //  System.out.println(first+" "+second);
                      
                       if(first==0 && second!=0){
                           y=single_digits[second]+" "+y;
                       }else if(first>=1 && second==0){
                           y=tens_multiple[first]+" "+y;
                       }
                      else if(first>1 && second!=0){
                           y=tens_multiple[first]+" "+single_digits[second]+" "+y;   
                          }
                       
                       else if(first!=0) {
                           y=two_digits[second]+" "+y;
                       }
                   }
                
                   
               
               
               else if(c==2 && x!=0){
                   y=single_digits[x]+" "+tens_power[0]+" "+y;
               }

               if(c>=3){
                   local=x+local;
               }
               
                 n1=n1/10;
                 c++;
            }
           if(k>=3){
           int n2=Integer.parseInt(local);
           c=0;
           while(n2>=1){
               int o=n2%10;
               if(c==0){
                   y=single_digits[o]+" "+tens_power[1]+" "+y;
               }
               else if(c==1){
                   y=tens_multiple[o]+" "+y;
               }
               else{
                 
                   y=single_digits[o]+" "+tens_power[0]+"  "+y;
               }c++;
               n2=n2/10;
           }}
           
        }System.out.println(ym+" "+y);
     
       
    }
}
