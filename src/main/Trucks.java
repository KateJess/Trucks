package main;

import java.util.Scanner;

public class Trucks {

    public static final int CONTAINER_COUNT = 12;
    public static final int BOX_COUNT = 27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boxNumber = 0;
        int containerNumber = 0;
        int cargoNumber = 0;

        int boxes = scanner.nextInt();

        int containers = boxes / BOX_COUNT;
        containers += (boxes % BOX_COUNT) > 0 ? 1 : 0;

        int cargos = containers / CONTAINER_COUNT;
        cargos += (containers % CONTAINER_COUNT) > 0 ? 1 : 0;

        for (; cargos > 0; cargos--) {

            System.out.println("Грузовик: " + ++cargoNumber);

            while (containers > 0) {

                System.out.println("\tКонтейнер: " + ++containerNumber);
                containers--;

                while (boxes > 0) {

                    System.out.println("\t\tЯщик: " + ++boxNumber);
                    boxes--;

                    if (boxNumber % BOX_COUNT == 0) {
                        break;
                    }
                }

                if (containerNumber % CONTAINER_COUNT == 0) {
                    break;
                }
            }
        }
        System.out.println("Необходимо:\nгрузовиков - " + cargoNumber + " шт." + "\nконтейнеров - " + containerNumber + " шт.");
    }
}