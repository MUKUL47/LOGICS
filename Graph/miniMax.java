/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN1
 */
public class miniMax {
    //0 = opponent/AI, 1 = Human, -1 = not used.
    /*Priority : 1) Draw/ Dont let Human to win. (WorstCase)**
                 2) Win (BestCase)*
    ALGO :
    1)Get predefined board with atleast 3 moves (1 AI and 2 Player IFF player moves first)
    2)4th move is where the algo starts => 
  2.1)Check priority(1) I.E if player 2 moves are coming in a single row/column/diagonal, then place AI cross/cirlce in between.
  2.2)IF (2.1) fails Check priority(2) I.E search if another AI/ Opponent cross/circle is coming which might create a chance to win in future.
``   1 _ 0
     _ _ 1
     _ _ _
    I.E the next AI/OPP peice can be placed in either (1,1) or (2,0) which will create a chance to win later on.
  2.3)IF (2.1 && 2.2) FAILS : 
     1 _ 0       1 _ 0
     _ _ 1  =>   _ 0 1 
     0 1 _       0 1 _
  3) Repeat (2) till someone Wins/ Draw.
    */
    boolean n = true;
    public static void main(String[] args) {
      new miniMax().solveMinMax();
    }

    private  void solveMinMax() {
        int lastPos = 0, validPos = -1, cc = -1;
        Move M[] = new Move[9];
        for(int i = 0; i < M.length; i++) M[i] = new Move(i);
          M[0].ownedBy(0);
          M[5].ownedBy(1);
          M[1].ownedBy(0);
          M[6].ownedBy(1);
          //BEFORE AUTOMATED MOVE
          showBoard(M);
          //AFTER AUTOMATED MOVE
        lastPos = 1;
        for(int i=0;i<9;i++){
            if(M[i].ownedBy == -1){
                M[lastPos].addChild(i, 0);
            }
        }
        validPos = -1;
        
        for( Child c : M[lastPos].Children ){
            if( checkPriority(M, c.postion) ) { validPos = c.postion;  }
        }
        
        if( validPos == -1 ) n = false;
        
        if(!n){
            for( Child c : M[lastPos].Children ){
            if(checkOpponentPriority(M, c.postion)){
               validPos = c.postion; break;
            }}}
        
         M[validPos].ownedBy(0);
        showBoard(M);   
       
        
        
        
    }
    private  boolean checkPriority(Move M[], int aiPos){
       
       int Board[] = new int[M.length], c = 0;
       for(Move m : M) Board[ c++ ] =  m.ownedBy;
       Board[aiPos] = 0; 
//        System.out.println();
//              for(int i=0;i<Board.length;i++){
//            System.out.print(Board[i]+"   ");
//            if(i == 2 || i == 5 || i == 8 ) System.out.println();
//        }
//       
       
       if( Board[0] + Board[1] + Board[2] == 2) { return true;}
  else if( Board[3] + Board[4] + Board[5] == 2) { return true;}
  else if( Board[6] + Board[7] + Board[8] == 2) { return true;}
       
  else if( Board[0] + Board[3] + Board[6] == 2) { return true;}
  else if( Board[1] + Board[4] + Board[7] == 2) { return true;} 
  else if( Board[2] + Board[5] + Board[8] == 2) { return true;}
       
  else if( Board[0] + Board[4] + Board[8] == 2) { return true;}
  else if( Board[2] + Board[4] + Board[6] == 2) { return true;}

//if(getSimi(Board[0],Board[1],Board[2])) {  return true;  }
//  else if(getSimi(Board[3],Board[4],Board[5])) {return true;}
//  else if(getSimi(Board[6],Board[7],Board[8])) {return true;}
//       
//  else if(getSimi(Board[0],Board[3],Board[6])) { return true;}
//  else if(getSimi(Board[1],Board[4],Board[7])) {return true;} 
//  else if(getSimi(Board[2],Board[5],Board[8])) {return true;}
//       
//  else if(getSimi(Board[0],Board[4],Board[8])) {return true;}
//  else if(getSimi(Board[2],Board[4],Board[6])) {return true;}

   
  return false; 
    }   
    
    private  boolean checkOpponentPriority(Move M[], int aiPos){
       
       int Board[] = new int[M.length], c = 0;
       for(Move m : M) Board[ c++ ] =  m.ownedBy;
       Board[aiPos] = 0;
       
//       for(int i=0;i<Board.length;i++){
//            System.out.print(Board[i]+"  ");
//            if(i == 2 || i == 5 || i == 8 ) System.out.println();
//        }
       
       if(getSimi(Board[0],Board[1],Board[2])) { return true;}
  else if(getSimi(Board[3],Board[4],Board[5])) { return true;}
  else if(getSimi(Board[6],Board[7],Board[8])) { return true;}
       
  else if(getSimi(Board[0],Board[3],Board[6])) { return true;}
  else if(getSimi(Board[1],Board[4],Board[7])) { return true;} 
  else if(getSimi(Board[2],Board[5],Board[8])) { return true;}
       
  else if(getSimi(Board[0],Board[4],Board[8])) { return true;}
  else if(getSimi(Board[2],Board[4],Board[6])) { return true;}
  
       
  return false; 
    }

    

    private void showBoard(Move[] M) {        
        System.out.println();
        for(int i=0;i<M.length;i++){
            if( M[i].ownedBy == -1 ) System.out.print("_ "); else System.out.print(M[i].ownedBy+" ");
            if(i == 2 || i == 5 || i == 8 ) System.out.println();
        }
    }

    private boolean getSimi(int i, int j, int k) {
        if(i == j && i == 0 && k == -1) return true;
        if(j == k && j == 0 && i == -1) return true;
        if(k == i && i == 0 && j == -1) return true;
        if(i == j && j == k && i == 0 ) return true; // GAMEOVER BREAK
        return false;
    }
    
    private boolean getSimiP1(int i, int j, int k) {
       
        if(i + j == 2 && k == 0) return true;
        if(j + k == 2 && i == 0) return true;
        if(k + i == 2 && j == 0) return true;
        return false;
    }

    private int randomAiSelect(Move[] M) {
        int n = (int)(Math.random() * ((9 - 0) + 1));
        
        while( M[n].ownedBy > -1 ){
            n = (int)(Math.random() * ((9 - 0) + 1));
        }
        return n;
    }
    
}
class Move{
    int ownedBy, Postion;
    ArrayList<Child> Children;        
    public Move(int Postion) {
        this.ownedBy = -1; // Default
        this.Postion = Postion;
        Children = new ArrayList<Child>();
    }
    public void ownedBy(int ownedBy){
        this.ownedBy = ownedBy;
    }
    public void addChild(int pos, int ownedBy){
        Children.add(new Child(pos, ownedBy));
    }
    public void getChildren(){
        for( Child c : Children ){
            System.out.println(c.postion+" : "+c.ownedBy);
        }
    }
    
}
class Child{
    int postion, ownedBy;

    public Child(int postion, int ownedBy) {
        this.postion = postion;
        this.ownedBy = ownedBy;
    }
    
    
}
