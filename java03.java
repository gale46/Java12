class Caaa {
	public int num1;
	public int num2;

	Caaa() {
		num1 = 1;
		num2 = 1;

	}

	void Caaa(int a, int b) {
		num1 = a;
		num2 = b;

	}

	public void show() {
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
	}
}

class Cbbb extends Caaa {
	public void set_num(int a, int b) {
		num1 = a;
		num2 = b;
	}

	Cbbb(int a, int b) {

		super.Caaa(a, b);

	}

	public void show() {
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
	}

}

public class java03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb(1, 2);
		bb.set_num(5, 10);
		bb.show();
		Caaa aa = new Caaa();
		aa.show();

	}

}
