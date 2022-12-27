import java.util.Scanner;

public class Ostatok {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num1 = scan.nextInt();
        boolean num2 = num1 % 2 == 0;
        if (num2 == true) {
            System.out.print("Чётное!");
        } else if (num2 == false) {
            System.out.print("Не чётное!");
        }
        else {System.out.print("Что-то не так");}

    }

}
