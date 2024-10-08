package start.src;

public class StringPerformance {
    private static String buildStringWithString(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += "a";
        }
        return result;
    }

    private static StringBuilder buildStringWithStringBuilder(int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append("a");
        }
        return result;
    }
 
    public static void main(String[] args) {
        int size = 1000000; // 1 миллион символов

        // String
        String s = TimeLogger.measureTime(() -> buildStringWithString(size));

        // StringBuilder
        StringBuilder sb = TimeLogger.measureTime(() -> buildStringWithStringBuilder(size));

        // StringBuffer
        StringBuffer bf = TimeLogger.measureTime(() -> {
            StringBuffer result = new StringBuffer();
            for (int i = 0; i < size; i++) {
                result.append("a");
            }
            return result;
        });
    }
}
