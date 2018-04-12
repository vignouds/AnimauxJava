package animal.main;
import animal.animals.*;

public class Main {

	public static void main(String[] args) {
		Homme toto  = new Homme();
		System.out.println(toto.getAge());
		toto.setAge(25);
		System.out.println(toto.getAge());
	}

}
