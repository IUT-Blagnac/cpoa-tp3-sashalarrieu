package pizza;
import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {

	String name;
	String crust;//pate
	String sauce;
	ArrayList<String> garnitures;
	
	
	
	public void prepare() {
		System.out.println("Préparation de "+this.name);
		System.out.println("Étalage de la pâte...");
		System.out.println("Ajout de la sauce...");
		System.out.println("Ajout des garnitures:");
		for(String garniture:this.garnitures) {
			System.out.println(" "+garniture);
		}
	}

	public abstract void bake();//bake

	public abstract void cut();

	public abstract void wrap();

	public String getName() {
		return name;
	}


}
