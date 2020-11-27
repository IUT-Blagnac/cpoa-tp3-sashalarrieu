import pizza.Pizza;
import pizzerria.Pizzeria;
import pizzerria.PizzeriaBrest;
import pizzerria.PizzeriaStrasbourg;

public class PizzaTestDrive {
  public static void main(String[] args) {
    Pizzeria boutiqueBrest = new PizzeriaBrest();
    Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();

    Pizza pizza = boutiqueBrest.orderPizza("fromage");
    System.out.println("JMB a commandé une " + pizza.getName() + "\n");

    pizza = boutiqueStrasbourg.orderPizza("fromage");
    System.out.println("JMB a commandé une " + pizza.getName() + "\n");
  }
}