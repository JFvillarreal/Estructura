package org.learn.Question;

import java.util.*;
public class Main
{
     
    // Class containing left and
    // right child of current
    // node and key value
    static class Node {
         
        public int val;
        public Vector<Node> child;
         
        public Node(int key)
        {
            val = key;
            child = new Vector<Node>();
        }
    }
     
    // Function to create a new node
    static Node newNode(int key)
    {
        Node temp = new Node(key);
        return temp;
    }
   
    // Function to perform zig zag traversal
    // of the given tree
    static void zigzagLevelOrder(Node root)
    {
        if (root == null)
            return;
   
        // Stores the vectors containing nodes
        // in each level of tree respectively
        Vector<Vector<Integer>> result = new Vector<Vector<Integer>>();
   
        // Create a queue for BFS
        Vector<Node> q = new Vector<Node>();
   
        // Enqueue Root of the tree
        q.add(root);
   
        // Standard Level Order Traversal
        // code using queue
        while(q.size() > 0)
        {
            int size = q.size();
   
            // Stores the element in the
            // current level
            Vector<Integer> curLevel = new Vector<Integer>();
   
            // Iterate over all nodes of
            // the current level
            for(int i = 0; i < size; i++)
            {
                Node node = q.get(0);
                q.remove(0);
   
                curLevel.add(node.val);
   
                // Insert all children of the
                // current node into the queue
                for(int j = 0; j < (node.child).size(); j++)
                    q.add(node.child.get(j));
            }
   
            // Insert curLevel into result
            result.add(curLevel);
        }
   
        // Loop to Print the ZigZag Level order
        // Traversal of the given tree
        for(int i = 0; i < result.size(); i++)
        {
            // If i+1 is even reverse the order
            // of nodes in the current level
            if ((i + 1) % 2 == 0)
            {
                Collections.reverse(result.get(i));
            }
   
            // Print the node of ith level
            for(int j = 0; j < result.get(i).size(); j++)
                System.out.print(result.get(i).get(j) + " ");
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        Node root = newNode(1);
        (root.child).add(newNode(2));
        (root.child).add(newNode(3));
        (root.child).add(newNode(32));
        (root.child.get(0).child).add(newNode(4));
        (root.child.get(0).child).add(newNode(5));
        (root.child.get(1).child).add(newNode(6));
        (root.child.get(1)).child.add(newNode(7));
        (root.child.get(1).child).add(newNode(8));
       
        // Function Call
        zigzagLevelOrder(root);
    }
}