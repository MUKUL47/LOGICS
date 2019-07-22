/*
OUTPUT NOT OPTMAL :( (STILL WORKING ON IT)
SIZE : 8
OBSTACLE PROBABILTY : 2
0 1 0 0 0 0 1 0 
0 1 1 1 1 1 0 0 
0 0 1 1 1 1 0 1 
1 0 0 0 0 1 1 0 
0 0 1 1 0 0 0 0 
1 0 0 0 0 1 0 1 
1 1 1 0 0 0 0 0 
1 0 0 1 1 0 0 0 

Path 'X' == valid path

O _ _ _ _ _ _ _ 
O _ _ _ _ _ _ _ 
O O _ _ _ _ _ _ 
_ O O O O _ _ O 
O O _ _ O O O O 
_ O O O O _ O _ 
_ _ _ O O O O _ 
_ _ _ _ _ O O O 

O _ _ _ _ _ _ _ 
O _ _ _ _ _ _ _ 
O O _ _ _ _ _ _ 
_ O _ _ _ _ _ _ 
_ O _ _ _ _ _ _ 
_ O O O _ _ _ _ 
_ _ _ O O O O O 
_ _ _ _ _ _ _ O 
*/
package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AStarSearch {
    public static void main(String[] args) {
       mazeGenerator maze = new mazeGenerator();
       int Maze[][] = maze.generateMaze();
       Maze = solveAstar(Maze,false);//currently works for only <= 9*9 matrix
    }
    public static int[][] solveAstar(int maze[][], boolean includeDiagonals){ //Fcost = Hcost + Acost
        HashMap<String,Integer> Adjacent = new HashMap<>();
        HashMap<String,Integer> FinalFCost = new HashMap<>();
        Stack<String> Coord = new Stack<>();
        String source = 0+""+0, destination = (maze.length-1)+""+(maze.length-1), currentPos = source;
        
        String currentSource = ""; int MAX = 999, currentFCost = -1;

        while(!FinalFCost.containsKey(destination)){
        Adjacent.put((Integer.parseInt(currentPos.charAt(0)+"")+1)+""+currentPos.charAt(1),   1);
        Adjacent.put((Integer.parseInt(currentPos.charAt(0)+"")-1)+""+currentPos.charAt(1),   1);
        Adjacent.put((currentPos.charAt(0))+""+(Integer.parseInt(currentPos.charAt(1)+"")-1), 1);
        Adjacent.put((currentPos.charAt(0))+""+(Integer.parseInt(currentPos.charAt(1)+"")+1), 1);
        checkInvalidPos(Adjacent,maze);
        //System.out.println(Adjacent);
        sanitizeMap(Adjacent,maze);
        for(Map.Entry<String, Integer> P : Adjacent.entrySet()){
            if(P.getValue() == 1) if( getDistanceFromDestination(P.getKey(), destination) < MAX ) {
                currentSource = P.getKey(); MAX = getDistanceFromDestination(P.getKey(), destination);
                currentFCost = P.getValue()+MAX;
            }
        }
        FinalFCost.put(currentSource, currentFCost);
        Coord.push(currentSource+": "+currentFCost);
        int I = Integer.parseInt(currentSource.charAt(0)+""), J = Integer.parseInt(currentSource.charAt(1)+"");
        if( I == maze.length ) I -= 1;
        if( J == maze.length ) J -= 1;
        maze[I][J] = 1;
        currentPos = currentSource;
       // System.out.println(FinalFCost);
        Adjacent = new HashMap<>();
        currentSource = ""; MAX = 999; currentFCost = -1;
         //System.out.println(FinalFCost);
        }
//        for(String S : Coord){
//            System.out.println(S+" "+(getDistanceFromDestination(0+""+0, S.substring(0,2))+getDistanceFromDestination(S.substring(0,2), destination)));
//        }

System.out.println();
    for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
               if( FinalFCost.containsKey(i+""+j) || (i == Integer.parseInt(source.charAt(0)+"") && j == Integer.parseInt(source.charAt(1)+"")) ) 
                    System.out.print("O ");
               else System.out.print("_ ");
            }
            System.out.println();
        }

return null;
    }

    private static void checkInvalidPos(HashMap<String, Integer> Adjacent, int[][] maze) {
        for(Map.Entry<String, Integer> P : Adjacent.entrySet()){
            if(P.getKey().indexOf('-') > -1) Adjacent.put(P.getKey(), Integer.MAX_VALUE);
        }
    }

    private static int getDistanceFromDestination(String source, String destination) {
        int sourceI = Integer.parseInt(source.charAt(0)+"");
        int sourceJ = Integer.parseInt(source.charAt(1)+"");
        int destinationI = Integer.parseInt(destination.charAt(0)+"");
        int destinationJ = Integer.parseInt(destination.charAt(1)+"");
        int C = 0;
        while( sourceI != destinationI || sourceJ != destinationJ ){
           
            if ( Math.abs(sourceI - destinationI) > 0 ) { C++;
                
                if( Math.max(sourceI, destinationI) == destinationI) sourceI += 1;
                else sourceI -= 1;                   
                
            }
            if(Math.abs(sourceJ - destinationJ) > 0){ C++;
                
                if( Math.max(sourceJ, destinationJ) == destinationJ) sourceJ += 1;
                else sourceJ -= 1;
                    
                }
            }
        return C;
        }

    private static void sanitizeMap(HashMap<String, Integer> Adjacent, int[][] maze) {
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                if(Adjacent.containsKey(i+""+j) && maze[i][j] == 1) Adjacent.put(i+""+j, Integer.MAX_VALUE);
            }
        }
    }

    private static String backTrackFromDestination(HashMap<String, Integer> FINAL) {
        int max = Integer.MAX_VALUE;
        String K = "";
        for(Map.Entry<String, Integer> en : FINAL.entrySet()){
            if(en.getValue() < max) { max = en.getValue(); K = en.getKey(); }
        }
        FINAL.remove(K);
        return K;
    }
        
        
    }

class Coordinates{
    int i, j, value;

    public Coordinates(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public void setValue(int value){
        this.value = value;
    }
}
