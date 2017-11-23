package lesson171115;

public class Example2 {
	
	public static void main(String[] args) {
		
		Example2 ex2 = new Example2();
		
		ex2.doWork();
		
	}

	private void doWork() {

		// ...
		
		String currentState = getStatefulService().getState(); 
		
		
	}

	public State getStatefulService() {

		return new State() {

			@Override
			public String getState() {
				return Singleton.instance().getState();
			}
			
		};
		
	}

}
