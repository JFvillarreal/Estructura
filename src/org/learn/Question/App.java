package org.learn.Question;
 
public class App {
    public static void main(String[] args) {
        // root level 0
        Node A = Node.createNode(0);
        // Level 1
        Node B = Node.createNode(50);
        Node C = Node.createNode(70);
        // Level 2
        Node w = Node.createNode(35);
        Node D = Node.createNode(25);
        Node E = Node.createNode(80);
        Node F = Node.createNode(65);
        Node G = Node.createNode(51);
 
        // connect Level 0 and 1
        A.left = B;
        A.right = C;
        // connect level 1 and level 2
        
        B.left = D;
        B.right = E;
        C.left = w;
        C.left = F;
        C.right = G;
 
        System.out.println("Spiral tree traversal using DFS:");
        SpiralTraversal.spiralTraversal(A);
    }
}