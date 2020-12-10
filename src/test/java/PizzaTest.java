import static org.junit.Assert.*;

import org.junit.Test;
import pizza.PizzaFactory;
import pizza.PizzaFactoryBrest;
import pizza.PizzaFactoryStrasbourg;

public class PizzaTest {
	@Test
    public void twoPizzaFactoryBrestAreTheSame () {
    	PizzaFactory fact1 = PizzaFactoryBrest.getInstance();
    	PizzaFactory fact2 = PizzaFactoryBrest.getInstance();
    	assertEquals("Factory from brest is the same", fact1, fact2);
    }
    
    @Test
    public void twoPizzaFactoryStrasBourgAreTheSame () {
    	PizzaFactory fact1 = PizzaFactoryBrest.getInstance();
    	PizzaFactory fact2 = PizzaFactoryBrest.getInstance();
    	assertEquals("Factory from brest is the same", fact1, fact2);
    }
    
    @Test
    public void twoPizzaFactoryFromDifferentFactoryAreNotTheSame() {
    	PizzaFactory fact1 = PizzaFactoryStrasbourg.getInstance();
    	PizzaFactory fact2 = PizzaFactoryBrest.getInstance();
    	assertNotEquals("Factory from brest is different of factory from Strasbourg", fact1, fact2);
    }
}
