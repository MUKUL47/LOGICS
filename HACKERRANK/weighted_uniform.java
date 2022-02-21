package IMPLEMENTATION_HACKERRANK;


import java.util.Arrays;
import java.util.Scanner;


public class weighted_uniform {
public static void main(String[] args){
    Scanner S = new Scanner(System.in);
       String s=S.nextLine();
     int queriesCount=S.nextInt();
String result[]= new String[queriesCount];
int queries[]=new int[queriesCount];
for(int m4=0;m4<queriesCount;m4++){
    queries[m4]=S.nextInt();
}
int search[]=new int[s.length()],mi=0;
int L=queries.length;
char[] c=s.toCharArray();
int sum=0;


for(int i=0;i<c.length;i++){
if( i>0 && c[i]==c[i-1]){
sum+=c[i]-96;
search[mi++]=sum;
}
else { 
sum=0;
sum=c[i]-96;
search[mi++]=sum;

}}int o=0;

Arrays.sort(search);

for(int k=0;k<queries.length;k++){
    if(BS(search.length-1,0,queries[k],0,search)>=0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}

}
 private static int BS(int UB, int LB, int s, int mid, int a[]) {
int position=0;
if(LB<=UB){
mid=(UB+LB)/2;
if(a[mid]==s){
    position=mid; return mid;

    
}
if(a[mid]>s){
    UB=mid-1; return BS(UB, LB, s, mid, a);
}else{
    LB=mid+1;
return BS(UB, LB, s, mid, a);
}



    }
   return -13333;    
    
}}