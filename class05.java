
public class j10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();

	}

}

interface Math {
	
	abstract void show();
	abstract void add(int a, int b);
	abstract void sub(int a, int b);
	abstract void mul(int a, int b);
	abstract void div(int a, int b);
}
class Compute implements Math{
	int ans;
	public void mul(int a, int b) {
		ans = a * b;
	}
	public  void show() {
		System.out.println(ans);
	}
}