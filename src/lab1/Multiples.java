package lab1;

public class Multiples {

    public static void main(String[] args) {

        int count = multiples(3, 5, 1000);
        System.out.println(count);
    }

    public static int multiples(int a, int b, int n) {
        int count = 0;
        for (int i = 1; i < a; i++) {
            boolean divisibleBya = i % n == 0;
            boolean divisibleByb = i % b == 0;
            if (divisibleBya || divisibleByb) {
                count = count + 1;
            }
        }
        return count;
    }
}
