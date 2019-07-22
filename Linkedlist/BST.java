/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;



import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BST {
    NODE ROOT;
    public static void main(String[] args) {
  
        NODE Nod = new NODE();
        BST T = new BST();
      int size=5;
      Scanner S = new Scanner(System.in);
      for(int i=0;i<size;i++){
          System.out.print(i+")");
         T.AddTreeNode(S.nextInt());
      }
      T.BFS();
      
      //  System.out.println( T.Search(S.nextInt()));
    }
    void AddTreeNode(int data){
        if(ROOT==null){
            NODE n= new NODE();
            n.data=data;
            ROOT=n;
             }
        else{        
                NODE t=ROOT;
                while(t!=null){
                if(data>=t.data){
                     if(t.right==null){
                     break;
                 }
                    t=t.right;
                }
                else
                {
                 if(t.left==null){
                     break;
                 }   
                t=t.left;    
                }
                
                }NODE n = new NODE();
                if(data>=t.data){
                  n.data=data;
                  t.right=n;
                }
                else
                {n.data=data;
                  t.left=n;
                }
            }
          
        }
    String Search(int data){
        String status="NOT FOUND";
         NODE t=ROOT;
         System.out.print("ROOT->");
                while(t!=null){
                    if(data==t.data){
                        System.out.print(" "+data);
                        return "\nFOUND";
                       
                    }
                if(data>=t.data){
                     if(t.right==null){
                     break;
                 }
                     System.out.print("RIGHT->");
                    t=t.right;
                }
                else
                {
                 if(t.left==null){
                     break;
                 }  System.out.print("LEFT->"); 
                t=t.left;    
                }
                
                }
   return status; }
    
    public void BFS(){
        NODE root=ROOT;
        while(root!=null){
            if(root.left!=null){
                System.out.println(root.left.data);
                 root=root.left;
            }
            if(root.right!=null){
                 System.out.println(root.right.data);
                  root=root.right;
            }
           
        }
}
    }
 
class NODE{
    int data;
    NODE left;
    NODE right;
}

