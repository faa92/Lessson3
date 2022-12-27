import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = scan.nextInt();
        switch (month) {
            case 1,2,12  :
                System.out.print("Зима");
                break;
            case 3,4,5 :
                System.out.print("Весна");
                break;
            case 6,7,8 :
                System.out.print("Лето");
                break;
            case 9,10,11 :
                System.out.print("Осень");
                break;
            default:
                System.out.print("Вы что-то не так ввели!");


        }

    }
}
