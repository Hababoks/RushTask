import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String stroka1 = console.nextLine();
        String stroka2 = console.nextLine();
        String stroka3 = console.nextLine();
        System.out.println(stroka3);
        System.out.println(stroka2.toUpperCase());
        System.out.println(stroka1.toLowerCase());
    }
}