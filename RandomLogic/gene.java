
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class gene {
    public static void main(String[] args) {
        String s ="AGCGTGCC";
        HashMap<Character,Integer> gene = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(gene.containsKey(s.charAt(i))==false){
                gene.put(s.charAt(i),1);
            }else{
                gene.put(s.charAt(i),gene.get(s.charAt(i))+1);
            }
        }
        System.out.println(gene);
    }
}
