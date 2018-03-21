package com.ask.sample.graph;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class Graph {
    List<Vertices> nodes;
    private int v;

    public Graph() {
        nodes = new ArrayList<>();
    }

    public Graph(int v) {
        this.v = v;
        nodes = new ArrayList<>(v);
    }

    /**
     * @return
     */
    public boolean isConnectionExist(int from, int to) {
        boolean isConnected = false;
        if (nodes != null && !nodes.isEmpty()) {
            Vertices mainNode = nodes.stream().filter(vertices -> vertices.getValue() == from).findFirst().orElse(null);
            if (mainNode != null) {
                Stack<Vertices> loopStacks = new Stack<>();
                loopStacks.add(mainNode);
                while (!loopStacks.empty()) {
                    Vertices tmpVertices = loopStacks.pop();
                    if (tmpVertices.getValue() == to) {
                        isConnected = Boolean.TRUE;
                        break;
                    } else {
                        tmpVertices.getVertices().stream().forEach(loopStacks::push);
                    }

                }
            }
        }
        return isConnected;
    }

    public void findShortestPath(int entryNode, int searchNode) {
        Vertices selectedNode = nodes.stream().filter( vertices -> vertices.getValue() == entryNode && vertices.getVisited() == null).findFirst().orElse(null);
        if (selectedNode == null) {
            System.out.println("No connection exist");
        }

        List<Vertices> shorttestPath = shortestPath(selectedNode, searchNode);
        Collections.reverse(shorttestPath);
        if (shorttestPath != null && !shorttestPath.isEmpty()) {
            for (Vertices vertice : shorttestPath) {
                System.out.println(vertice.getValue());
            }
        } else {
            System.out.println("No connection exist");
        }
    }

    private List<Vertices> shortestPath(Vertices entryNode, int searchNode) {

        if (entryNode == null) {
            return null;
        }
//
        if (entryNode.getValue() == searchNode) {
            List<Vertices> returnNode = new ArrayList<Vertices>();
            returnNode.add(entryNode);
//            setVisited(selectedNode);
            return  returnNode;
        } else {
            List<List<Vertices>> combineResults = new ArrayList<>();
            setVisited(entryNode);
            for (Vertices connectedVertices:entryNode.getVertices()) {
                Vertices vertice = nodes.stream().filter(filterVertices -> filterVertices.getValue() == connectedVertices.getValue() && filterVertices.getVisited() == null).findFirst().orElse(null);
                if (vertice != null) {
                    List<Vertices> temp = shortestPath(vertice, searchNode);
                    if (temp != null) {
                        temp.add(entryNode);
                        combineResults.add(temp);
                    }
                }
            }
            if (!combineResults.isEmpty()) {
               return combineResults.stream().min(Comparator.comparingInt(elem -> elem.stream().mapToInt(it-> it.getValue()).sum())).orElse(new ArrayList<Vertices>());
            }
        }
        return null;
    }

    public boolean setVisited(Vertices vertices) {
        if (vertices != null) {
            nodes.stream().filter(ite -> ite.getValue() == vertices.getValue()).forEach(ite -> ite.setVisited(Boolean.TRUE));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    /**
     *
     * @param entryNode
     * @param nodeValue
     * @return
     */
    public boolean DFSSearch(int entryNode, int nodeValue) {

        if (nodes != null && !nodes.isEmpty()) {
            Stack<Vertices> vertices = new Stack<>();
            Vertices tmpVertice = nodes.stream().filter(vertice -> vertice.getValue() == entryNode).findFirst().orElse(null);
            vertices.add(tmpVertice);
            while(!vertices.isEmpty()) {
               final Vertices tmp1Vertice = vertices.pop();
//                tmpVertice.setVisited(Boolean.TRUE);
                if (tmp1Vertice.getVisited() == null) {
                    nodes.stream().filter(vertice -> vertice.getValue() == tmp1Vertice.getValue()).forEach(vertices1 -> vertices1.setVisited(Boolean.TRUE));
                    System.out.println(tmp1Vertice.getValue());
                    if (tmp1Vertice.getValue() == nodeValue) {
                        return Boolean.TRUE;
                    }
                    tmp1Vertice.getVertices().stream().forEach(val1 -> {
                        nodes.stream().filter(val2 -> val1.getValue() == val2.getValue()).forEach(vertices::push);
                    });
                }
            }
        }

        return false;
    }

    /**
     * @param v
     * @param e
     * @return
     */
    public boolean addNodes(int v, int e) {

        Optional<Vertices> edgeOptional = nodes.stream().filter(verticesNode -> verticesNode.getValue() == v).findAny();
        Vertices edgeOptionalTwo = nodes.stream().filter(verticesNode -> verticesNode.getValue() == e).findFirst().orElse(null);
        Vertices node = edgeOptional.orElse(null);
        if (node != null) {

            List<Vertices> relatedVertices = node.getVertices();
            if (relatedVertices == null) {
                relatedVertices = new ArrayList<Vertices>();
            }
            relatedVertices.add(new Vertices(e));
        } else {
            node = new Vertices(v);
            List<Vertices> relatedVertices = node.getVertices();
            relatedVertices.add(new Vertices(e));
            nodes.add(node);
        }
        if (edgeOptionalTwo == null) {
            node = new Vertices(e);
            nodes.add(node);
        }
        this.v = nodes.size();
        return Boolean.TRUE;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public List<Vertices> getNodes() {
        return nodes;
    }

    public void setNodes(List<Vertices> nodes) {
        this.nodes = nodes;
    }
}
