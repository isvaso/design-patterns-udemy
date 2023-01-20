package com.isvaso.iterator.treetraversal;

// Tree:
//        1
//      /   \
//     2     3
//    / \   / \
//   4   5 6   7
//  / \
//     8

public class Main {

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1,
                new Node<>(2,
                        new Node<>(4,
                                new Node<>(null),
                                new Node<>(8)),
                        new Node(5)),
                new Node<>(3,
                        new Node<>(6),
                        new Node<>(7)));

        InOrderIterator<Integer> it = new InOrderIterator<>(root);

        while (it.hasNext()) {
            System.out.print("" + it.next() + ", ");
        }
        System.out.println();

        BinaryTree<Integer> tree = new BinaryTree<>(root);
        tree.forEach(n -> System.out.print("" + n + ", "));
        System.out.println();
    }
}
