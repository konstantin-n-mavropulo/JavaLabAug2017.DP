package lesson171108;

public class X {
	
	private Object state;

	X(X x ) {
		this.state = x.state;
	}
	
	public static X copy(X x) {
		return new X(x);
	}
	
	public X copy() {
		return new X(this);
	}

}
