package animal.animal;
import animal.regime.*;

public abstract class Animal {
	private int age, poids, taille;
	private String nom;
	protected Regime regime;
	
	public Animal() {
		this.age=0;
		this.poids=0;
		this.taille=0;
		this.nom=" ";
	}	
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
		
	public void manger() {
		
	}
		
	//deplacer()
	
}
