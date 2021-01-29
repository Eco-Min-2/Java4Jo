package Jan29;

public class Carnivore extends Animal{

    public String carnivore;

    public Carnivore(String name) {
        super(name);
        setCarnivore("육식");
    }

    public String getCarnivore() {
        return carnivore;
    }

    public void setCarnivore(String carnivore) {
        this.carnivore = carnivore;
    }
}
