import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetsSamples {
    static int count = 20;
    static HashSet<Integer> hashSet = new HashSet<Integer>();
    static TreeSet<Integer> treeSet = new TreeSet<Integer>();
    static LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
    static int array[] = new int[count];

    public static void fillSets() {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            Integer element = rand.nextInt(100);
            array[i] = element;
            hashSet.add(element);
            treeSet.add(element);
            linkedHashSet.add(element);
        }
    }

    public static void print() {
        System.out.print("Array: \t\t" + "[");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("\b\b" + "] (" + array.length + ")");

        System.out.println("HashSet: \t" + hashSet + " (" + hashSet.size() + ")");
        System.out.println("TreeSet: \t" + treeSet + " (" + treeSet.size() + ")");
        System.out.println("LinkedHashSet: \t" + linkedHashSet + " (" + linkedHashSet.size() + ")");

        System.out.println("Circle hashSet by iterator:");
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fillSets();
        print();
    }
}
