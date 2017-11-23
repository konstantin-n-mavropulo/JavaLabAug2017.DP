package lesson171122;

import lesson171122.Command.Load;
import lesson171122.Command.Save;

public class CommandExample {
	
	static Target handler = new MyTarget(); 
	
	public static void main(String[] args) {
		
		process(new Command.Load());
		process(new Command.Save());
		
	}

	private static void process(Command cmd) {
		cmd.execute(handler);
	}

}

class MyTarget implements Target {

	@Override
	public void handle(Save cmd) {
		System.out.println(cmd);
	}

	@Override
	public void handle(Load cmd) {
		System.out.println(cmd);
	}
	
}
