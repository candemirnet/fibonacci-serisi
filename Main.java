import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Elaman Sayısını Giriniz: ");
        int n = imp.nextInt(), firstTerm = 0, secondTerm = 1;
        System.out.println(n + " elemanlı Fibonacci Serisi: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}