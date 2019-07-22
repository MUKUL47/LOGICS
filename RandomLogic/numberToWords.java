public class numberToWords{

     public static void main(String []args){
   String single_digits[] = { "zero", "one", "two", "three", "four", 
                              "five", "six", "seven", "eight", "nine"}; 
  
    /* The first string is not used, it is to make array indexing simple */
    String two_digits[] = {"", "ten", "eleven", "twelve", "thirteen", "fourteen", 
                     "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"}; 
  
    /* The first two string are not used, they are to make array indexing simple*/
    String tens_multiple[] = {"", "", "twenty", "thirty", "forty", "fifty", 
                             "sixty", "seventy", "eighty", "ninety"}; 
  
    String tens_power[] = {"hundred", "thousand","million"}; 
    int number=189324964;
    String n=Integer.toString(number);
    int c=0,c1=0,pos=1,cc=0;
    boolean done=false;
    String Final="",fn="",c2n="";
    while(number>0){
        c=number%10;
        if(pos<=2 && pos!=3){
            
            c2n+=c;
            
            if(pos==2){
                int f=(int) c2n.charAt(1)-48;
                int s=(int) c2n.charAt(0)-48;
                
                if(f>1 && s>0){
                   c2n=tens_multiple[f]+" "+single_digits[s];
                }else if(f==1 && s>=1){
                    c2n=two_digits[s+1];
                }else if(f==0 && s>=1){
                     c2n=single_digits[s];
                }else if(f>0 && s==0){
                    c2n=tens_multiple[f];
                }else {
                    c2n="";
                }
            }
        }
       
        // System.out.println(c+" "+pos);
       if(pos==3 || cc==n.length()-1){
          if(c1==0){
             //System.out.println(c+" "+pos); 
             
                if(pos==2){
                 Final=c2n;
             }else if(pos==1){
                 Final=single_digits[c];
             }else{
                Final=single_digits[c]+" "+tens_power[0]+" "+c2n;
             }
            // System.out.println(Final); 
          }else if(c1==1){
             if(pos==2){
                 Final=c2n+" "+tens_power[1]+" "+Final;
             }else if(pos==1){
                 Final=single_digits[c]+" "+tens_power[1]+" "+Final;
             }else{
                 Final=single_digits[c]+" "+tens_power[0]+" "+c2n+" "+tens_power[1]+" "+Final;
             }
          }else{
              if(pos==2){
                 Final=c2n+" Million "+Final;
             }else if(pos==1){
                 Final=single_digits[c]+" Million "+Final;
             }else{
                 Final=single_digits[c]+" "+tens_power[0]+" "+c2n+" Million "+Final;
             }
          }
       
           pos=0;
           c1+=1;
           c2n="";
           
       }
      
       pos++;cc++;
       number=number/10;
        
    }
    System.out.println(Final);
     }
}