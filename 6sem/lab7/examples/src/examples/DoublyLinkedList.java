package examples;

public class DoublyLinkedList {
    // Узел двунаправленного списка
    private static class Node {
        int value;
        Node prev;
        Node next;
        Node(int value) { this.value = value; }
    }
    
    private Node head; // указатель на первый элемент
    private Node tail; // указатель на последний элемент
    
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    
    // Добавление в начало
    public void addAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) { // если список был пуст
            tail = newNode;
        }
    }
    
    // Вывод списка (прямой обход)
    public void printForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addAtBeginning(10);
        list.addAtBeginning(20);
        list.addAtBeginning(30);
        list.printForward(); // Ожидается: 30 <-> 20 <-> 10 <-> null
    }
}
