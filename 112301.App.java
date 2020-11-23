import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请您输入数字:");
            int i = scanner.nextInt();

            int max = 100, min = 1;
            int ran2 = (int) (Math.random() * (max - min) + min);

            System.out.println(i + "," + ran2);
        }
    }
}
