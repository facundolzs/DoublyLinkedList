package linkedList;

public class DoublyLinkedList {

    private Node head;

    private class Node {

        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Insert new node at the start of linked list
     *
     * @param data (data of new node)
     */
    public void insertAtStart(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    /**
     * Insert new node at the end of linked list
     *
     * @param data (data of new node)
     */
    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        newNode.next = null;

        if (head == null) {
            head = newNode;
            newNode.prev = null;
            return;
        }

        Node currentLastN = head;

        while (currentLastN.next != null) {
            currentLastN = currentLastN.next;
        }

        currentLastN.next = newNode;
        newNode.prev = currentLastN;
    }

    /**
     * Insert new node at specific position of linked list
     *
     * @param pos (position of new node)
     * @param data (data of new node)
     */
    public void insertPosition(int pos, int data) {

        int length = calcLength(head);

        if (pos < 1 || pos >= length) {
            System.out.println("Can't insert new nodes at this position.");
        } else {

            Node newNode = new Node(data);
            Node tempNode = head;

            while (pos-- > 1) {
                tempNode = tempNode.next;
            }

            Node nextTempNode = tempNode.next;
            nextTempNode.prev = newNode;
            newNode.next = nextTempNode;
            newNode.prev = tempNode;
            tempNode.next = newNode;
        }
    }

    /**
     * Delete first node from linked list
     */
    public void deleteAtStart() {

        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            if (head != null) {
                head = head.next;
                head.prev = null;
            } else {
                head = null;
            }
        }
    }

    /**
     * Delete last node from linked list
     */
    public void deleteAtEnd() {

        if (head == null || head.next == null) {
            deleteAtStart();
            return;
        }

        if (head != null) {
            Node tempNode = head;

            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode = tempNode.prev;
            tempNode.next = null;
        } else {
            head = null;
        }
    }

    /**
     * Delete node at specific position of linked list
     *
     * @param pos (position to delete)
     */
    public void deletePosition(int pos) {

        int length = calcLength(head);

        if (pos < 0 || pos >= length) {
            System.out.println("Can't delete nodes at this position.");
        } else {
            if (pos == length) {
                deleteAtEnd();
                return;
            }
            if (head == null) {
                System.out.println("Linked list is empty");
            } else {

                Node tempNode = head;
                int position = pos;
                for (int i = 0; i < position; i++) {
                    tempNode = tempNode.next;
                }
                if (tempNode == head) {
                    head = tempNode.next;
                    head.prev = null;
                } else if (tempNode == null) {
                    tempNode = tempNode.prev;
                } else if (tempNode.next != null) {
                    tempNode.prev.next = tempNode.next;
                    tempNode.next.prev = tempNode.prev;
                } else {
                    tempNode.prev.next = null;
                }
                tempNode = null;
            }
        }
    }

    /**
     * Calculate length of a linked list
     *
     * @param node
     * @return linked list length
     */
    private int calcLength(Node node) {

        int length = 0;

        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

    /**
     * Display linked list
     */
    public void print() {

        Node tempNode = head;

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("END.");
    }

    /**
     * Display linked list in reverse
     */
    public void printInReverse() {

        Node tempNode = head;
        Node lastNode = null;

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        while (tempNode != null) {
            lastNode = tempNode;
            tempNode = tempNode.next;
        }

        while (lastNode != null) {
            System.out.print(lastNode.data + " -> ");
            lastNode = lastNode.prev;
        }
        System.out.println("START.");
    }

    /**
     * Get data of a node
     *
     * @param pos (position of the node)
     */
    public void getNode(int pos) {

        Node tempNode = head;
        try {
            for (int i = 0; i < pos; i++) {
                tempNode = tempNode.next;
            }
            System.out.println("Node: " + tempNode.data);
        } catch (NullPointerException nullPointerException) {
            System.out.println("This position is not accessible.");
        }
    }

}
