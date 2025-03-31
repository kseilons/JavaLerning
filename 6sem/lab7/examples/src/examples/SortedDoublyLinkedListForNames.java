package examples;

public class SortedDoublyLinkedListForNames {
    private static class Node {
        String name;
        Node prev;
        Node next;
        Node(String name) { this.name = name; }
    }
    
    private Node head;
    private Node tail;
    
    public SortedDoublyLinkedListForNames() {
        head = null;
        tail = null;
    }
    
    // Вставка в отсортированном порядке (алфавитный порядок)
    public void sortedInsert(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        if (name.compareTo(head.name) <= 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (name.compareTo(tail.name) >= 0) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            // Решаем, с какой стороны начинать поиск:
            // Если name ближе к tail, можно начинать поиск с конца.
            if (name.compareTo(tail.name) > 0) {
                // не достигнуто, т.к. условие выше уже обработано
            }
            // Здесь используем поиск с конца
            Node curr = tail;
            while (curr != null && name.compareTo(curr.name) < 0) {
                curr = curr.prev;
            }
            // Вставляем после curr
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;
        }
    }
    
    // Поиск начиная с tail
    public Node searchFromTail(String name) {
        Node curr = tail;
        while (curr != null) {
            if (curr.name.equals(name)) {
                return curr;
            }
            curr = curr.prev;
        }
        return null;
    }
    
    // Для сравнения – поиск с начала
    public Node searchFromHead(String name) {
        Node curr = head;
        while (curr != null) {
            if (curr.name.equals(name)) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }
    
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.name + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        SortedDoublyLinkedListForNames list = new SortedDoublyLinkedListForNames();
        list.sortedInsert("Alice");
        list.sortedInsert("Bob");
        list.sortedInsert("Charlie");
        list.sortedInsert("Dave");
        list.printList();
        System.out.println("Поиск 'Charlie' с конца: " + (list.searchFromTail("Charlie") != null));
    }
}
