
import java.util.ArrayList;
import java.util.HashMap;

public class mapPractice {
    
    public static void AStarPath(){
     mazeGenerator M = new mazeGenerator();
     int Maze[][] = M.generateMaze();
     int startJ = 0, startI = 0, destinationI = 8, destinationJ = 8, currentJ = startJ, currentI = startI;
     Node N[] = new Node[destinationI*destinationJ];
     
     for(int c = 0, i = 0, j = 0 ; c < N.length; c++){N[c] = new Node(j, i); i = ++i % destinationI; if(i == 0) j += 1;}          
     
     ArrayList<Node> openList = new ArrayList<Node>();
     ArrayList<Node> closeList = new ArrayList<Node>();
     closeList.add(N[0]);
     Node Parent = N[0];
     
    while(!openList.contains(N[(destinationI*destinationJ)-1])){
    updateNeighbours(N, currentI, currentJ, destinationI, destinationJ, openList, closeList, Maze, startI, startJ);
    ArrayList<Node> T = updateCloseList(openList,closeList,Parent);
    Node TT = T.get(T.size()-1);
    currentI = TT.i;
    currentJ = TT.j;
    System.out.println("Current Node:"+currentI+""+currentJ);
    printWeights(N);
    Parent = TT;
     }
  

     
    }
   public static Node getNodeAtPos(Node N[], int j, int i){
        for(Node n : N){
            if( n.i == i && n.j == j ) return n;
        }
        return null;
    }
   public static void updateDistance(Node N, int dI, int dJ, int startI, int startJ){
       int sI = N.i, sJ = N.j, c = 0;
       while(true){
           if( sI == dI && sJ == dJ ) break;
           if( sI < dI && sJ < dJ ){ sI += 1; sJ += 1; c += 14; }
           if( sI > dI && sJ > dJ ){ sI -= 1; sJ -= 1; c += 14; }
           if( sI < dI && sJ > dJ ){ sI += 1; sJ -= 1; c += 14; }
           if( sI > dI && sJ < dJ ){ sI -= 1; sJ += 1; c += 14; }
           //
           if( sI == dI && sJ < dJ ){ sJ += 1; c += 10; }
           if( sI == dI && sJ > dJ ){ sJ -= 1; c += 10; }
           if( sI < dI && sJ == dJ ){ sI += 1; c += 10; }
           if( sI > dI && sJ == dJ ){ sI -= 1; c += 10; }        
       }
       int k = 0;
       sI = N.i; sJ = N.j;
       while(true){
           if( startI == sI && startJ == sJ ) break;
           if( startI < sI  && startJ < sJ ){ startI += 1; startJ += 1; k += 14; }
           if( startI > sI  && startJ > sJ ){ startI -= 1; startJ -= 1; k += 14; }
           if( startI < sI  && startJ > sJ ){ startI += 1; startJ -= 1; k += 14; }
           if( startI > sI  && startJ < sJ ){ startI -= 1; startJ += 1; k += 14; }
           //
           if( startI == sI && startJ < sJ ){ startJ += 1; k += 10; }
           if( startI == sI && startJ > sJ ){ startJ -= 1; k += 10; }
           if( startI < sI  && startJ == sJ ){ startI += 1; k += 10; }
           if( startI > sI  && startJ == sJ ){ startI -= 1; k += 10; }        
       }
       N.setGcost(k);
       N.setHcost(c);
       N.setFCost();
   }
    public static void main(String[] args) {
        AStarPath();
    }

