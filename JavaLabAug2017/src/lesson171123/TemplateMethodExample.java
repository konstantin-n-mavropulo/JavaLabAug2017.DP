package lesson171123;

import lesson171123.TemplateMethodExample.Data;

public class TemplateMethodExample {
	
	public interface Data {
		
		void change();

	}

	public static void main(String[] args) {
		
		A a  = new A();
		
		process(a);
		process(new B());
		
	}

	private static void process(Data data) {
		data.change();
	}

}


class A implements Data {
	
	int x, y, z;
	
	final public void change() {
		part1();
		part2();
		part3();
	}

	final void part1() {
		x++;
	}

	void part2() {
		y++;
	}
	
	final void part3() {
		z++;
	}


}

class B extends A {
	void part2() {
		y--;
	}
}
