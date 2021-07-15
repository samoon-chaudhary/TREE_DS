package org.tree.ds;

import org.tree.ds.node.Node;

import java.util.LinkedList;
import java.util.Queue;
/*Tree Traversals */
public class App 
{   private static String str="string checking for git revert";
    public static void main( String[] args )
    {
        Node root=new Node().createNode();



        System.out.println("------------ all tree nodes----------------");
        showTree(root);
        System.out.println();
        System.out.println("------------ levelOrderTraversal------------");
        levelOrderTraversal(root);
        System.out.println();
        System.out.println("------------- InOrderTraversal--------------");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("------------- preOrderTraversal-------------");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("------------- postOrderTraversal------------");
        postOrderTraversal(root);
        checkFlag();
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
    private static void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    private static void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    private static void postOrderTraversal(Node root) {
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    private static boolean flag1(){
        return false;
    }
    private static boolean flag2(){
        return false;
    }
    private static void checkFlag(){
        if(!(flag1() || flag2())){
            System.out.println();
            System.out.println("flag1 : "+flag1()+" , flag2 : "+flag2());
        }
    }
}
