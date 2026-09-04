package DAY10.SESSION3;
//Find the maximum element in binary tree
import java.util.Scanner;

public class BinaryTreeMaximum {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }

    static int max = Integer.MIN_VALUE;

    static void dfs(Node root) {
        if (root == null)
            return;

        if (root.data > max)
            max = root.data;

        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            root = insert(root, value);
        }

        dfs(root);

        System.out.println("Maximum = " + max);
        sc.close();
    }
}