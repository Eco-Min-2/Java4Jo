package Feb03;

public class Title implements Tax {
    private String name;
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Title(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public int getterTax(int tax) {
        if (this.name.equals("Duke")) {
            setMoney(money - tax);
            return tax;
        } else {
            return 0;
        }
    }
}
