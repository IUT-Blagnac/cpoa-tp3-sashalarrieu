
public class PizzeriaBrest extends Pizzeria {

	@Override
	protected
	Pizza creerPizza(String type) {
		
		if (type.equals("fromage")) {
			return new PizzaFromageStyleBrest();
		} else if (type.equals("grecque")) {
			return new PizzaGrecque();
		} else {
			return new PizzaPoivrons();
		}
	}

}
