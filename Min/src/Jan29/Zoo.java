package Jan29;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zoo {

    private final Scanner sc = new Scanner(System.in);
    private int count;
    private Animal[] animals;

    public Zoo() {
        countAnimal();
        checkAnimal();
    }


    private void countAnimal() {
        System.out.println("동물의 수");
        this.count = sc.nextInt();
        this.animals = new Animal[count];
    }

    private void checkAnimal() {
        for (int i = 0; i < count; i++) {
            System.out.println("1. 육식, 2. 초식");
            int x = sc.nextInt();
            String s = sc.next();
            if (x == 1) {
                this.animals[i] = new Carnivore(s);
            } else {
                this.animals[i] = new Herbivore(s);
            }
        }
    }

    public void printCarnivore() {
        String carnivore = Arrays.stream(this.animals)
                .filter(x -> x instanceof Carnivore)
                .map(Animal::getName)
                .collect(Collectors.joining(", "));
        System.out.println("육식동물 : " + carnivore);
    }

    public void printHerbivore() {
        String herbivore = Arrays.stream(this.animals)
                .filter(x -> x instanceof Herbivore)
                .map(Animal::getName)
                .collect(Collectors.joining(", "));
        System.out.println("초식동물 : " + herbivore);
    }

    public Animal[] getAnimals() {
        return animals;
    }

    private void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
