package labs.lab5.practic4;

public class TestClass {
    public static void main(String[] args) {
        ComputeMethods compMeth = new ComputeMethods();
        double C = compMeth.fToC(233);
        double c = compMeth.hypotenuse(4, 8);
        int sum = compMeth.roll();

        System.out.println("Температура в градусах Цельсия: "+ C);
        System.out.println("Гипотенуза треугольника равна : " + c);
        System.out.println("Сумма значений на гранях равна: " + sum);
    }
}
