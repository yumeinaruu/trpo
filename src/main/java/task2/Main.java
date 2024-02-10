package task2;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many flights? ");
        Airline[] airlines = new Airline[scanner.nextInt()];

        for (int i = 0; i < airlines.length; i++) {
            System.out.println("Enter destiny, flight id, plane type, take off time (example: " +
                    LocalDateTime.now() + ", day of week: ");
            airlines[i] = new Airline(scanner.next(), scanner.nextInt(),
                    scanner.next(), LocalDateTime.parse(scanner.next()), scanner.next());
        }

        printByDestiny(airlines);
        printByDayOfWeek(airlines);
        printByDayTime(airlines);
    }

    public static void printByDestiny(Airline[] airlines) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter destiny: ");
        String destiny = scanner.nextLine();
        for (Airline airline : airlines) {
            if (Objects.equals(airline.getDestiny(), destiny)) {
                System.out.println(airline);
            }
        }
    }

    public static void printByDayOfWeek(Airline[] airlines) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week: ");
        String dayOfWeek = scanner.nextLine();
        for (Airline airline : airlines) {
            if (Objects.equals(airline.getDayOfWeek(), dayOfWeek)) {
                System.out.println(airline);
            }
        }
    }

    public static void printByDayTime(Airline[] airlines) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week and time: ");
        String dayOfWeek = scanner.nextLine();
        System.out.println();
        LocalDateTime takeOffTime = LocalDateTime.parse(scanner.nextLine());
        for (Airline airline : airlines) {
            if (Objects.equals(airline.getDayOfWeek(), dayOfWeek) && takeOffTime.isBefore(airline.getTakeOffPlane())) {
                System.out.println(airline);
            }
        }
    }
}
