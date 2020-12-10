package pizza;
import java.util.ArrayList;

public class PizzaCheeseStyleBrest extends Pizza{

	public PizzaCheeseStyleBrest() {
		this.name="Pizza sauce style brest et fromage";
		this.crust="";
		this.sauce="";
		this.garnitures=new ArrayList<String>();
		this.garnitures.add("Parmigiano reggiano râpé");
	}

	@Override
	public void bake() {
		System.out.println("Cuisson 25 minutes à 180°");
	}
	
	@Override
	public void cut() {
		System.out.println("Découpage en parts triangulaires");
	}

	@Override
	public void wrap() {
		System.out.println("Emballage dans une boîte officielle");
	}

	
	
}
