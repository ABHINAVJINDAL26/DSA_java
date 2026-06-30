package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BFS {
    static void treebfs(Node root) {
        if(root==null) return;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);


        while(!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.data + " ");

            if(current.left != null) queue.offer(current.left);
            if(current.right != null) queue.offer(current.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("BFS traversal");
        treebfs(root);
    }
}

