package animal.main;
import animal.animals.*;

public class Main {

	public static void main(String[] args) {
		Lion leo  = new Lion();
		Homme toto = new Homme();
		System.out.println(leo.getAge());
		leo.setAge(5);
		System.out.println(leo.getAge());
		System.out.println(toto.getRegime());
	}

}
