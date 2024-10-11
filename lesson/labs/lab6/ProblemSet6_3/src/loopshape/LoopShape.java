package src.loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        if (height < 1 || width < 1) {
            System.out.println("Вы ввели некорректные данные");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        // Head
        stringBuilder.append("#".repeat(width));

        // Body
        for (int i = 1; i < height - 1 ; i++) {
            stringBuilder.append("\n");
            stringBuilder.append("#");
            // Вставляем пробелы
            stringBuilder.append(" ".repeat(Math.max(0, width - 2)));
            stringBuilder.append("#");
        }
        // Foot
        if (height >= 2) {
            stringBuilder.append("\n");
            stringBuilder.append("#".repeat(width));
        }

        System.out.println(stringBuilder.toString());
    }

    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        if (leg < 1) {
            System.out.println("Вы ввели некорректные данные");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#\n");
        for (int i = 2; i <= leg - 1; i++) {
            stringBuilder.append("#");
            stringBuilder.append(" ".repeat(i - 2));
            stringBuilder.append("#\n");
        }
        if (leg >= 2) {
            stringBuilder.append("#".repeat(leg));
            stringBuilder.append('\n');
        }

        System.out.println(stringBuilder.toString());
    }
}
