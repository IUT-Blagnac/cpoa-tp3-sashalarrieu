package pizza;

public class PizzaFactoryStrasbourg extends PizzaFactory{
	
	private PizzaFactoryStrasbourg() {
		super();
	}

	private static PizzaFactoryStrasbourg uniqueInstance=new PizzaFactoryStrasbourg();
	
	public static PizzaFactoryStrasbourg getInstance() {
		return uniqueInstance;
	}
	
	public Pizza create(String name) {
		Pizza pizza=null;
		
		switch(name.toLowerCase()) {
		case("fromage"):
			pizza = new PizzaCheeseStyleStrasbourg();
			break;
		case("grecque"):
			pizza = new PizzaGrecqueStyleStrasbourg();
			break;
		case("poivrons"):
			pizza = new PizzaPoivronsStyleStrasbourg();
			break;
		default:
			pizza = new PizzaCheeseStyleStrasbourg();
			break;
		}
		
		return pizza;
		
	}
	
}
