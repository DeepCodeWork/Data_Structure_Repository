public class Linked_List_Basic_Implementation {

    // Everytime you'll declare a linkedlist object this will be the head of it
    Node head;

    // Making it static so that main can access it
    static class Node {
        int data;
        Node next;

        Node(int i){
            data = i;
            next = null;
        }

    }

    public static void main(String[] args){

        Linked_List_Basic_Implementation list = new Linked_List_Basic_Implementation();

        //Declaring the nodes
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Connecting the nodes
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        // Printing the whole list until node.next is not null
        System.out.println("Linked List: ");
        while(list.head!=null){
            System.out.println(list.head.data);
            list.head = list.head.next;
        };

    }
}