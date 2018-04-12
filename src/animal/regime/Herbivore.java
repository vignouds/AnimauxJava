package animal.regime;

public class Herbivore extends Regime {
	public Herbivore() {
		super("herbivore");
	}
	
	public String manger() {
		return "je mange des végétaux";
	}
}
