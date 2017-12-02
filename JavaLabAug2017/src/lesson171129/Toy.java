package lesson171129;

import java.util.Collections;
import java.util.List;

abstract public class Toy {
	
	List<Toy> list = Collections.EMPTY_LIST;
	
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
		for (Toy toy : list) {
			toy.accept(visitor);
		}
	}

}
