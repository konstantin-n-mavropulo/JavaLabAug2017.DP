
public class Switch {
	
	Switchable switchable;
	
	public Switch(Switchable switchable) {
		super();
		this.switchable = switchable;
	}

	public void setLamp(Switchable switchable) {
		this.switchable = switchable;
	}
	
	public void on() {
		switchable.on();
	}

	public void off() {
		switchable.off();
	}
	
}
