
public class class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14, 5);
		cmp.show();
		cmp.fac(5);
		cmp.show();

	}

}

interface Math {
	void show();

	abstract void add(int a, int b);

	abstract void sub(int a, int b);

	abstract void mul(int a, int b);

	abstract void div(int a, int b);

}

interface AdvancedMath {
	public void mod(int a, int b);

	public void fac(int a);

	public void pow(int a, int b);
}

class Compute implements Math, AdvancedMath {
	int ans;

	public void mul(int a, int b) {
		
		ans = a * b;
	}

	public void mod(int a, int b) {
		
		ans = a % b;
	}
	
	public void fac(int a) {
		ans = 1;
		for (int i = 1; i <= a; i++) {
			ans *= i;
		}
	}

	public void show() {
		System.out.println(ans);
	}
}