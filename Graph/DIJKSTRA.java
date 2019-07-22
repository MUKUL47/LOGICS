
package Graph;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ADMIN1
 */
public class DIJKSTRA {
    public static void solveDijkstra(Edge[] E, int source, int destination){

int currentNode = source, targetNode = destination, key = 0, min = Integer.MAX_VALUE, value = 0;  

HashMap<Integer,Integer> TEMP = new HashMap<>();
HashMap<Integer,Integer> FINAL = new HashMap<>();
for(int i = 0; i < E.length ; i++) TEMP.put(i, Integer.MAX_VALUE);
TEMP.remove(currentNode);
FINAL.put(currentNode, currentNode);

while(!FINAL.containsKey(targetNode)){
    
    for(int i=0;i<E[currentNode].nodes.size();i++){    
if(!FINAL.containsKey(E[currentNode].nodes.get(i).connectedVertex) && 
    E[currentNode].nodes.get(i).weight+FINAL.get(currentNode) < TEMP.get(E[currentNode].nodes.get(i).connectedVertex)){
    TEMP.put(E[currentNode].nodes.get(i).connectedVertex, E[currentNode].nodes.get(i).weight+FINAL.get(currentNode));
}}

key = getMinKey(TEMP); value = getMinValue(TEMP);
TEMP.remove(key);
FINAL.put(key,value);
currentNode = key;
}
        System.out.println("Vertex : Cost");
     for(Map.Entry<Integer, Integer> en : FINAL.entrySet()){
           System.out.println(en.getKey()+"      : "+en.getValue());
        }
    }
    
    public static int getMinKey(HashMap<Integer,Integer> T){
        int min = Integer.MAX_VALUE, key = -1;
        for(Map.Entry<Integer, Integer> en : T.entrySet()){
            if(en.getValue() < min) { min = en.getValue(); key = en.getKey(); }
        }
        return key;
    }
   public static int getMinValue(HashMap<Integer,Integer> T){
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> en : T.entrySet()){
            if(en.getValue() < min) { min = en.getValue(); }
        }
        return min;
    }

    


    public static void main(String[] args) {
        Graph A = new Graph();

Edge E[] = new Edge[9];
for(int i=0;i<E.length;i++){ E[i] = new Edge(i);}
           //weight,destination,source
 E[0].connectNode(4,1,0,E);
 E[1].connectNode(8,2,1,E);
 E[2].connectNode(7,3,2,E);
 E[3].connectNode(9,4,3,E);
 
 E[0].connectNode(8,7,0,E);
 E[7].connectNode(1,6,7,E);
 E[6].connectNode(2,5,6,E);
 E[5].connectNode(10,4,5,E);
 
 E[7].connectNode(7,8,7,E);
 E[8].connectNode(6,6,8,E);
 E[2].connectNode(2,8,2,E);
 E[3].connectNode(14,5,3,E);
 E[7].connectNode(11,1,7,E);
 E[2].connectNode(4,5,2,E);
//https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/ 
 int source = 0, destination = 4;
Edge EE[] = A.GraphWithWeights(false,E);
solveDijkstra(EE,source,destination);

    }
}
