package minMax;

public class Praktikum1 {
    public static void main(String[] args) {
        long a = 142_585_234;
        long b = 9_123_456_678L;
        long maximum = Long.max(a,b);
        System.out.printf("Максимум - " + maximum + "\n");

        double c = 0.00175764;
        double d = 0.00138534;
        double minimum = Double.min(c,d);
        System.out.printf("Минимум - " + minimum);
    }
}
