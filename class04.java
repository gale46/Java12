
public class j10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
		//Math.mth = new Math();
		//abstract是抽象的，所以abstract不能建立物件

	}

}

abstract class Math {
	protected static int ans;
	//可以，但是在其他class中的show()也需要加上static
	static void show() {
		
	};
	public abstract void add(int a, int b);

	public abstract void sub(int a, int b);

	public abstract void mul(int a, int b);

	public abstract void div(int a, int b);
}
class Compute extends Math{
	public void mul(int a, int b) {
		ans = a * b;
	}
	public static void show() {
		System.out.println(ans);
	}
	
}
