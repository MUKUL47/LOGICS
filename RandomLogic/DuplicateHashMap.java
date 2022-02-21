
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
public class DuplicateHashMap {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,3,4,1,3};
        HashMap<Integer,Integer> d= new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(d.containsKey(a[i])==false){
                d.put(a[i], 1);
            }else{
                d.put(a[i], d.get(a[i])+1);
            }
        }
        System.out.println(d);
       int c=a.length-1;
       for(;c>0;c--){
           for(Map.Entry<Integer,Integer> e:d.entrySet()){
           if(e.getValue()==c){
               System.out.println(e.getKey()+"->"+e.getValue());
                          }}
          
       }
    }
   
}
