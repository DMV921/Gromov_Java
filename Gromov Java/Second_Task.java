import java.util.Scanner;

public class Second_Task {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, "Cp866");
        System.out.println("Введите имя");
        String string = s.nextLine();
        if (string.equals("Вячеслав")) {
            System.out.println("Привет " + string);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}