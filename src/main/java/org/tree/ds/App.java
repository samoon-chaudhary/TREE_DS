package org.tree.ds;

import org.tree.ds.node.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Node root=new Node().createNode();
        showTree(root);
        System.out.println();
        System.out.println("-------------------------");
        levelOrderTraversal(root);
    }

    private static void showTree(Node root) {
        if(root==null) return;
        System.out.print(root.data+" ");
        showTree(root.left);
        showTree(root.right);

    }
     //level order traversal is same as BFS
    private static void levelOrderTraversal(Node root){
        if(root==null) return;
        Queue<Node> list=new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            Node element=list.remove();
            System.out.print(element.data+" ");
            if(element.left!=null) list.add(element.left);
            if(element.right!=null) list.add(element.right);
        }
    }
}