    private static void updateNeighbours(Node[] N, int currentI, int currentJ, int destinationI, int destinationJ, ArrayList<Node> openList, ArrayList<Node> closeList, int[][] Maze, int startI, int startJ) {
        Node nTemp = getNodeAtPos(N, currentJ, currentI+1);
        
     if( nTemp != null  && !closeList.contains(nTemp) && !openList.contains(nTemp) && Maze[nTemp.i][nTemp.j] != 1 ){             
         
         updateDistance(nTemp,destinationI,destinationJ,startI,startJ);
         openList.add(nTemp);
     }
     nTemp = getNodeAtPos(N, currentJ, currentI-1);
     
     if( nTemp != null  && !closeList.contains(nTemp) && !openList.contains(nTemp) && Maze[nTemp.i][nTemp.j] != 1){
         updateDistance(nTemp,destinationI,destinationJ, startI, startJ);
         openList.add(nTemp); 
     }
     nTemp = getNodeAtPos(N, currentJ+1, currentI);
         
     if( nTemp != null  && !closeList.contains(nTemp) && !openList.contains(nTemp) && Maze[nTemp.i][nTemp.j] != 1) {
         nTemp.setGcost(10); 
         updateDistance(nTemp,destinationI,destinationJ, startI, startJ);
         openList.add(nTemp); 
     }
     nTemp = getNodeAtPos(N, currentJ-1, currentI);
         
     if( nTemp != null  && !closeList.contains(nTemp) && !openList.contains(nTemp) && Maze[nTemp.i][nTemp.j] != 1) {
         updateDistance(nTemp,destinationI,destinationJ, startI, startJ);
         openList.add(nTemp);
     }    
     nTemp = getNodeAtPos(N, currentJ+1, currentI+1);
            //  
     if( nTemp != null  && !closeList.contains(nTemp) && !openList.contains(nTemp) && Maze[nTemp.i][nTemp.j] != 1) {
         updateDistance(nTemp,destinationI,destinationJ, startI, startJ);
         openList.add(nTemp); 
     }
     nTemp = getNodeAtPos(N, currentJ-1, currentI-1);
         
     if( nTemp != null  && !closeList.contains(nTemp) && !openList.contains(nTemp) && Maze[nTemp.i][nTemp.j] != 1) { 
         updateDistance(nTemp,destinationI,destinationJ, startI, startJ);
         openList.add(nTemp);
     }
     nTemp = getNodeAtPos(N, currentJ+1, currentI-1);
         
     if( nTemp != null  && !closeList.contains(nTemp) && !openList.contains(nTemp) && Maze[nTemp.i][nTemp.j] != 1) {
         updateDistance(nTemp,destinationI,destinationJ, startI, startJ);
         openList.add(nTemp); 
     }
    nTemp = getNodeAtPos(N, currentJ-1, currentI+1);
        
     if( nTemp != null && !openList.contains(nTemp)  && !closeList.contains(nTemp) && Maze[nTemp.i][nTemp.j] != 1){
         updateDistance(nTemp,destinationI,destinationJ, startI, startJ);
         openList.add(nTemp); 
     } 
         
     
    }

    private static ArrayList<Node> updateCloseList(ArrayList<Node> openList, ArrayList<Node> closeList, Node firstParent) {
        Node N = null;
        int max = Integer.MAX_VALUE;
        boolean checkMinDup = false;
        HashMap<Node,Integer> openListDup = new HashMap<>();
        for(Node i : openList){
            if(!openListDup.containsValue(i.Fcost)) openListDup.put(i, i.Fcost);
            else { checkMinDup = true; break; }
        }
        if(!checkMinDup){
            for(Node i : openList){
            if( i.getFcost() < max && !closeList.contains(i)) { max = i.getFcost(); N = i; }
        }
        }else{
            for(Node i : openList){
            if( i.getHcost() < max && !closeList.contains(i)) { max = i.getFcost(); N = i; }
        }}
                      
        N.parent = firstParent; 
        closeList.add(N);
        return closeList;
    }

    private static void printWeights(Node[] N) {        
    System.out.println();
       for(int c = 0, i = 0, j = 0 ; c < N.length; c++){
            if(N[c].Fcost>0) System.out.print((N[c].getHcost()+"+"+N[c].getGcost())+"("+N[c].Fcost+") ");
            else System.out.print("_________ ");
            i = ++i % 5; if(i == 0){  j += 1; System.out.println(); }} 
    }
    
}
class Node{
    int i,j,Fcost,Hcost,Gcost;
    Node parent;
    public Node(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void setFCost(){
        this.Fcost = this.Gcost + this.Hcost;
    }

    public void setFcost(int Fcost) {
        this.Fcost = Fcost;
    }

    public void setHcost(int Hcost) {
        this.Hcost = Hcost;
    }

    public void setGcost(int Gcost) {
        this.Gcost = Gcost;
    }   

    public int getFcost() {
        return Fcost;
    }

    public int getHcost() {
        return Hcost;
    }

    public int getGcost() {
        return Gcost;
    }
    
    
    
}
