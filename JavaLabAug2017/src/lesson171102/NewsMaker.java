package lesson171102;

import java.util.Scanner;

public class NewsMaker {
	
	public static void main(String[] args) throws InterruptedException {
		
		Publisher publisher = new Publisher(() -> "start");
		new Thread(publisher).start();
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine()) {
			String clazzName = scanner.nextLine();
			
			try {
				Class<?> clazz = Class.forName(clazzName);
				News news = (News) clazz.newInstance();
				publisher.publish(news);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
