import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class servercheck {

   
    public static void main(String[] args) {
        
      Scanner ss=new Scanner(System.in);
      int n=24;  
      int[] position = new int[n];
         int[] height = new int[n];
         
         for(int p=0;p<n;p++){
             position[p]=ss.nextInt();
         }
         for(int p1=0;p1<n;p1++){
             height[p1]=ss.nextInt();
         }
        System.out.println(position.length);
         String ret="";
         int i=0,j=position.length-1,l=1,r=1,k=0;
        for(i=0;i<position.length-1 ;i++){
            int nextdrop=CheckAvailability((position[i]+height[i]),position,i+1,'l',i);
            int c=i;
            
            if(nextdrop==0){
               
           l++;}
            if((position[i]+height[i])>position[position.length-1]){
                l++;
            }
          
         
           
            }
          
        for(j=position.length-1;j>0;j--){
            
          int backdrop=CheckAvailability(position[j]-height[j],position,j+1,'r', j);
          int current=j;
           System.out.println("=>"+position[j]+"->"+(position[j]-height[j])+"\t ND "+backdrop+"\t count"+r);  
            if(backdrop==0){
              r++;          
            }
            if((position[j]-height[j])<=position[0]){
                r++;
            }
          
         
     
       
             
            }
        System.out.println("LEFT->"+l);
        System.out.println("right->"+r);
          if(l>=position.length && r>=position.length){
           ret="BOTH";
        }
        else if(l!=position.length && r>=position.length){
           ret="RIGHT";
        }
          else if(l>=position.length && r!=position.length){
           ret="LEFT";
        }
          else{
            ret="NONE";
        }
        
        System.out.println(ret);
    }
   

 

    private static int CheckAvailability(int i,int [] position,int till,char where,int pos) {
     int yes=-1;

  if(where=='l'){
   }
  else if(where=='r'){
      int copy =i;
      while(i<position[position.length-1]){
           if(Arrays.binarySearch(position, i)>0 && i<=position[pos-1] ){
            yes=0;
           System.out.println("AT "+i); break;
        }
           
        i++;
      }
  }
    return yes;
}}
