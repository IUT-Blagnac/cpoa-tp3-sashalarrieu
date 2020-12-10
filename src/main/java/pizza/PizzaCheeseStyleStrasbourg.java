package pizza;
import java.util.ArrayList;

public class PizzaCheeseStyleStrasbourg extends Pizza{

	public PizzaCheeseStyleStrasbourg() {
		this.name="Pizza pâte style Strasbourg et fromage";
		this.crust="";
		this.sauce="";
		this.garnitures=new ArrayList<String>();
		this.garnitures.add("Mozzarella en lamelles");
	}
	

	@Override
	public void cut() {
		System.out.println("Découpage en parts carrées");
	}

	@Override
	public void wrap() {
		System.out.println("Emballage dans une boîte officielle");
	}

	@Override
	public void bake() {
		System.out.println("Cuisson 25 minutes à 180°");
	}
}
