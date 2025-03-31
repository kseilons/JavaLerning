package examples;

public class SinglyLinkedListMax {
    private static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }
    
    private Node head;
    
    // Добавление элемента (в начало для простоты)
    public void add(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    
    // Поиск максимального элемента
    public int findMax() {
        if (head == null) {
            throw new RuntimeException("Список пуст");
        }
        int max = head.value;
        Node curr = head.next;
        while (curr != null) {
            if (curr.value > max) {
                max = curr.value;
            }
            curr = curr.next;
        }
        return max;
    }
    
    public static void main(String[] args) {
        SinglyLinkedListMax list = new SinglyLinkedListMax();
        list.add(10);
        list.add(25);
        list.add(5);
        list.add(40);
        System.out.println("Максимальное значение: " + list.findMax()); // Ожидается 40
    }
}
