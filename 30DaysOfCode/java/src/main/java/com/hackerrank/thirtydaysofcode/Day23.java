package com.hackerrank.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Day23 {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static void levelOrder(Node root) {
        if (root != null) {
            // 1 - enqueue current root
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            // 2-  while there are nodes to process
            while (queue.peek() != null) {
                // 3- dequeue next node
                Node node = queue.remove();
                System.out.print("" + node.data + " ");

                // 4- enqueue child elements from next level in order
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}