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
public class alternate_2 {
    public static void main(String[] args) {
        String test="aabcccbaabaabca";
        int c=0;
          for (int j = 0; j < test.length()-1; j++) {
            if(test.charAt(j)==test.charAt(j+1))
                c++;
          } 
        System.out.println(c);
    
        
    }
}
