/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPLEMENTATION_HACKERRANK;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class examRush {

    static int examRush1(int[] tm, int t) {
      int c=0,sum=0;
      Arrays.sort(tm);
      for(int i=0;i<tm.length;i++){
          
              sum+=tm[i];
              
          if(sum>t){
              break;
          }c++;
      }
      return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] tm = new int[n];
        for(int tm_i = 0; tm_i < n; tm_i++){
            tm[tm_i] = in.nextInt();
        }
        int result = examRush1(tm, t);
        System.out.println("->"+result);
        in.close();
    }
}

