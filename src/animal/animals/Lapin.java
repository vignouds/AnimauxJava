package animal.animals;
import animal.animal.*;
import animal.regime.Carnivore;
import animal.regime.Herbivore;

public class Lapin extends Animal {
	public Lapin() {
		super();
		this.regime=new Herbivore();
	}
	
}
