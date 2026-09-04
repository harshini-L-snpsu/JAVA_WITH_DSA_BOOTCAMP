package DAY10.SESSION3;

public class BinaryTree {
    Node root;

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public void createTree(){
        root = new Node(10);
        root.left=new Node(20);
        root.right=new Node(20);

        root.left.left = new Node(40);
        root.left.right = new Node(50);
    }

    public static void main(String[]args){
        BinaryTree tree = new BinaryTree();
        tree.createTree();
    }
}

