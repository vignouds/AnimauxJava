package animal.animals;
import animal.animal.*;
import animal.regime.Carnivore;

public class Lion extends Animal {
	public Lion() {
		super();
		this.regime=new Carnivore();
	}

}
