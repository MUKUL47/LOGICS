/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author admin
 */
public class Stack_1 {
    public static void main(String[] args) {
  int size =2   ;
       Fromhere st=new Fromhere(size);
   
       
       st.push(31);
       st.push(43);  st.push(43);  st.push(43);  st.push(43);
       st.pop();
       st.pop();
       st.pop(); st.push(43);  st.push(43);
   st.show();
      
    }}
    

class Fromhere{
    int MaxSize;
    int top;
    int[] Stack_array;

    public Fromhere(int MaxSize) {
        this.MaxSize = MaxSize;
        Stack_array=new int[this.MaxSize];
        this.top = -1;
        
    }
    void push(int valuetobepushed){
       if(top<MaxSize && top<MaxSize-1){
           top++;
        Stack_array[top]=valuetobepushed;              
            System.out.println(valuetobepushed+" Pushed");}
       else {
           System.out.println("OVERFLOW");
       }}
        

        
       
    void pop(){
        if(top==-1){
            System.out.println("Stack empty");
        }else{
        top--;
        System.out.println(Stack_array[top+1]+"Popped");}
        
    }
    
    void show(){
        
        if(top==-1){System.out.println("No elements");}
        else{System.out.println("Elements :-");
        int i=top;  
        while(top>=0){
                System.out.println(i+"->"+Stack_array[top]);
                top--;i--;
            }
        }
        
    }
   void isfull(){
        if(top==MaxSize-1)
            System.out.println("OVERFLOW...");
            
    }
 
}