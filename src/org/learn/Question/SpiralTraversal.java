package org.learn.Question;
import java.util.Stack;
 
public class SpiralTraversal {
 
    public static void spiralTraversal(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
 
        Stack<Node> stackOne = new Stack<Node>();
        Stack<Node> stackTwo = new Stack<Node>();
        stackOne.push(root);
        while (!stackOne.isEmpty() || !stackTwo.isEmpty()) {
            // insert right to left in stack
            while (!stackOne.isEmpty()) {
                Node node = stackOne.pop();
                System.out.printf("%d ", node.data);
                if (node.right != null) {
                    stackTwo.push(node.right);
                }
                if (node.left != null) {
                    stackTwo.push(node.left);
                }
            }
            System.out.println("");
            // insert left to right in stack
            while (!stackTwo.isEmpty()) {
                Node node = stackTwo.pop();
                System.out.printf("%d ", node.data);
                if (node.left != null) {
                    stackOne.push(node.left);
                }
                if (node.right != null) {
                    stackOne.push(node.right);
                }
            }
            System.out.println("");
        }
    }
}