package animal.regime;

public abstract class Regime {
	protected String regime;
	
	public Regime() {
		this.regime=" ";
	}
	
	public Regime(String s) {
		this.regime=s;
	}
	
	public String toString() {
		return "("+regime+")";
	}

}
