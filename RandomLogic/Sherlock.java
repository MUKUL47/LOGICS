
import java.util.Scanner;

public class Sherlock{
    public static void main(String[] args) {
   Scanner S = new Scanner(System.in);
        int a[]=new int[10000];
           int i=0,m=1,j=m+1,sum=0,sum1=0,yooo=0;//9961183
      String yo="NO";//B4 m= 9961464
   for(int i1=0;i1<a.length;i1++){
       a[i1]=S.nextInt();
if(i1>=2){
       sum+=a[i1];}
   }
        System.out.println(SUM(sum,i,j,m,sum1,a));

//  
//   while(i<m && j<a.length && j>m){
//       if(i<m){
//       sum1+=a[i];
//          
//               i++;}
//       if(i==m && sum1==sum){
//          yooo=1;
//         break;
//       }
//       else if(i==m && sum1!=sum){
//        System.out.println(sum1+"<"+a[m]+">"+sum);
//          sum-=a[m+1]; 
//          m++;
//          j=m+1;
//       }
//   }
//
//   if(yooo==1){
//       yo="YES";
//   }
       
    }

    private static boolean SUM(int sum, int i, int j, int m, int sum1,int a[]) {
boolean yo=false;
if(i<a.length-2){
if(i<m){   
    System.out.println(sum1+" "+sum);
   return SUM(sum, i+1, j, m, sum1+a[i], a);
}
 if(i==m && sum1==sum){    return true;}
 else if(i==m && sum1!=sum){return SUM(sum-a[m+1], i, m+1, m+1, sum1, a);}}
return yo;
    }
}