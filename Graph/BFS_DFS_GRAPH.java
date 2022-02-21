/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import sun.misc.Queue;


/**
 *
 * @author ADMIN1
 */
public class AdjacencyMatrix {
    public static void main(String[] args) {
   BFS_DFS B = new BFS_DFS();
   B.BFS_DFS();
    }
}
class AJM{
         public static Edge1[] showAM(){
             
        Edge1 E[] = new Edge1[6];
        for(int i=0;i<E.length;i++){
            E[i] = new Edge1(i);
        }
        E[0].addNode(0,1,E);
        E[0].addNode(0,2,E);
        E[1].addNode(1,2,E);
        E[1].addNode(1,3,E);
        E[3].addNode(3,4,E);
        E[3].addNode(3,5,E);
        E[4].addNode(4,2,E);
        E[4].addNode(4,5,E);

      return E;
         }
}
class Edge1{
    int Edge;
    ArrayList<Integer> nodes;
    ArrayList<Integer> D;
    public Edge1(int Edge) {
        this.Edge = Edge;
        nodes = new ArrayList<>();
        D = new ArrayList<>();
    }
    public void addNode(int src ,int des, Edge1[] e){
        if(!D.contains(des)) nodes.add(des); D.add(des);
        if(!e[des].D.contains(src)) e[des].nodes.add(src); e[des].D.add(src);
    }
    public ArrayList<Integer> showNodes(){
        return nodes;
    }
    
    
}
class BFS_DFS {
    public static void BFS_DFS() {
        AJM AJ  = new AJM();
        boolean B[] = new boolean[AJ.showAM().length];
        for(int i=0;i<6;i++) B[i] = false;
        int pointer = 0;
        Stack<Integer> vertices = new Stack<>();
        vertices.add(pointer);
        Edge1[] EE = AJ.showAM();
        
     while(!vertices.isEmpty()){
         int p = vertices.remove(0); //for BFS
         //int p = vertices.pop(); for DFS
         System.out.println(p);
         B[p] = true;
         for(int i=0;i<EE[p].nodes.size();i++){
            if(!B[EE[p].nodes.get(i)] && !vertices.contains(EE[p].nodes.get(i))) {
                vertices.add(EE[p].nodes.get(i));
            }
         }
         
     }
        }
       
        
    }
