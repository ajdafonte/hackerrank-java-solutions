package pt.caires.hackerrank;

import java.util.Scanner;


class Node4
{
    int data;
    Node4 next;

    Node4(final int d)
    {
        data = d;
        next = null;
    }
}

/**
 * Created by aleja on 23/01/2019.
 */
public class Solution24
{
    private static Node4 removeDuplicates(final Node4 head)
    {
        // validates if list is empty
        if (head != null)
        {

            Node4 currNode = head;

            // iterates through list
            while (currNode.next != null)
            {
                // validate duplicates
                if (currNode.data == currNode.next.data)
                {
                    // delete node reference
                    currNode.next = currNode.next.next;
                }
                else
                {
                    // walk through list
                    currNode = currNode.next;
                }
            }
        }

        return head;
    }

    private static Node4 insert(Node4 head, final int data)
    {
        final Node4 p = new Node4(data);
        if (head == null)
        {
            head = p;
        }
        else if (head.next == null)
        {
            head.next = p;
        }
        else
        {
            Node4 start = head;
            while (start.next != null)
            {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    private static void display(final Node4 head)
    {
        Node4 start = head;
        while (start != null)
        {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(final String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        Node4 head = null;
        int T = sc.nextInt();
        while (T-- > 0)
        {
            final int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
