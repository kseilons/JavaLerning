
package variables03;

public class Variables03 {

    public static void main(String[] args) {
        
        boolean bool = true;
        
        boolean intVar1 = true; // поменял тип переменной
        int intVar2 = 2;
        int intVar3 = 3; // Переменная была не объявлена
    
        double doubleVar1, doubleVar2, doubleVar3, doubleVar4;
        doubleVar1 = 1.1;
        doubleVar2 = 2.1; // Ошибка в названии переменной 
        doubleVar3 = 3.1;
        doubleVar4 = 0; // Необходимо инициализировать переменную
        // double doubleVar3 = 3.1; тип переменной уже указан
        
    
        String stringVar1 = "1"; // Переменная  была объявлена как int, но должна быть String.

        String stringVar2 = "2";

        //Don't edit these print statements
        System.out.println("bool = "        +bool);
        System.out.println("intVar1 = "     +intVar1);
        System.out.println("intVar2 = "     +intVar2);
        System.out.println("intVar3 = "     +intVar3);
        System.out.println("doubleVar1 = "  +doubleVar1);
        System.out.println("doubleVar2 = "  +doubleVar2);
        System.out.println("doubleVar3 = "  +doubleVar3);
        System.out.println("doubleVar4 = "  +doubleVar4);
        System.out.println("stringVar1 = "  +(stringVar1 +1));
        System.out.println("stringVar2 = "  +(stringVar2 +2));
    }
}
