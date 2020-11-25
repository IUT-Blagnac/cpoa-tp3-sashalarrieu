
public class SimpleFabriqueDePizzaStrasbourg extends SimpleFabriqueDePizzas {

	public Pizza creerPizza(String type) {
		
		if (type.equals("fromage")) {
			return new PizzaFromageStyleStrasbourg();
		} else if (type.equals("grecque")) {
			return new PizzaGrecque();
		} else {
			return new PizzaPoivrons();
		}
	}
	
}
