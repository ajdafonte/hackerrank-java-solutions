package pt.caires.hackerrank;

import java.util.Scanner;


class Node
{
    int data;
    Node next;

    Node(final int d)
    {
        data = d;
        next = null;
    }
}

class Solution15
{

    public static Node insert(Node head, final int data)
    {
        if (head == null)
        {
            head = new Node(data);
        }
        else
        {
            Node currNode = head;
            while (currNode.next != null)
            {
                currNode = currNode.next;
            }
            currNode.next = new Node(data);
        }

        return head;
    }

    public static void display(final Node head)
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
        int N = sc.nextInt();

        while (N-- > 0)
        {
            final int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}