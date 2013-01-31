package org.hanuna.gitalk.graph.new_mutable.elements;

import org.hanuna.gitalk.graph.elements.Branch;
import org.hanuna.gitalk.graph.elements.Edge;
import org.hanuna.gitalk.graph.elements.Node;
import org.jetbrains.annotations.NotNull;

/**
 * @author erokhins
 */
public class SimpleEdge implements Edge {
    private final Node upNode;
    private final Node downNode;
    private final Type type;
    private final Branch branch;

    public SimpleEdge(Node upNode, Node downNode, Type type, Branch branch) {
        this.upNode = upNode;
        this.downNode = downNode;
        this.type = type;
        this.branch = branch;
    }

    @NotNull
    @Override
    public Node getUpNode() {
        return upNode;
    }

    @NotNull
    @Override
    public Node getDownNode() {
        return downNode;
    }

    @NotNull
    @Override
    public Type getType() {
        return type;
    }

    @NotNull
    @Override
    public Branch getBranch() {
        return branch;
    }

    @Override
    public Node getNode() {
        return null;
    }

    @Override
    public Edge getEdge() {
        return this;
    }
}
