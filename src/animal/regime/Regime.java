package animal.regime;

public abstract class Regime {
	private String regime;
	
	public Regime() {
		this.regime=" ";
	}
	
	public String toString() {
		return "("+regime+")";
	}

}
