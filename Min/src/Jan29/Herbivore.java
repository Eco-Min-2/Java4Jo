package Jan29;

public class Herbivore extends Animal {

    private String herbivore;

    public Herbivore(String name) {
        super(name);
        setHerbivore("초식");
    }

    public String getHerbivore() {
        return herbivore;
    }

    public void setHerbivore(String herbivore) {
        this.herbivore = herbivore;
    }
}
