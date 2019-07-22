/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class N_QUEEN {
    public static void main(String[] args) {
   try{
    int  size = 3, i = 0, j = 0;
    boolean backTrack=false,nextLine=false;
    int Board[][]=new int[][]{
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0}};
    Stack<Integer> marked = new Stack<Integer>();    
    while(true){        
        if(nextLine){ i+=1; j=0; nextLine=false; }
        if(checkPosition(Board, i, j, marked) && Board[i][j]!=2){  
        nextLine=true; Board[i][j]=1; marked.push((i*10)+j);             
        }
        else { j+=1; }
        //Backtrack to previous location
        if(!nextLine && j==Board.length){ i-=1; j=0;
        Board[marked.lastElement()/10][marked.lastElement()%10]=2;
        marked.pop(); }
        if(nextLine && i==Board.length-1){ break; }
        }
        sanitizeBoard(Board);
    }
   catch(Exception E){
       //lol xD
       System.out.println("NO SOLUTION");
    }
    }
    
static boolean checkPosition(int[][] Board,int i, int j, Stack<Integer> marked){
   
    if(marked.size()==0){ return true; }     
    for(int k=0;k<marked.size();k++){
        int X=0,Y=0;
         X=marked.get(k)/10; Y=marked.get(k)%10;        
        int x = X, y = Y;
        //diagonal right to left        
        for(int l=x, m=y; l<=Board.length-1 && m>=0 ; l++,m--){          
            if(l==i && m==j){ return false; }
        }x = X; y = Y;
        
        //down to to left
        for(int m=x;  m<=Board.length-1 ; m++){
            if(m==i && y==j){ return false; }
        }x = X; y = Y;
        
        //diagonal left to right 
        for(int l=x, m=y; l<=Board.length-1 && m<=Board.length-1 ; l++,m++){
            if(l==i && m==j){ return false; }
        }
    } 
    
    return true;
}
static void sanitizeBoard(int Board[][]){
for(int i=0;i<Board.length;i++){for(int j=0;j<Board.length;j++){
    if(Board[i][j] == 2) Board[i][j]=0;
    System.out.print(Board[i][j]+" ");
}
    System.out.println("");
}}
static void Board(int Board[][]){
for(int i=0;i<Board.length;i++){for(int j=0;j<Board.length;j++){
    System.out.print(Board[i][j]+" ");
}
    System.out.println("");
}
}
}
