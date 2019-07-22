/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class firstrepeat {
    public static void main(String[] args) {
      int a[]={1,2,3,4,5,6};
      for(int i=0;i<=4;i++){
          for(int j=i+1;j<4;j++){
            if(i==j)  if(a[i]!=a[j]){
                  System.out.println(a[i]);
                  break;
              }
          }
      }
    }
}
