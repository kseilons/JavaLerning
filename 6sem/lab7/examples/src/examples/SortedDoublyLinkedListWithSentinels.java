package examples;

public class SortedDoublyLinkedListWithSentinels {
    private static class Node {
        int value;
        Node prev;
        Node next;
        Node(int value) { this.value = value; }
    }
    
    private Node headSentinel;
    private Node tailSentinel;
    
    public SortedDoublyLinkedListWithSentinels() {
        headSentinel = new Node(Integer.MIN_VALUE);
        tailSentinel = new Node(Integer.MAX_VALUE);
        headSentinel.next = tailSentinel;
        tailSentinel.prev = headSentinel;
    }
    
    // Вставка в отсортированном порядке
    public void sortedInsert(int value) {
        Node newNode = new Node(value);
        Node curr = headSentinel;
        // Ищем позицию для вставки
        while (curr.next.value < value) {
            curr = curr.next;
        }
        // Вставляем newNode после curr
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next.prev = newNode;
        curr.next = newNode;
    }
    
    public void printList() {
        Node curr = headSentinel.next;
        while (curr != tailSentinel) {
            System.out.print(curr.value + " <-> ");
            curr = curr.next;
        }
        System.out.println("TAIL");
    }
    
    public static void main(String[] args) {
        SortedDoublyLinkedListWithSentinels list = new SortedDoublyLinkedListWithSentinels();
        list.sortedInsert(30);
        list.sortedInsert(10);
        list.sortedInsert(20);
        list.sortedInsert(40);
        list.printList(); // Ожидаемый отсортированный порядок: 10, 20, 30, 40
    }
}
