/*
1) GENERATE N*N MAP MATRIX ( 0 = ROAD 1 = OBSTACLE )
2) CONVERT MAP TO GRAPH
3) USING BFS CHECKING IF THERE EXIST A PATH FROM SOURCE TO DESTINATION
4) IF NO PATH GOTO (1)
5) PRINT MAP WHERE X = ROAD  1 = OBSTACLE
___________OUTPUT_____________

SIZE : 7
OBSTACLE PROBABILTY : 3
0 1 1 1 0 0 0 
0 0 0 0 0 0 1 
0 0 0 0 0 1 1 
1 0 1 0 1 1 0 
1 0 0 1 0 0 0 
0 0 0 0 0 0 1 
0 1 0 0 0 1 0 

NO VALID PATH FOUND

SIZE : 7
OBSTACLE PROBABILTY : 3
0 0 0 0 1 0 0 
1 0 0 0 0 0 0 
0 0 0 0 0 0 0 
0 1 1 1 0 1 0 
0 0 0 0 0 0 1 
0 1 0 0 1 0 0 
1 0 0 1 0 0 0 

Path 'X' == valid path

X X X X 1 X X 
1 X X X X X X 
X X X X X X X 
X 1 1 1 X 1 X 
X X X X X X 1 
X 1 X X 1 X 1 
1 X X 1 1 X X 
______________________________________

WILL USE THIS TO SOLVE AStarSearch
*/

public class mazeGenerator {
    
    public static void main(String[] args) {
        int size = 7, ObstacleProbabilty = 3;
        
        String source = 0+""+0, destination = (size-1)+""+(size-1);
        
        int n[][] = randomMaze(size, ObstacleProbabilty, source, destination);
        
        boolean Exist = checkIfPathExist(convertMazeToGraph(n), source, destination, size);
        
        while(!Exist) {
            if(!Exist) System.out.println("\nNO VALID PATH FOUND\n");
            n = randomMaze(size, ObstacleProbabilty, source, destination);
            
            Exist = checkIfPathExist(convertMazeToGraph(n), source, destination, size); 
        }
        
      
    }
    public static int[][] randomMaze
        (int size , int obstacleProbabilty, String s, String d){
        
        if( obstacleProbabilty < 2 ) obstacleProbabilty = 2;
        while( size < 5 ) size = (int)Math.floor(Math.random()*20);
        
        System.out.println("SIZE : "+size);
        int n[][] = new int[size][size];
        for(int i = 0 ; i < n.length ; i++){
            for(int j = 0 ; j < n.length ; j++){
                if(Math.floor(Math.random()*obstacleProbabilty) == 1) n[i][j] = 1;                
                else n[i][j] = 0;
            }    
        }
        n[Integer.parseInt(s.charAt(0)+"")][Integer.parseInt(s.charAt(1)+"")] = 0;
        n[Integer.parseInt(d.charAt(0)+"")][Integer.parseInt(d.charAt(1)+"")] = 0;
        
        for(int i=0;i<n.length;i++){ for(int j=0;j<n.length;j++){ System.out.print(n[i][j]+" "); } System.out.println(); }
        return n;
    }

    private static Edge1[] convertMazeToGraph(int[][] n) {
        AJM A = new AJM();
        int c = 0;
        Edge1 E[] = new Edge1[n.length*n.length];
        for(int i = 0 ; i < n.length ; i++){            
            for(int j = 0 ; j < n.length ; j++){
                
                E[c] = new Edge1(i,j); E[c].Edge1 = c++;
               
            }    
        }
        for(int i = 0 ; i < n.length ; i++){            
            for(int j = 0 ; j < n.length ; j++){
                Edge1 e1=null,e2=null;
                if(n[i][j] != 1 && i < n.length-1 ){
                    for(Edge1 k : E){
                        if( k.i == i && k.j == j )     e1 = k;
                        if( k.i == (i+1) && k.j == j ) e2 = k;
                    }
                    if( n[i+1][j] != 1 ) {
                        e1.addNode2D(e2.i, e2.j);
                        e2.addNode2D(e1.i, e1.j);
                    }
                }
                if(n[i][j] != 1 && j < n.length-1){
                    for(Edge1 k : E){
                        if( k.i == i && k.j ==   j )  e1 = k;
                        if( k.i == i && k.j == (j+1)) e2 = k;
                    }
                   if( n[i][j+1] != 1 ) {
                        e1.addNode2D(e2.i, e2.j);
                        e2.addNode2D(e1.i, e1.j);
                    }
                }
            }    
        }
       return E;
    }
    public static boolean checkIfPathExist(Edge1 E[], String source, String Destination, int size){//BFS
        boolean B[] = new boolean[E.length];
        for(int i=0;i<B.length;i++) B[i] = false;
        int pointer = 0;
        Stack<String> vertices = new Stack<>();
        vertices.add(source.charAt(0)+""+source.charAt(1));
        ArrayList<String> finalPath = new ArrayList<>();
        while(!vertices.isEmpty()){           
           String p = vertices.remove(0);            
           int currentPos = 0;
            
           for(int i = 0; i < E.length ; i++){ if( E[i].i == Integer.parseInt(p.charAt(0)+"") && E[i].j == Integer.parseInt(p.charAt(1)+"") ) currentPos = i; }
           
           if( !finalPath.contains(E[currentPos].i+""+E[currentPos].j) ) finalPath.add(E[currentPos].i+""+E[currentPos].j);
           
           B[E[currentPos].Edge1] = true;
           for(String S : E[currentPos].D2){
               for(Edge1 EE : E){
                  if(Integer.parseInt(S.charAt(0)+"") == EE.i && 
                     Integer.parseInt(S.charAt(1)+"") == EE.j && 
                     !B[EE.Edge1] && 
                     !vertices.contains(S.charAt(0)+""+S.charAt(0))){
                      vertices.add(S.charAt(0)+""+S.charAt(1));
                   }}}
           
           if(vertices.contains(Destination)) {
              finalPath.add(vertices.lastElement()); System.out.println("\nPath 'X' == valid path\n");
              for(int i = 0 ; i < size ; i++){ 
              for(int j = 0 ; j < size ; j++){ if(finalPath.contains(i+""+j)) System.out.print("X ");
              else System.out.print("1 ");}System.out.println();
              
              }
              return true;
          }
             }
        return false;
    }
}
