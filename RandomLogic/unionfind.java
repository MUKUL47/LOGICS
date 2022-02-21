
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class unionfind {
    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        int size=S.nextInt();
        int UF[]= new int[size];
        for(int i=0;i<size;i++){
            UF[i]=-1;
        }
        unionfind uf= new unionfind();
       while(true){
           System.out.println("Enter 2 coordinates to join 0< coordinates <"+(size));
           int c1=S.nextInt();
           int c2=S.nextByte();
           uf.union(c1, c2, UF);
           System.out.println("Continue->0");
           int c= S.nextInt();
           if(c!=0){
               break;
           }
       }
       for(int i=0;i<UF.length;i++){
           System.out.print(UF[i]);
       }
       if(uf.unionfind(2, 3, UF)==0){
           System.out.println("CONNECTED");
       }else{
           System.out.println("NOT CONNECTED");
       }
       
    }
    void union(int n,int n1,int n2[]){
        
        if(n2[n]==-1 && n2[n1]==-1){
            n2[n1]=n1;
            n2[n]=n1;
        }
        else if(n2[n]!=-1 && n2[n1]==-1){
             for(int i=0;i<n2.length;i++){
                if(n2[i]==n){
                    n2[i]=n1;
                }
            }
             n2[n1]=n1;
             System.out.println(n2[n]+" "+n2[n1]);
        }
        
        else if(n2[n]!=-1 && n2[n1]!=-1){
          
            for(int i=0;i<n2.length;i++){
                if(n2[i]==n || n2[i]==n1){
                    n2[i]=n1;
                }
        }
    }
        System.out.print(n2[n]+" "+n2[n1]);
}
int unionfind(int n1,int n2,int n3[]){
    if(n3[n1]==n3[n2] && n3[n1]!=-1 && n3[n2]!=-1){
        return 0;
    }
    return -1;
}
}