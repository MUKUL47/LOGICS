/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRACKTHECODE.ARRAYS.ARRAYS.ARRAYS.newpackage;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DoublyLinkedList {
    public  NODE head;
    public static void main(String[] args) {
DoublyLinkedList DLL= new DoublyLinkedList();

int size=6;
Scanner s= new Scanner(System.in);
for(int i=0;i<size;i++){
DLL.addnode(s.nextInt());
}
DLL.show();
   
    }
void addnode(int data){
    if(head==null){
        NODE n= new NODE();
        NODE nn=new NODE();
        n.data=data;
        
        head=n;
    }
    else{
        NODE tn=head;
        NODE tp=tn;
        while(tn.right!=null){
         
            tn=tn.right;
            
                    }
        NODE n=new NODE();
        tn.right=n;
        n.left=tn;
       n.data=data;
        
    }
}
void show(){
    
    NODE h=head; 
    System.out.println("STRAIGHT");
    while(h!=null){
       if(h.right!=null){
           System.out.print(h.data+" <-> ");
       }else{
           System.out.print(h.data);break;
       }
     
       h=h.right;
        
    }
    System.out.println("\nREVERSE");
    while(h!=null){
       if(h.left!=null){
           System.out.print(h.data+" <-> ");
       }else{
           System.out.print(h.data);break;
       }
        h=h.left;
    }
    System.out.println("");
    
}
}

    
class NODE{
    int data;
    NODE left;
    NODE right;
}
