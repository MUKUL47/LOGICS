
import java.util.Scanner;

public class weightednum {
    public static void main(String args[]) {
     Scanner S =new Scanner(System.in);
     int T=S.nextInt(),n=1;
   for(int i=0;i<T;i++){
        long D=S.nextLong(),W=S.nextLong();
        System.out.println(DW(D,W,n));}
   
    }
    private static int DW(long D, long W,int n) {
          for(int i=0;i<D-1;i++){
         n*=10;
     }
     int c=0;
     long k=n,i1=n;
     while(((long)i1/k)<10){
        
   long m=i1%k;
   while(m>=10){
       m=m%10;
   }
   
       if(i1/k+W==m){
            c++;
         }
//     if(i1/k-m==w){
//         System.out.println("LEFT TO RIGHT\t=>"+i1);
//     }
     
     
         i1++;
     }
       return c;
    }
    }


