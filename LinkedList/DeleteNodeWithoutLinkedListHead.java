/* Structure of Linked List Node
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    public void deleteNode(Node x) {
        // code here
        x.data = x.next.data;
        x.next = x.next.next;
    }
}

// Time complexity -> O(1)
// Space complexity -> O(1)
/*
  Approach -> -> Copy the data of x.next into x.
              -> Skip the next node by connecting x to x.next.next.
*/
