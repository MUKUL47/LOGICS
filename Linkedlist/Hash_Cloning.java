/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

/**
 *
 * @author admin
 */
import java.util.*;
public class Hash_Cloning {
    public static void main(String args[]) {
    int size=12;
    Scanner S = new Scanner(System.in);
    node N[]= new node[size];
    for(int ii=0;ii<size;ii++){
      
    N[ii]=new node();
    N[ii].index=ii;
    N[ii].data=size+1;
    }
    int i=0;
 int   size1=size;
    while(i<size1){
        int data1=S.nextInt();
        STORE(data1,size,N);
        i++;
    }System.out.println("\n");
        show(N, size);
        delete(N, S.nextInt(), size);
        show(N, size);
    }
    static void STORE(int data,int size, node[] N){
        int I=data%size;
        System.out.println(N[I].data);
        if(N[I].data==size+1){
           N[I].data=data;
          System.out.println("INSERTED AT POSITION "+I);
        }else{
            node T=N[I];
            int i=1;
            while(T.next!=null){
                T=T.next;
                i++;
            }
            node next=new node();
            T.next=next;
            next.data=data;
        System.out.println("INSERTED AT CLONE POSITION "+i+" OF "+I);
        }
    }
    static void show( node[] N, int size){
        
        for(int i=0;i<size;i++){
           if(N[i].next==null && N[i].data!=size+1){
               System.out.println("("+i+")"+N[i].data);
           }else if(N[i].data!=size+1){int i1=0;
               
             node n=N[i];
               while( n.next!=null){
                
                  System.out.print("("+i+"."+i1+")"+n.data+"->");
                  n= n.next;   i1++;
                }
              System.out.print("("+i+"."+i1+")"+n.data+"\n");
                    
                
               }
           
           }
        }
    static String search(node[] N,int data,int size){
      String position="NOT FOUND";
        int i=data%size;
        if(N[i].data!=size+1){
            if(N[i].data==data){
                position=i+"."+0;
            }
            else if(N[i].next!=null){
                node t=N[i];
                int i1=0;
                while(t.next!=null){
                  
                    if(t.data==data){
                        position="FOUND AT "+i+"."+i1;
                        break;
                    }  i1++;
                    t=t.next;
                }
            }
        }
        return position+"";
    }
    static void delete(node[] N,int data,int size){
        String delete=data+"NOT FOUND";
        int i=data%size;
        if(N[i].data!=size+1){
            if(N[i].data==data){
                node n=new node();
                if(N[i].next!=null){
               N[i]=N[i].next;
                }else{
                n=N[i];
                n.data=size+1;
                }
            }
            else if(N[i].next!=null){
                node t=new node();
                node t1=N[i];
                while(t1.next.data!=data){
                    t1=t1.next;
                } 
          node T1=t1.next.next;
t1.next=T1;
            }
        }
        
    }
    }

    
    

class node {
    int index;
    int data;
    node next;
}


