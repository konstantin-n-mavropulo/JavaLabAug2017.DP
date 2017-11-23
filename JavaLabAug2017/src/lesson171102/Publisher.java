package lesson171102;

public class Publisher implements Runnable {
	
	private News news;
	
	public Publisher(News news) {
		this.news = news;
	}

	void publish(News news) {
		this.news = news;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(news.get());
		}
	}

}
