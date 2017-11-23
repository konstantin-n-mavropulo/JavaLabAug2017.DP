package lesson171123;


public class Dog {
	
	private class Hungry implements Brain {

		@Override
		public void strokeEvent() {
			bite();
		}

		@Override
		public void feedEvent() {
			eat();
			brain = new Fed();
		}

		@Override
		public void playEvent() {
			bark(); bite();
		}

	}

	private interface Brain {
		void strokeEvent();
		void feedEvent();
		void playEvent();
	}
	
	private class Fed implements Brain {

		@Override
		public void strokeEvent() {
			wake();
		}

		@Override
		public void feedEvent() {
			wake();
		}

		@Override
		public void playEvent() {
			jump(); bark(); wake();
			brain = new Hungry();
		}
		
	}
	
	private static class DogData {
		int x;
		int y;
	}
	
	
	
	private DogData data = new DogData();
	private Brain brain = new Hungry();
	
	
	private void eat() {
		System.out.println("eat");
	}

	private  void bite() {
		System.out.println("bite");
		
	}

	private void bark() {
		System.out.println("bark");
	}

	private void jump() {
		System.out.println("jump");
	}

	private void wake() {
		System.out.println("wake");
	}

	public void feed() {
		brain.feedEvent();
	}
	
	public void play() {
		brain.playEvent();
	}
	
	public void stroke() {
		brain.strokeEvent();
	}

}

