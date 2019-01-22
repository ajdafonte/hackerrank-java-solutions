package pt.caires.hackerrank;

import java.util.Scanner;


class Node2
{
    Node2 left, right;
    int data;

    Node2(final int data)
    {
        this.data = data;
        left = right = null;
    }
}

/**
 * Created by aleja on 23/01/2019.
 */
public class Solution22
{
    private static int getHeight(final Node2 root)
    {
        //Write your code here
        if (root == null)
        {
            return -1;
        }
        else
        {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
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
        final int height = getHeight(root);
        System.out.println(height);
    }
}
