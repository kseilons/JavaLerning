package examples;

public class SinglyLinkedListIsSorted {
    private static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }
    
    private Node head;
    
    // Добавление элемента (в конец)
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
    }
    
    // Проверка, отсортирован ли список по возрастанию
    public boolean isSorted() {
        if (head == null) return true;
        Node curr = head;
        while (curr.next != null) {
            if (curr.value > curr.next.value) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        SinglyLinkedListIsSorted list = new SinglyLinkedListIsSorted();
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println("Список отсортирован? " + list.isSorted()); // true
        
        SinglyLinkedListIsSorted list2 = new SinglyLinkedListIsSorted();
        list2.add(1);
        list2.add(5);
        list2.add(3);
        System.out.println("Список отсортирован? " + list2.isSorted()); // false
    }
}
