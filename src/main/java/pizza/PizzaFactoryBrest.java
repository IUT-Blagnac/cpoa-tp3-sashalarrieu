package pizza;

public class PizzaFactoryBrest extends PizzaFactory{

	private PizzaFactoryBrest() {
		super();
	}

	private static PizzaFactoryBrest uniqueInstance=new PizzaFactoryBrest();
	
	public static PizzaFactoryBrest getInstance() {
		return uniqueInstance;
	}
	
	public Pizza create(String name) {
		Pizza pizza=null;
		
		switch(name.toLowerCase()) {
		case("fromage"):
			pizza = new PizzaCheeseStyleBrest();
			break;
		case("grecque"):
			pizza = new PizzaGrecqueStyleBrest();
			break;
		case("poivrons"):
			pizza = new PizzaPoivronsStyleBrest();
			break;
		default:
			pizza = new PizzaCheeseStyleBrest();
			break;
		}
		
		return pizza;
		
	}
}
