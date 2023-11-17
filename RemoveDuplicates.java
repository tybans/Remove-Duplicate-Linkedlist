class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            Node runner = current;

            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(" ");
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(2);
        linkedList.addNode(5);
        linkedList.addNode(12);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(5);
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(5);
        linkedList.addNode(5);

        System.out.println("Original Linked List:");
        linkedList.display();

        linkedList.removeDuplicates();

        System.out.println("\nLinked List after Removing Duplicates:");
        linkedList.display();
    }
}
