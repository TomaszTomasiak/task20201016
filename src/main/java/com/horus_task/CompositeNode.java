package com.horus_task;

import java.util.List;

public class CompositeNode extends Node implements ICompositeNode {

    private final List<INode> nodesList;

    public CompositeNode(String code, String renderer) {
        super(code, renderer);
        this.nodesList = getNodes();
    }

    @Override
    public List<INode> getNodes() {
        return nodesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CompositeNode that = (CompositeNode) o;

        return nodesList != null ? nodesList.equals(that.nodesList) : that.nodesList == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (nodesList != null ? nodesList.hashCode() : 0);
        return result;
    }
}
