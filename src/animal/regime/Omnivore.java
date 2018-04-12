package animal.regime;

public class Omnivore extends Regime {
	public Omnivore() {
		super("omnivore");
	}
	
	public String manger() {
		return "je mange de tout";
	}
}
