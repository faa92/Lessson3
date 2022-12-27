import java.util.Scanner;

public class IfElso {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        String month = scan.nextLine();
        if (month.equals("12") || month.equals("1") || month.equals("2")) {
            System.out.print("Зима");}
        else if (month.equals("3") || month.equals("4") || month.equals("5")) {
            System.out.print("Весна");}
        else if (month.equals("6") || month.equals("7") || month.equals("8")) {
            System.out.print("Лето");}
        else if ((month.equals("9") || month.equals("10") || month.equals("11"))) {
            System.out.print("Осень");
        }
        else { System.out.print("Вы вводите что-то не так!");

        }

    }

}

