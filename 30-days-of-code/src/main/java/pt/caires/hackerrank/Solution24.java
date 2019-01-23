package pt.caires.hackerrank;

import java.util.Scanner;


/**
 *
 */
public class Solution24
{
    private static Node removeDuplicates(final Node head)
    {
        // validates if list is empty
        if (head != null)
        {

            Node currNode = head;

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

    private static Node insert(Node head, final int data)
    {
        final Node p = new Node(data);
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
            Node start = head;
            while (start.next != null)
            {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    private static void display(final Node head)
    {
        Node start = head;
        while (start != null)
        {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(final String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        Node head = null;
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
