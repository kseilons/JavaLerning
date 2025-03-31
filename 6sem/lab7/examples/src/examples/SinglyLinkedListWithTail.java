package examples;

public class SinglyLinkedListWithTail {
    // Внутренний класс для представления узла списка
    private static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    
    private Node sentinel; // Ограничитель (dummy head)
    private Node tail;     // Указатель на последний узел
    
    public SinglyLinkedListWithTail() {
        sentinel = new Node(-1); // значение не имеет значения
        tail = sentinel;
    }
    
    // Добавление в конец за O(1)
    public void addAtEnd(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
    }
    
    // Добавление в начало списка
    public void addAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = sentinel.next;
        sentinel.next = newNode;
        // Если список был пуст, обновляем tail
        if (tail == sentinel) {
            tail = newNode;
        }
    }
    
    // Удаление первого встреченного элемента со значением value
    public boolean delete(int value) {
        Node prev = sentinel;
        Node curr = sentinel.next;
        while (curr != null) {
            if (curr.value == value) {
                // Пропускаем узел curr
                prev.next = curr.next;
                // Если удаляем tail, обновляем tail (при необходимости – приходится пройтись по списку)
                if (curr == tail) {
                    tail = prev;
                }
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
    
    // Вывод списка
    public void printList() {
        Node curr = sentinel.next;
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        SinglyLinkedListWithTail list = new SinglyLinkedListWithTail();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.printList(); // 10 -> 20 -> 30 -> null
        
        list.addAtBeginning(5);
        list.printList(); // 5 -> 10 -> 20 -> 30 -> null
        
        list.delete(20);
        list.printList(); // 5 -> 10 -> 30 -> null
        
        list.delete(30);
        list.printList(); // 5 -> 10 -> null
    }
}
