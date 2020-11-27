package pizzerria;
import pizza.PizzaFactoryBrest;

public class PizzeriaBrest extends Pizzeria{
	public PizzeriaBrest() {
		super(PizzaFactoryBrest.getInstance());
	}
}
