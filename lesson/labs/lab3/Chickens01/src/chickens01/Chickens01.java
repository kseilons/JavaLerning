
package chickens01;

class TestData {
    public int eggsPerChicken;
    public int chickenCount;

    public TestData(int eggsPerChicken, int chickenCount) {
        this.eggsPerChicken = eggsPerChicken;
        this.chickenCount = chickenCount;
    }
}


public class Chickens01 {
    private final int eggsPerChicken;
    private int chickenCount; 
    private int totalEggs = 0;
    
    Chickens01(int eggsPerChicken, int chickenCount) {
        this.eggsPerChicken = eggsPerChicken;
        this.chickenCount = chickenCount;
    }
    private void collectEggs() {
        totalEggs += eggsPerChicken * chickenCount;
    }
    // Метод выполняет сценарий из задания 
    public void task() {
        // Понедельник
        collectEggs();
        // Вторник 
        chickenCount += 1;
        collectEggs();
        // Среда
        chickenCount /= 2;
        collectEggs();
    }
    public int getTotalEggs() {
        return totalEggs;
        
    }    public static void main(String[] args) {
        TestData[] data = {
            new TestData(5, 3),
            new TestData(4, 8)
        };

        for (TestData testData : data) {
            Chickens01 chickens = new Chickens01(testData.eggsPerChicken, testData.chickenCount);
            chickens.task();
            int totalEggs = chickens.getTotalEggs();
            System.out.println("Яиц соберет Браун: " + totalEggs + " . Исходные значения переменных: eggsPerChicken = " + testData.eggsPerChicken + ", checkenCount = " + testData.chickenCount);
        }
    } 
}
