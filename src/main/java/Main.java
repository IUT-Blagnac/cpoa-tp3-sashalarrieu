import pizza.Pizza;
import pizzerria.PizzeriaStrasbourg;

public class Main {

	public static void main(String[] args) {
		PizzeriaStrasbourg pizzeriaStrasbourg=new PizzeriaStrasbourg();
		@SuppressWarnings("unused")
		Pizza pizza = pizzeriaStrasbourg.orderPizza("fromage");
	}

}
