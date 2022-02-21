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
import sun.misc.Queue;


/**
 *
 * @author ADMIN1
 */
public class AdjacencyMatrixWeights {
}
class Graph{
    public Edge[] GraphWithWeights(boolean showGraph, Edge[] E){
        Scanner S  = new Scanner(System.in);
        if(showGraph) showGraph(E);
        
   return E;
    }
    void showGraph(Edge[] E){
        for(Edge e : E ){
            System.out.print(e.getName()+" : ");
            for(Connection m : e.nodes){
                System.out.print("["+m.connectedVertex+":"+(m.weight)+"]");
            }
            System.out.println("");
        } System.out.println("");

        for(int i = 0 ; i < E.length ; i++){
            for(int j = 0 , k = 0 ; j < E.length; j++,k++){
                int w = 0;
              for(Connection e : E[i].nodes){
                  if(e.connectedVertex == j){ w = e.weight; break;}
              }
                System.out.print(w+" ");
            }
            System.out.println();
        }
    }
}


class Edge{
    ArrayList<Connection> nodes;
    Vertex V;
    ArrayList<Integer> removeDuplicates;
    public Edge(int name) {
        removeDuplicates = new ArrayList<>();
        nodes = new ArrayList<>();
        createVertex(name);
    }
    public void createVertex(int name){
        V = new Vertex(name);
    }
    public void connectNode(int weight, int des, int src, Edge[] E){
         if( !removeDuplicates.contains(des) ) {
             nodes.add(new Connection(weight, des));
             removeDuplicates.add(des);
         } 
         if( !E[des].removeDuplicates.contains(src) ) {
             E[des].nodes.add(new Connection(weight, src)); 
             E[des].removeDuplicates.add(des);
         }
    }
    public int getName(){
        return V.name;
    }
     public int containsWeight(int i){
        return nodes.get(i).connectedVertex;
    }
}
class Connection{
    int weight;
    int connectedVertex;

    public Connection(int weight, int connectedVertex) {       
        this.weight = weight;
        this.connectedVertex = connectedVertex;
    }
    public String Node(){
        return connectedVertex+" : "+weight;
    }
   
    
}
class Vertex{
    int name;

    public Vertex(int name) {
        this.name = name;
    }
    
}