class CTriangle{
	protected int base;
	protected int height;
	protected void show() {
		System.out.println("base="+base+", height="+height);
		
	}
	
}
class CData extends CTriangle{
	
	double area;
	public CData(int base, int height) {
		this.base = base;
		this.height = height;
		System.out.println("base="+base+", height="+height);
	}
	void area() {
		area = base*height/2;
		System.out.println("area="+area);
	}
	protected void show() {
		System.out.println("base="+base+", height="+height);
		System.out.println("area="+area);
	}
	
}

public class java06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CData obj = new CData(3, 8);
		obj.area();
		
		
		

	}

}
