import java.util.Scanner;

public class Third_Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); 
        int array[] = new int[size]; 
        System.out.println("Введите через пробел " + size + " цифр/чисел, и нажмите Enter:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); 
        }
        System.out.println("Числа, кратные 3 в введенном массиве:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(" " + array[i]);
            }
        }
    }
}
