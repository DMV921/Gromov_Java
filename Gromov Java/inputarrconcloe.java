import java.util.Scanner;

public class inputarrconcloe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива через пробел:");
        /* Пройдёмся по всему массиву, заполняя его */
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        
          System.out.print("Inserted array elements:");
          for (int i = 0; i < size; i++) {
          System.out.print(" " + array[i]); // Выводим на экран, полученный массив
          }
          System.out.println();
         
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Числа, кратные 3 в массиве: " + array[i]);
            }
        }
    }
}
