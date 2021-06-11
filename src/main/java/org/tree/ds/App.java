package org.tree.ds;

import org.tree.ds.node.Node;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Node root=new Node(2);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(5);
        root.left.right=new Node(6);
        root.right.right=new Node(7);
        showTree(root);
    }

    private static void showTree(Node root) {
        if(root==null) return;
        System.out.print(root.data+" ");
        showTree(root.left);
        showTree(root.right);

    }
}
