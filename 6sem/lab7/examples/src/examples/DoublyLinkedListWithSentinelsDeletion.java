package examples;

public class DoublyLinkedListWithSentinelsDeletion {
    private static class Node {
        int value;
        Node prev;
        Node next;
        Node(int value) { this.value = value; }
    }
    
    private Node headSentinel;
    private Node tailSentinel;
    
    public DoublyLinkedListWithSentinelsDeletion() {
        headSentinel = new Node(Integer.MIN_VALUE);
        tailSentinel = new Node(Integer.MAX_VALUE);
        headSentinel.next = tailSentinel;
        tailSentinel.prev = headSentinel;
    }
    
    // Универсальный метод вставки (из упражнения 5)
    public void insertAfter(Node node, Node newNode) {
        newNode.next = node.next;
        newNode.prev = node;
        node.next.prev = newNode;
        node.next = newNode;
    }
    
    // Метод для добавления узла в конец (например)
    public void addAtEnd(int value) {
        Node newNode = new Node(value);
        insertAfter(tailSentinel.prev, newNode);
    }
    
    // Удаление указанного узла (не допускаем удаление ограничителей)
    public void delete(Node node) {
        if (node == headSentinel || node == tailSentinel) {
            throw new IllegalArgumentException("Нельзя удалить ограничитель");
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    // Метод поиска узла по значению (возвращает первый найденный узел)
    public Node find(int value) {
        Node curr = headSentinel.next;
        while (curr != tailSentinel) {
            if (curr.value == value) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }
    
    public void printForward() {
        Node curr = headSentinel.next;
        while (curr != tailSentinel) {
            System.out.print(curr.value + " <-> ");
            curr = curr.next;
        }
        System.out.println("TAIL");
    }
    
    public static void main(String[] args) {
        DoublyLinkedListWithSentinelsDeletion list = new DoublyLinkedListWithSentinelsDeletion();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.printForward(); // 10 <-> 20 <-> 30 <-> TAIL
        
        Node nodeToDelete = list.find(20);
        if (nodeToDelete != null) {
            list.delete(nodeToDelete);
        }
        list.printForward(); // 10 <-> 30 <-> TAIL
    }
}
