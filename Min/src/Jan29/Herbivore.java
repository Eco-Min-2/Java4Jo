package Jan29;

public class Herbivore extends Animal {

    private String herbivore;

    @Override
    public void printHerbivore() {
        super.printHerbivore();
        System.out.print(herbivore);
    }

    public Herbivore() {
    }

    public Herbivore(String herbivore) {
        this.herbivore = herbivore;
        super.setType("초식");
    }
}
