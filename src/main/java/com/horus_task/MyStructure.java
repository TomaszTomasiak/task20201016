package com.horus_task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MyStructure implements IMyStructure {

    private List<INode> nodes = new ArrayList<>();

    @Override
    public INode findByCode(String code) {
        if (code != null) {
            return findByArgument(n -> n.getCode().equals(code));
        } else {
            throw new IllegalArgumentException("The Argument is null");
        }
    }

    @Override
    public INode findByRenderer(String renderer) {
        if (renderer != null) {
            return findByArgument(n -> n.getRenderer().equals(renderer));
        } else {
            throw new IllegalArgumentException("The Argument is null");
        }
    }

    @Override
    public int count() {
        return nodes.size();
    }

    private INode findByArgument(Predicate<INode> arg) {
        return nodes.stream().filter(arg).findFirst().orElse(null);
    }

    void addNodeToList(Node node) {
        nodes.add(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyStructure that = (MyStructure) o;

        return nodes != null ? nodes.equals(that.nodes) : that.nodes == null;
    }

    @Override
    public int hashCode() {
        return nodes != null ? nodes.hashCode() : 0;
    }
}
