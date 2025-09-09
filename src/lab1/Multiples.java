package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int i;
        int counter = 0;
        for (i = 1; i < n; i++) {

            if ((i % a == 0) || (i % b == 0)) {
                counter+=1;
            }

        }
        return counter;
    }
}
