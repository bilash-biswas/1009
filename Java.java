import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a;
        double b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextLine();
        b = input.nextDouble();
        c = input.nextDouble();
        System.out.printf("TOTAL = R$ %.2f\n", b + c * 0.15);
    }
}
