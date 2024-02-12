package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 100: ");
        String[] numbers = scanner.nextLine().split(" ");
        int[] numArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numArray[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.stream(numArray)
                .filter((value -> value % 3 == 0 && value < 100 && value > 0))
                .forEach(System.out::println);

        System.out.println("Сделал студент группы 222403 Лисовой Станислав.");
        System.out.println("Задание принято: 10.02.2024");
        System.out.println("Задание сдано: 10.02.2024");
    }
}
