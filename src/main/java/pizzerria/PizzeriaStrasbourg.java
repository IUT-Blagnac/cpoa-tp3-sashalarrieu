package pizzerria;
import pizza.PizzaFactoryStrasbourg;

public class PizzeriaStrasbourg extends Pizzeria{
	
	public PizzeriaStrasbourg() {
		super(PizzaFactoryStrasbourg.getInstance());
	}

}
