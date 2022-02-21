/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

/**
 *
 * @author ADMIN1
 */
public class selfMadeHashing {
    public static void main(String[] args) {
        String pass="A4C";
        char[] binaryHash=pass.toLowerCase().toCharArray();
        for(int i=0;i<binaryHash.length;i++){
            int n = (int)binaryHash[i]*binaryHash.length;
            System.out.println(n);
        }
        String finalPass="";
        hashfunction(pass);
        
        
    }
    static void hashfunction(String password){
        
    }
}
