package com.isvaso.iterator.iteratorcodingexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Node<T>
{
    public T value;
    public Node<T> left, right, parent;

    public Node(T value)
    {
        this.value = value;
    }

    public Node(T value, Node<T> left, Node<T> right)
    {
        this.value = value;
        this.left = left;
        this.right = right;

        left.parent = right.parent = this;
    }

    public Iterator<Node<T>> preOrder()
    {
        List<Node<T>> list = new ArrayList<>();
        NodeIterator<T> ni = new NodeIterator<>(this);
        while (ni.hasNext())
            list.add(ni.next());
        return list.iterator();
    }
}

class NodeIterator<T> {

    private Node<T> current;
    private boolean yieldedStart;

    public NodeIterator(Node<T> current) {
        this.current = current;
    }

    private boolean hasRightmostParent(Node<T> node) {
        if (node.parent == null) return false;
        else {
            return (node == node.parent.left
                    || hasRightmostParent((node.parent)));
        }
    }

    public boolean hasNext() {
        return current.left != null
                || current.right != null
                || hasRightmostParent(current);
    }

    public Node<T> next() {
        if (!yieldedStart) {
            yieldedStart = true;
            return current;
        }

        if (current.left != null) {
            current = current.left;

        } else if (current.right != null) {
            current = current.right;

        } else {
            Node<T> p = current.parent;
            while (p != null && p.right == current) {
                current = p;
                p = p.parent;
            }
            if (p.right != null) {
                current = p.right;
            }
        }
        return current;
    }
}




class Main {

    // Tree:
//        1
//      /   \
//     2     3
//    / \   / \
//   4   5 6   7
//  / \
//     8

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1,
                new Node<>(2,
                        new Node<>(4,
                                new Node<>(99),
                                new Node<>(8)),
                        new Node(5)),
                new Node<>(3,
                        new Node<>(6),
                        new Node<>(7)));
        NodeIterator<Integer> ni = new NodeIterator<>(root);

        while (ni.hasNext())
            System.out.println(ni.next().value + " ");
    }
}


