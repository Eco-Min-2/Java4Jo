package Feb01;

import java.util.Objects;

public class Food {
    private int kal;
    private int price;
    private int weight;

    public Food(int kal, int price, int weight) {
        this.kal = kal;
        this.price = price;
        this.weight = weight;
    }

    public int getKal() {
        return kal;
    }

    public void setKal(int kal) {
        this.kal = kal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return getKal() == food.getKal() && getPrice() == food.getPrice() && getWeight() == food.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKal(), getPrice(), getWeight());
    }
}
