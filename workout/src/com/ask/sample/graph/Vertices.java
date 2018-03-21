package com.ask.sample.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertices {
    private Boolean visited;
    private Integer value;
    private List<Vertices> vertices;

    Vertices() {
        vertices = new ArrayList<>();
    }

    Vertices(int value) {
        this.value = value;
        vertices = new ArrayList<>();
    }
    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public List<Vertices> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertices> vertices) {
        this.vertices = vertices;
    }
}
