package Feb01;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Melon(3, 300, 30, "부산");
        Food food3 = new Melon(3, 300, 30, "부산");
        Food food2 = new Melon(4, 400, 40, "서울");
        System.out.println(food1 instanceof  Melon);
        System.out.println(food1 instanceof  Food);
        System.out.println(food1.equals(food3));
    }
}
