package examples;

public class CycleDetection {
    private static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }
    
    private Node head;
    
    // Добавление элемента в конец списка
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    
    // Для тестирования: создаёт цикл, связывая последний узел с узлом на позиции pos (0-indexed)
    public void createCycle(int pos) {
        if (head == null) return;
        Node cycleStart = null;
        Node curr = head;
        int index = 0;
        while (curr.next != null) {
            if (index == pos) {
                cycleStart = curr;
            }
            curr = curr.next;
            index++;
        }
        if (cycleStart != null) {
            curr.next = cycleStart; // создаём цикл
        }
    }
    
    // Алгоритм Флойда для обнаружения и разрыва цикла
    public boolean detectAndRemoveCycle() {
        if (head == null || head.next == null) return false;
        
        Node slow = head;
        Node fast = head;
        boolean cycleExists = false;
        
        // Обнаружение цикла
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }
        
        if (!cycleExists) {
            return false;
        }
        
        // Нахождение начала цикла
        slow = head;
        Node prev = null; // для отслеживания узла перед fast
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // slow (или fast) указывает на начало цикла, prev – последний узел цикла.
        // Разрываем цикл:
        if (prev != null) {
            prev.next = null;
        }
        return true;
    }
    
    // Вывод списка (без цикла)
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        CycleDetection list = new CycleDetection();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        // Создадим цикл: последний узел свяжем с узлом с индексом 2 (значение 3)
        list.createCycle(2);
        
        if (list.detectAndRemoveCycle()) {
            System.out.println("Цикл обнаружен и разорван.");
        } else {
            System.out.println("Цикл не обнаружен.");
        }
        list.printList(); // Ожидается: 1 -> 2 -> 3 -> 4 -> 5 -> null
    }
}
