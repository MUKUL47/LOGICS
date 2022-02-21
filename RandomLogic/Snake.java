
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN1
 */
public class Snake {
     boolean gameOver=false;
         String[][] Board  = new String[10][10];
         //String [] Body = new String[]{};
         String head="00",tail;
         String food="";
         ArrayList<String> Body = new ArrayList<>();
         Boolean foodFound=false;
    public static void main(String[] args) {
        Snake s = new Snake();
        s.Main();
        
       }
    public void Main(){
      
        
      
         for(int i=0;i<Board.length;i++){
             for(int j=0;j<Board.length;j++){
                 Board[i][j]="0";
             }
         }
         Board[0][0]="X";
          setFoodPosition(head);
         for(int i=0;i<Board.length;i++){
             for(int j=0;j<Board.length;j++){ 
                 System.out.print(Board[i][j]);
             }
             System.out.println("");
         }
         /////////////////////////////////////////////////////////////
         
         Scanner S  = new Scanner(System.in);
         while(!gameOver){
             if(foodFound){
                 foodFound=false;
                 setFoodPosition(head);
             }
            
             System.out.println("Enter Direction");
             int direction = S.nextInt();
             System.out.println(Body+" "+head);
             
//             if(checkSelfCollide(direction)){
//                 break;
//             }
             move(direction);
         }
    }

  

    private  void show(String[][] Board) {
           for(int i=0;i<Board.length;i++){
             for(int j=0;j<Board.length;j++){
                if(Body.contains(i+""+j)){System.out.print("X");}
                else
                    System.out.print(Board[i][j]);
             }
             System.out.println("");
         }
    }

    private  void move(int direction) {
        tail=Body.get(0);
       int i=Integer.parseInt(head.charAt(0)+"");
       int j=Integer.parseInt(head.charAt(1)+"");
      
       
       Board[i][j]="0";
        if(direction==6){ Body.remove(0);
            if(Board[i][j+1]=="F"){foodFound=true;}
           Board[i][j+1]="X";
           head= i+""+(j+1);
           Body.add(head);
          
           show(Board);
       }
        else if(direction==2){if(Board[i+1][j]=="F"){foodFound=true;}
             Board[i+1][j]="X";
           head= (i+1)+""+(j);
            Body.add(head);
           Body.remove(0);
           show(Board);
        }
          else if(direction==4){
                 Body.remove(0);
              if(Board[i][j-1]=="F"){foodFound=true;}
             Board[i][j-1]="X";
           head= (i)+""+(j-1);
            Body.add(head);
           show(Board);
         
        }
          else if(direction==8){if(Board[i-1][j]=="F"){foodFound=true;}
             Board[i-1][j]="X";
           head= (i-1)+""+(j);
           Body.remove(0);
            Body.add(head);
               
           show(Board);
        }
    }

    private void setFoodPosition(String head1) {
        
        if(food!=""){
            Board[Integer.parseInt(food.charAt(0)+"")][Integer.parseInt(food.charAt(1)+"")]="0";
        }
     int i=Integer.parseInt(head1.charAt(0)+"");
       int j=Integer.parseInt(head1.charAt(1)+"");
       int iR=i,jR=j;
       
       while(true){
           iR=(int)Math.floor(Math.random()*10);
           jR=(int)Math.floor(Math.random()*10);
           if(jR!=j || iR!=i){
               break;
           }
       }
       food=iR+""+jR;
       Board[iR][jR]="F";
        Body.add(0, tail);
    }

  
    private Boolean checkSelfCollide(int direction) {
     for(int i=0;i<Body.size();i++){
         if(head==Body.get(i)){
             return true;
         }
     }
     return false;
    }
}
