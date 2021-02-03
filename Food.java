package Test_20210201;

public class Food {

	private int calorie;
	private int price;
	private int Weight;
	
	public Food(int calorie, int price, int weight) {
		this.calorie = calorie;
		this.price = price;
		Weight = weight;
	}
	
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}

	@Override
	public String toString() {
		return "Food [calorie=" + calorie + ", price=" + price + ", Weight=" + Weight + "]";
	}
	
	
	
	
	
	
}
