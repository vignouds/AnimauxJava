package animal.main;
import animal.animals.*;

public class Main {

	public static void main(String[] args) {
		Lion leo  = new Lion();
		System.out.println(leo.getAge());
		leo.setAge(5);
		System.out.println(leo.getAge());
	}

}
