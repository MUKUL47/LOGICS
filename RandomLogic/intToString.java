/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN1
 */
public class intToString {
    public static void main(String[] args) {
         String single_digits[] = { "zero", "one", "two", "three", "four", 
                              "five", "six", "seven", "eight", "nine"}; 
  
    
    String two_digits[] = {"", "eleven", "twelve", "thirteen", "fourteen", 
                     "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"}; 
  
   
    String tens_multiple[] = {"", "ten", "twenty", "thirty", "forty", "fifty", 
                             "sixty", "seventy", "eighty", "ninety"}; 
  
    String tens_power[] = {"hundred", "thousand","million","billion"}; 
   int number=8562,pos=1,nextT=0;
   String duplicate=number+"";
//401,404  ,417 413,410  ,423
    int last2=0;
    String finalString="",check=""+number;int x=0;
   while(number>0){
      
       int currentNumber=number%10;
       
       if(pos==2 || pos==1){
           last2+=currentNumber*((int)Math.pow(10, pos)/10);
           if(check.length()>=2){
               x=2;
           }else{
               x=1;
           }
       }
       if(pos==x){
              if(last2%10 !=0 && last2/10==0 ){
                  
              finalString+=" "+single_digits[last2%10]+" ";
           }
           else if(last2%10 >0 && last2/10>1){
               finalString+=" "+tens_multiple[last2/10]+" "+single_digits[last2%10];
           }
           else if(last2%10 !=0 && last2/10==1){
               finalString+=two_digits[last2%10]+" ";
           }
           else if(last2%10 ==0 && last2/10>0){ 
                finalString+=" "+tens_multiple[last2/10]+" ";
           }else{ 
               finalString+=" "+two_digits[last2%10]+" ";
           }
              
       }
   
       if(pos==3){
          
           pos=0;
           if(nextT==0 && currentNumber!=0){
               finalString=single_digits[currentNumber]+" "+tens_power[0]+" "+finalString+" ";
               last2=0;
               check="";
               check=duplicate.substring(0, 3);
               nextT++;
                       }
       }else if(pos<=3 && nextT>0){
           if(pos!=1){
             finalString+=" "+tens_power[1];
           }else{
              
               finalString+=single_digits[currentNumber]+" "+tens_power[0];
           }}

        pos++;       System.out.println(pos+" "+currentNumber);
       number/=10;
   }
        System.out.println(finalString);
    }
}
