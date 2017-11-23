package lesson171108;

public class Hero {
	
	private Hero(Builder buillder) {
		
	}
	
	public static class Builder {
		
		Hero build() {
			return new Hero(this);
		}
		
	}

}
