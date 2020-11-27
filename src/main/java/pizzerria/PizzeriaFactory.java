package pizzerria;

public class PizzeriaFactory {
	
	private static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	private PizzeriaFactory() {
		super();
	}
	
	public static PizzeriaFactory getInstance() {
		return uniqueInstance;
	}
	
	public Pizzeria create(String name) {
		Pizzeria pizzeria=null;
		switch(name.toLowerCase()) {
		case ("brest"):
			pizzeria= new PizzeriaBrest();
			break;
		case ("strasbourg"):
			pizzeria= new PizzeriaStrasbourg();
			break;
		}
		
		return pizzeria;
	}

	
}
