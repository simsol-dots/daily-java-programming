public class Algorithm {
    static void main() {

        int n = 5;
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i - n; j++) {
                System.out.print( " * ");
            }

        }
    }
}