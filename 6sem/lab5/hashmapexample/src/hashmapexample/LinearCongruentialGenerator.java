package hashmapexample;

public class LinearCongruentialGenerator {
    private  int A;
    private  int B; 
    private  int M;
    private int currentValue;


    public LinearCongruentialGenerator(int A, int B, int M, int seed) {
        this.A = A;
        this.B = B;
        this.M = M;
        this.currentValue = seed;
    }

    public int next() {
        currentValue = (A * currentValue + B) % M;
        return currentValue;
    }

    public static void main(String[] args) {
    	int A = 7;
    	int B = 5;
    	int M = 11;
    	int seed = 0; 

        LinearCongruentialGenerator lcg = new LinearCongruentialGenerator(A, B, M, seed);

        System.out.println("Последовательность псевдослучайных чисел:");
        for (int i = 0; i < 5; i++) {
            System.out.println("X" + i + " = " + lcg.next());
        }
    }
}