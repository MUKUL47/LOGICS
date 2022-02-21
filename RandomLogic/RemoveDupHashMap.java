
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class RemoveDupHashMap {
    public static void main(String[] args) {
        int a[]= new int[]{1,2,1,3,4,2};
        
        int c=0;
        HashMap<Integer,Integer> rd= new  HashMap<>();
        for(int i=0;i<a.length;i++){
            if(rd.containsKey(a[i])==false){
                rd.put(a[i],1);
               
            }
        }
       for(Map.Entry<Integer,Integer> e:rd.entrySet()){
           a[c++]=e.getKey();
       }
       for(int i=0;i<c;i++){
           System.out.println(a[i]);
       }
        
        
        
    }
}
