package lesson171129;

public class App {
	
	public static void main(String[] args) {
		
		ToyBox box = new ToyBox(new Doll(), new Tank());
		
		box.accept(new Visitor() {
			
			@Override
			public void visit(Toy toy) {
				System.out.println(toy);
			}
		});
		
		box.accept(new Visitor() {
			
			@Override
			public void visit(Toy toy) {
				System.out.println(toy.getClass().getCanonicalName());
			}
		});
		
	}

}
