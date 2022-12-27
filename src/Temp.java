import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int t = scan.nextInt();
        if (t>-5) {
            System.out.print("Тепло!");
        } else if (t <=-20 ) {
            System.out.print("Холодно!");
        } else if (t>= -5 && t>= -20) {
            System.out.print("Нормально!");
        } else {System.out.print("Что-то не так!");}


    }
}
