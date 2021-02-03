package Feb03;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> rank = Arrays.asList("King", "Duke", "Marquess", "Earl", "Baron");
        Title[] titles = new Title[5];
        int taxBox = 0;
        for (int i = 0; i < titles.length; i++) {
            titles[i] = new Title(rank.get(i), (i + 1) * 10);
        }
        for (Title title : titles) {
            System.out.println(title.getName() + "의 돈은 : " + title.getMoney());
            if (title.getName().equals(rank.get(1))) {
                int tax = title.getterTax(10);
                System.out.println(title.getName() + "의 " + tax + " 세금을 지불");
                System.out.println(title.getName() + "의 돈은 : " + title.getMoney());
                taxBox += tax;
            }
        }
        System.out.println("최종 왕의 세금은");
        int kingMoney = taxBox + titles[0].getMoney();
        System.out.println(kingMoney);
    }
}
