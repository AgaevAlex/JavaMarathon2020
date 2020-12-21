package day18;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Node root = new Node(20);
        addNode(14, root);
        addNode(23, root);
        addNode(11, root);
        addNode(16, root);
        addNode(22, root);
        addNode(27, root);
        addNode(5, root);
        addNode(15, root);
        addNode(18, root);
        addNode(24, root);
        addNode(150, root);
        addNode(8, root);
        dfs(root);


    }

    public static void addNode(int node, Node root) {
        if (root.getValue() >= node) {
            if (root.getLeftSon() == null) {
                root.setLeftSon(new Node(node));
            } else {
                addNode(node, root.getLeftSon());
            }
        } else {
            if (root.getRightSon() == null) {
                root.setRightSon(new Node(node));
            } else {
                addNode(node, root.getRightSon());
            }
        }
    }

    public static void dfs(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");
        dfs(root.getLeftSon());
        System.out.print(root.getValue() + " ");
        dfs(root.getRightSon());
    }
}