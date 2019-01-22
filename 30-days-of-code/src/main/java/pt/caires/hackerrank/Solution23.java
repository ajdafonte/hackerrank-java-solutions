package pt.caires.hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node3
{
    Node3 left, right;
    int data;

    Node3(final int data)
    {
        this.data = data;
        left = right = null;
    }
}

/**
 * Created by aleja on 23/01/2019.
 */
public class Solution23
{
    private static void levelOrder(final Node3 root)
    {
        final Queue<Node3> queue = new LinkedList<>();

        //Write your code here
        if (root != null)
        {
            // enqueue current root
            queue.add(root);

            // while there are nodes to process
            while (!queue.isEmpty())
            {
                // dequeue next node
                final Node3 n = queue.remove();

                System.out.print(n.data + " ");

                // enqueue child elements from next level in order
                if (n.left != null)
                {
                    queue.add(n.left);
                }
                if (n.right != null)
                {
                    queue.add(n.right);
                }
            }
        }
    }

    private static Node3 insert(final Node3 root, final int data)
    {
        if (root == null)
        {
            return new Node3(data);
        }
        else
        {
            final Node3 cur;
            if (data <= root.data)
            {
                cur = insert(root.left, data);
                root.left = cur;
            }
            else
            {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(final String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node3 root = null;
        while (T-- > 0)
        {
            final int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
