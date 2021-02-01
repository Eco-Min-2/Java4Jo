package Feb01;

public class Melon extends Food {
    private String farmInfo;

    public Melon(int kal, int price, int weight, String farmInfo) {
        super(kal, price, weight);
        this.farmInfo = farmInfo;
    }
}
