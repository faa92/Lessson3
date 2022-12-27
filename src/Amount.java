import java.util.Scanner;

public class Amount {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = scan.nextInt();
        int sum = 0;
       for (int s = 0;s <= i; s++) {
           sum = sum + s;
           if (s == i) {
           System.out.println("Сумма чисел: " + sum);


           }

       }

    }
}
