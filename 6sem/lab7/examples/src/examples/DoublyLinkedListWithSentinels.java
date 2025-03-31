package examples;

public class DoublyLinkedListWithSentinels {
    private static class Node {
        int value;
        Node prev;
        Node next;
        Node(int value) { this.value = value; }
    }
    
    private Node headSentinel;
    private Node tailSentinel;
    
    public DoublyLinkedListWithSentinels() {
        headSentinel = new Node(Integer.MIN_VALUE); // минимальное значение
        tailSentinel = new Node(Integer.MAX_VALUE); // максимальное значение
        headSentinel.next = tailSentinel;
        tailSentinel.prev = headSentinel;
    }
    
    // Универсальный метод вставки: вставляем newNode сразу после node
    public void insertAfter(Node node, Node newNode) {
        newNode.next = node.next;
        newNode.prev = node;
        node.next.prev = newNode;
        node.next = newNode;
    }
    
    // Добавление в начало через insertAfter (после headSentinel)
    public void addAtBeginning(int value) {
        Node newNode = new Node(value);
        insertAfter(headSentinel, newNode);
    }
    
    // Добавление в конец через insertAfter (вставляем перед tailSentinel)
    public void addAtEnd(int value) {
        Node newNode = new Node(value);
        insertAfter(tailSentinel.prev, newNode);
    }
    
    // Вывод списка (без ограничителей)
    public void printForward() {
        Node curr = headSentinel.next;
        while (curr != tailSentinel) {
            System.out.print(curr.value + " <-> ");
            curr = curr.next;
        }
        System.out.println("TAIL");
    }
    
    public static void main(String[] args) {
        DoublyLinkedListWithSentinels list = new DoublyLinkedListWithSentinels();
        list.addAtBeginning(10);
        list.addAtBeginning(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.printForward(); // Ожидаемый порядок: 20, 10, 30, 40
    }
}
