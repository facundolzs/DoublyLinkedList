package main;

import linkedList.DoublyLinkedList;

public class Principal {

    public static void main(String[] args) {

        DoublyLinkedList doublyLL_list = new DoublyLinkedList();

        System.out.println("<<List after adding three nodes at the beginning>>");
        doublyLL_list.insertAtStart(-11);
        doublyLL_list.insertAtStart(25);
        doublyLL_list.insertAtStart(42);
        doublyLL_list.print();

        System.out.println("\n<<List after adding three nodes at the end>>");
        doublyLL_list.insertAtEnd(36);
        doublyLL_list.insertAtEnd(71);
        doublyLL_list.insertAtEnd(-3);
        doublyLL_list.print();

        System.out.println("\n<<List after adding a node (99) at position three>>");
        doublyLL_list.insertPosition(3, 99);
        doublyLL_list.print();

        System.out.println("\n<<List after adding a node (15) at position seven>>");
        doublyLL_list.insertPosition(7, 15);
        doublyLL_list.print();

        System.out.println("\n<<List after adding a node (20) at position six>>");
        doublyLL_list.insertPosition(6, 20);
        doublyLL_list.print();

        System.out.println("\n<<List after adding a node (-9) at position two>>");
        doublyLL_list.insertPosition(2, -9);
        doublyLL_list.print();

        System.out.println("\n<<List after deleting the first node>>");
        doublyLL_list.deleteAtStart();
        doublyLL_list.print();

        System.out.println("\n<<List after deleting the last node>>");
        doublyLL_list.deleteAtEnd();
        doublyLL_list.print();

        System.out.println("\n<<List after deleting node at position zero>>");
        doublyLL_list.deletePosition(0);
        doublyLL_list.print();

        System.out.println("\n<<List after deleting node at position five>>");
        doublyLL_list.deletePosition(5);
        doublyLL_list.print();

        System.out.println("\n<<List after deleting node at position one>>");
        doublyLL_list.deletePosition(1);
        doublyLL_list.print();

        System.out.println("\n<<Get node in position one>>");
        doublyLL_list.getNode(1);

        System.out.println("\n<<Get node in position four>>");
        doublyLL_list.getNode(4);

        System.out.println("\n<<Reverse Linked List>>");
        doublyLL_list.printInReverse();

    }

}
