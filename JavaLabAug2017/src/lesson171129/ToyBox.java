package lesson171129;

import java.util.Arrays;

public class ToyBox extends Toy {
	
	public ToyBox(Toy... toys) {
		list = Arrays.asList(toys);
	}

}
