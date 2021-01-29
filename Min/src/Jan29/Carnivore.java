package Jan29;

public class Carnivore extends Animal{

    public String carnivore;


    @Override
    public void printCarnivore() {
        super.printCarnivore();
        System.out.print(carnivore);
    }

    public Carnivore() {
    }

    public Carnivore(String carnivore) {
        this.carnivore = carnivore;
        super.setType("육식");
    }
}
