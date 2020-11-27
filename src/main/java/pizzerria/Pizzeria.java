package pizzerria;
import pizza.Pizza;
import pizza.PizzaFactory;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {
	
	private PizzaFactory pizzeriaFactory;
	
        /**
         * @param type
         * @return a Pizza object according to the type
         */
	public final Pizza orderPizza(String type) {
		
		Pizza pizza = this.creerPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.wrap();

		return pizza;
	}
	
	public Pizzeria(PizzaFactory pizzaFactory) {
		this.pizzeriaFactory=pizzaFactory;
	}
	
	protected Pizza creerPizza(String type) {
		return pizzeriaFactory.create(type);
	}
	
	
}