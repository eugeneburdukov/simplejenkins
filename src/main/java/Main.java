public class Main {

    public static int doFactorial(int n) {
        int factorial = 1;
        while (n > 1) {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(doFactorial(5));

    }
}
