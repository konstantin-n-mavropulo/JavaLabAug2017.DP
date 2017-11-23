package lesson171108;

public class StringBuilderRaceCondition {
	
	public static void main(String[] args) throws InterruptedException {
		
		final StringBuilder builder = new StringBuilder();
		
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				builder.append('a');
				pause();
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				builder.append('b');
				pause();
			}
		});
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		String string = builder.toString();
		System.out.println(string);
		System.out.println(string.length());
		
	}

	private static void pause() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
