package lab1;

public class Reduce {
    public static void main(String[] args) {
        int counter = reduce(100);
        System.out.println(counter);
    }

    public static int reduce(int n) {
        int counter = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n/2;
            }
            else {
                n--;
            }
            counter++;
        }
        return counter;
    }

}
