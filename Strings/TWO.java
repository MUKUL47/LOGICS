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
public class TWO {
    public static void main(String[] args) {
        int i=0,j=1,k=0,c=0,c1=0,c2=0;
        String a1="beabeefeab";
       char a[]=a1.toCharArray();
        while(i<MAX_L(i,a) && j<MAX_L(i,a)&& j>i){
           k=0;
            while(k<a.length){
                if(a[k]==a[i]){
                    if(PUSH(a[i])==0){
                        k=a.length-1;
                    }else{
                        c++;
                    }
                }
                else if(a[k]==a[j]){
                    if(PUSH(a[j])==0){
                        k=a.length-1;
                    }else{
                        c++;
                    }
                }
            }
            if(c>c1){
                c1=c;
                for(int o=0;0<a.length;o++){
                    if(o%2==0){
                        System.out.println(a[i]);
                    }else{
                        System.out.println(a[j]);
                    }
                }
                
            }c=0;
            if(j<MAX_L(i, a)){
                j++;
            }
            if(j==MAX_L(i, a)-1){
                i++;
                j=i+1;
            }
        }
    }

    private static int MAX_L(int i, char a[]) {
     int c=0,i1=i+1;
        while(i1<a.length){
            if(a[i1]==a[i]){  break;}
            i1++;
        }
        return i1;
    }

}
