package java4Jo;

import java.util.Scanner;

public class PizzaStore {

	private Chief chief;
	private Clerk clerk;
	private int money;

	private Scanner sc = new Scanner(System.in);

	public PizzaStore() {
		this.chief = new Chief();
		this.clerk = new Clerk();
		money = 10000;
	}

	public void order(Guest guest) {
		int price = 0;
		int pizza;
		int drink;
		System.out.println("-----------------------");
		System.out.println("		���� �޴�		");
		System.out.println("1.���� ����(12000), 2.�Ұ�� ����(11000), 3.��Ʈ�� ����(12000) 4.������ũ ����(12000) 5.��Ÿ�̰� ����(13000)");
		pizza = sc.nextInt();
		switch (pizza) {
		case 1:
			clerk.setPizzaOrder("���� ����");
			price += 12000;
			break;
		case 2:
			clerk.setPizzaOrder("�Ұ�� ����");
			price += 12000;
			break;
		case 3:
			clerk.setPizzaOrder("��Ʈ�� ����");
			price += 12000;
			break;
		case 4:
			clerk.setPizzaOrder("������ũ ���� ");
			price += 12000;
			break;
		case 5:
			clerk.setPizzaOrder("��Ÿ�̰� ����");
			price += 12000;
			break;
		default:
			System.out.println("���� �޴��Դϴ�.");
		}
		System.out.println("		����� �޴�		");
		System.out.println("1.�ݶ�(1000), 2.���̴�(1000), 3.ȯŸ(1000)");
		drink = sc.nextInt();
		switch (drink) {
		case 1:
			clerk.setDrinkOrder("�ݶ�");
			price += 1000;
			break;
		case 2:
			clerk.setDrinkOrder("���̴�");
			price += 1000;
			break;
		case 3:
			clerk.setDrinkOrder("ȯŸ");
			price += 1000;
			break;
		default:
			System.out.println("���� �޴��Դϴ�.");
		}
		if(guest.getMoney() < price) {
			System.out.println("���� �����մϴ�.");
		} else {
			System.out.println("���� �Ǿ����ϴ�.");
			System.out.println("��ø� ����� �ּ���.");
			money += price;
			guest.setPizza(clerk.pizzaMenu(chief));
			guest.setDrink(clerk.drinkMenu());
			
			System.out.println("�ֹ��Ͻ� " + guest.getPizza() + "�� " + guest.getDrink() + " ���Խ��ϴ�.");

		}

	}

}