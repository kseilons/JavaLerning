public class VarTest {
    int iNum;
    char cVal;
    boolean bVal;

    public static void main(String[] args) {
        // Создаем объект класса
        VarTest test = new VarTest();

        // Вывод значений по умолчанию
        System.out.println("Uninitilized values:");
        System.out.println("iNum: " + test.iNum);
        System.out.println("cVal: " + test.cVal); // Символ по умолчанию - null ('\u0000')
        System.out.println("bVal: " + test.bVal);

        // Присваиваем новые значения
        test.iNum = -25;
        test.cVal = 'B';
        test.bVal = true;

        // Вывод обновленных значений
        System.out.println("\nUpdated values:");
        System.out.println("iNum: " + test.iNum);
        System.out.println("cVal: " + test.cVal);
        System.out.println("bVal: " + test.bVal);
    }
}
