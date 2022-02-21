/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author admin
 */
public class Alternate {
    public static void main(String[] args) {
        String s1="beabeefeab",s11="";
        char s[]=s1.toCharArray();
        int i=0,j=1,k=0,c=0,c2=0;
        while(i<=Max_L(s[i],i+1,s) && j<=Max_L(s[i],i+1,s) ){
            while(k<s.length){
                if(s[k]==s[i] || s[k]==s[j]){
                    char c1[]=s11.toCharArray();
                    if(s[k]==c1[c1.length-1]){
                        break;
                    }
                    else{
                        s11+=s[k];
                        c++;
                    }
                }
                k++;
                
            }
            if(c>c2){
                c2=c;
                System.out.println(s11);
            }
            s11="";
            c=0;
            
            if(j<Max_L(s[i], i+1, s)){
                j++;
            }
            if(j==Max_L(s[i], i+1, s)){
                if(i+1==i+2){
                    int x=i+1;
                    int y=i+2;
                    while(s[x]==s[y]){
                        x++;y++;
                    }i=x;j=y;
                }else{
                    i=i+1;
                    j=i+1;
                }
            }
        }
    }

    private static int Max_L(char c, int i, char[] s) {
  int throwthis=1;
  while(i<s.length){
      if(s[i]==c){
          break;
      }
      throwthis++;
  }
  return throwthis;
    }
}
