c/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MAKEITANAGRAM {
    public static void main(String[] args) {
      Scanner S11 = new Scanner(System.in);
      String s1=S11.nextLine();
     String s2=S11.nextLine();
char s[]=s1.toCharArray();
char ss[]=s2.toCharArray();
        System.out.println(s1.length()+s2.length());
int A[]= new int[26];
for(int i=0;i<s.length;i++){
    if(A[i]!=0){A[i]-=1;}if(A[i]==0){
    A[s[i]-97]+=1;}
}
for(int i=0;i<ss.length;i++){
 if(A[i]!=0){A[i]-=1;}if(A[i]==0){
    A[ss[i]-97]+=1;}
}int s3=0;
for(int i=0;i<A.length;i++){
   s3+=A[i];
}
        System.out.println(s3);
}}