package lesson171122;

public interface Target {

	void handle(Command.Save cmd);

	void handle(Command.Load load);

}
