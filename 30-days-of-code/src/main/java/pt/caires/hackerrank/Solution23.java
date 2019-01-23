package pt.caires.hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 *
 */
public class Solution23
{
    private static void levelOrder(final Node2 root)
    {
        final Queue<Node2> queue = new LinkedList<>();

        //Write your code here
        if (root != null)
        {
            // enqueue current root
            queue.add(root);

            // while there are nodes to process
            while (!queue.isEmpty())
            {
                // dequeue next node
                final Node2 n = queue.remove();

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

    private static Node2 insert(final Node2 root, final int data)
    {
        if (root == null)
        {
            return new Node2(data);
        }
        else
        {
            final Node2 cur;
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
        Node2 root = null;
        while (T-- > 0)
        {
            final int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
