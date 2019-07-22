/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class reverseInPlace {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6},Imid,Jmid;
       if(a.length%2!=0){
              Imid=(a.length/2-1);
              Jmid=Imid+2;
           for(int i=0,j=a.length-1;i<=Imid && j>=Jmid;i++,j--){
               int t=a[i];
               a[i]=a[j];
               a[j]=t;
           }
       }else{
            Imid=(a.length/2);
              Jmid=Imid;
         
            for(int i=0,j=a.length-1;i<=Imid && j>=Jmid;i++,j--){
               int t=a[i];
               a[i]=a[j];
               a[j]=t;
           }
       }
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
    }
}
