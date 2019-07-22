/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class gcdofn {
    public static void main(String[] args) {
     gcdofn a1 = new gcdofn();
     a1.lcmofn();
     a1.gcdR(710, 310);
        int a[]={   710,310};
      int m=a[0];
      for(int i=0;i<a.length;i++){
          if(a[i]<m){
              m=a[i];
          }
      }     int gcd=0;
       for(int i=m;i>1;i--){ int d=0;
           for(int j=0;j<a.length;j++){
                            if(a[j]%i==0){
                                    d++;
                              }           }
           if(d==a.length){
               gcd=i;
               break;
           }
       }
       if(gcd==0){
           int yo=gcd+1;
           System.out.println("GCD="+yo);
       }else{
           System.out.println("GCD="+gcd);
       }
       
    
    }
        void lcmofn(){
            int a[]={1, 2, 3, 4, 5, 10, 20, 35};
            int mul=1;
            for(int i=0;i<a.length;i++){
                mul=a[i]*mul;          
            }int x=0,c=0;
            for(int i=1;i<=mul;i++){c=0;
               for(int j=0;j<a.length;j++){
                   if(i%a[j]==0){
                       c++;
                   }
               }
               if(c==a.length){
                   System.out.println("LCM "+i);
              break;
               }


            }

        }
       void gcdR(int a ,int b){
         try{   if(b==0){
                System.out.println("GCD "+a);
                
            }
            gcdR(b,a%b);
        }catch(Exception e){
             System.out.println("");
        }

  }}
