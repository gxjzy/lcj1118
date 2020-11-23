import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        while (true) {

            Thread.sleep(1000);

            int max = 100, min = 1;
            int ran2 = (int) (Math.random() * (max - min) + min);
            int ran3 = (int) (Math.random() * (max - min) + min);

            System.out.println("(X:"+ran2 + "," + "Y:"+ran3+")");
        }
    }
}
