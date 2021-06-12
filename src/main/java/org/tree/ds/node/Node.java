package org.tree.ds.node;

public class Node {
    public Node left;
    public Node right;
    public int data;
<<<<<<< HEAD

    public Node(int data) {
        this.data = data;
    }
=======
    public Node(){}
    public Node(int data) {
        this.data = data;
    }
    public Node createNode(){
        Node root=new Node(2);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(5);
        root.left.right=new Node(6);
        root.right.right=new Node(7);
        return root;
    }

>>>>>>> e849a94d0d01558c2bfc2e6558e6bd0901427633
}
