package Jan29;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        Animal[] animals = new Animal[count];

        for (int i = 0; i < count; i++) {
            System.out.println("1 : 육식, 2 : 초식");
            int x = scanner.nextInt();
            String sc = scanner.next();
            if (x == 1) {
                animals[i] = new Carnivore(sc);
            } else {
                animals[i] = new Herbivore(sc);
            }
        }

        List<Animal> carnivore = Arrays.stream(animals)
                .filter(x -> x.getType().equals("육식"))
                .collect(Collectors.toList());

        List<Animal> herbivore = Arrays.stream(animals)
                .filter(x -> x.getType().equals("초식"))
                .collect(Collectors.toList());

        System.out.print("육식 동물 : ");
        for (Animal animal : carnivore) {
            animal.printCarnivore();
            if (carnivore.get(carnivore.size()-1) == animal) {
                System.out.println();
            }else {
                System.out.print(", ");
            }
        }
        System.out.print("초식 동물 : ");
        for (Animal animal : herbivore) {
            animal.printHerbivore();
            if (carnivore.get(herbivore.size()-1) == animal) {
                System.out.println();
            }else {
                System.out.print(", ");
            }
        }
    }
}
