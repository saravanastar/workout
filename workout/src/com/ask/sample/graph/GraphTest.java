package com.ask.sample.graph;

public class GraphTest {

    public static void main(String[] args) {
        Graph graph = new Graph();
//        graph.addNodes(0,1);
//        graph.addNodes(0,2);
//        graph.addNodes(1,2);
//        graph.addNodes(2,3);
//        graph.addNodes(3,4);
//        graph.addNodes(4,5);
//        graph.addNodes(0,5);
//        graph.addNodes(1,6);
//        graph.addNodes(5,6);

        graph.addNodes(1,6);
        graph.addNodes(1,0);
        graph.addNodes(1,4);
        graph.addNodes(0,3);
        graph.addNodes(0,1);
        graph.addNodes(3,0);
        graph.addNodes(3,4);
        graph.addNodes(3,5);
        graph.addNodes(4,1);
        graph.addNodes(4,3);
        graph.addNodes(4,2);
        graph.addNodes(6,1);
        graph.addNodes(6,2);
        graph.addNodes(2,4);
        graph.addNodes(2,6);
        graph.addNodes(2,5);
        graph.addNodes(5,2);
        graph.addNodes(5,3);




//        System.out.println(graph.isConnectionExist(1,2));
//        System.out.println(graph.isConnectionExist(2,1));
//        System.out.println(graph.DFSSearch(0,5));
       graph.findShortestPath(1,4);
    }
}
