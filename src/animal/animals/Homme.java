package animal.animals;
import animal.animal.*;
import animal.regime.Omnivore;

public class Homme extends Animal {
	public Homme() {
		super();
		this.regime = new Omnivore();
	}

}
