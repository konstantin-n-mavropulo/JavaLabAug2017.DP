package lesson171122;

abstract public class Command {
	
	abstract void execute(Target target);
	
	public static class Save extends Command {

		@Override
		void execute(Target target) {
			target.handle(this);
		}
		
	}

	public static class Load extends Command {
		
		@Override
		void execute(Target target) {
			target.handle(this);
		}
		
	}
	
}
