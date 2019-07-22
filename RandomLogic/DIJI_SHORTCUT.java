
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
public class DIJI_SHORTCUT {
    public static void main(String[] args) {
    String F[]=new String[]{"12","13","23","24","34"};
 int cost[]=new int[]{10,24,2,15,7};
    int C=4,sum=0,sum1=999; //max sum of F of 2 digits is 7
    
    for(int i=0;i<F.length;i++){
        for(int j=0;j<F.length;i++){
            if(checkcommon(F[i],F[j])==true && i<j){
                sum=cost[i]+cost[j];
            }
        }
        if(sum<=sum1){
            sum1+=sum;
        }
       
    }
    
    }

    private static boolean checkcommon(String string, String string0) {
      
        char a1[]=string.toCharArray();
        char a2[]=string0.toCharArray();
        boolean yes=false;
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j] && i<j){
                    yes=true;
                    break;
                            
                }
            }
        }
        return yes;
    }
}