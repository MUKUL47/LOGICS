/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

import java.util.Stack;

/**
 *
 * @author ADMIN1
 */
public class TreeTraversal {
    public static void main(String[] args) {
        Node root = new Node();
        Node l = new Node();
        Node ll = new Node();
        Node lr = new Node();
        Node r = new Node();
        Node rr = new Node();
        Node rl = new Node();
        Node lrl = new Node();
        Node rrr = new Node();
        Node rrrr = new Node();
         
        root.data=1;
        l.data=2;
        ll.data=4;
        lr.data=5;
        r.data=3;        
        rl.data=6;
        rr.data=7;
        lrl.data=9;
        rrr.data=10;
        rrrr.data=8;
        
        root.left=l;
        root.left.left=ll;
        root.left.right=lr;
        root.right=r;
        root.right.left=rl;
        root.right.right=rr;
        root.left.right.left=lrl;
        root.right.right.right=rrr;
        root.left.left.left=rrrr;
        /*
                    1
                 2     3
              4    5  6   7
           8     9          10
                    
        
        */
        
        Stack<Node> N = new Stack<Node>();
        //INORDER
        BFS(N, root);
        //PREORDER(N, root);
        //POSTORDER(N, root);
        //BFS(N,root);
        
       
    }
    static int INORDER(Stack<Node> N, Node root){
             N = new Stack<Node>();
         Node T = root;
         int max=0,r=0,l=0;
           while(true){
            
            if(T!=null){
                N.push(T);
                T=T.left;
                max = Math.max(l, max);l=0;
                r++;
            }else{
                max = Math.max(r, max);r=0;l++;
                if(N.isEmpty()){ break; }                 
                T = N.get(N.size()-1);   
                N.remove(N.size()-1);          
                T=T.right;
                r++;
            }}
         return max;
    }
    static void PREORDER(Stack<Node> N, Node root){
          N = new Stack<Node>();
         Node T = root;
           System.out.print(root.data+" ");
          while(true){
            
            if(T!=null){
                N.push(T);
                T=T.left;
            }else{
                if(N.isEmpty()){ break; }
                if(N.lastElement()!=root) System.out.print(N.lastElement().data+" ");                   
                T = N.get(N.size()-1);   
                N.remove(N.size()-1);          
                T=T.right;
            }
           
            
        } 
    }
    static void POSTORDER(Stack<Node> N, Node root){
         N = new Stack<Node>();
         Node T = root;
          while(true){
            
            if(T!=null){
                N.push(T);
                T=T.right;
            }else{
                if(N.isEmpty()){ break; }
                System.out.print(N.lastElement().data+" ");                   
                T = N.get(N.size()-1);   
                N.remove(N.size()-1);          
                T=T.left;
            }
           
            
        }
    }
    static void BFS(Stack<Node> N, Node root){     
     int n = 1, h =INORDER(N, root), k = 0;
        N.add(root); 
        System.out.println("Height "+(h-1));
        while(k++ < h){
            int t = 0;
            for(Node s : N){ System.out.println(s.data); }
            
            for(int i = 0 ; i < n ; i++){
                if(N.get(i).left!=null ){ t++; N.push(N.get(i).left); }
                
                if(N.get(i).right!=null){t++;  N.push(N.get(i).right); }                
            }
             
            while(n-->0){ N.remove(0); }
            n = t;
        
        }
            for(Node s : N){
                System.out.println(s.data);
            }
      

    }
}
class Node{
    int data;
    Node left;
    Node right;
}
