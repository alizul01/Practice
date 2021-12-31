/**
 * linkedlist
 */
public class linkedlist {

    public static void main(String[] args) {
        Node current = null;
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        // Isi node
        first.data = "Ali";
        first.next = second;
        second.data = "Budi";
        second.next = third;
        third.data = "Caca";
        third.next = null;
        current = first;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Node {
    String data;
    Node next;
}
