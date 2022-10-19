
public class j10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();

	}

}

abstract class Math {
	protected int ans;
	protected void show() {};

	public abstract void add(int a, int b);

	public abstract void sub(int a, int b);

	public abstract void mul(int a, int b);

	public abstract void div(int a, int b);
}
class Compute extends Math{
	public void mul(int a, int b) {
		ans = a * b;
	}
	public void show() {
		System.out.println(ans);
	}
	
}
