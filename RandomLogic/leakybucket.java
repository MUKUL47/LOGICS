
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
public class leakybucket {
    public static void main(String[] args) {
      Scanner s = new  Scanner(System.in);
      leakybucket l= new leakybucket();
      System.out.println("Enter bucket size");
        int bucketsize=s.nextInt();
        System.out.println("Enter flow rate");
        int flow=s.nextInt();
        int x=1;
        while(x!=0){
            System.out.println("Enter packetsize");
            int packetsize=s.nextInt();
            l.leaky(packetsize, flow, bucketsize);
            System.out.println("_0 to stop_");
            x=s.nextInt();
            
        }
      
    }
    void leaky(int packetsize,int flow,int bucketsize){
      if(packetsize>bucketsize){
          System.err.println("OVERFLOW");
      }else{
          while(packetsize>=1){if(packetsize>flow){
              packetsize=packetsize-flow;
              System.out.println("-->"+flow);
          }else{   System.out.println("-->"+packetsize);
                  break;
          }
          }
      }
    }
    
}
