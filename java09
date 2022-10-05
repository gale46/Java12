class Caaa{
    private int num;
    public Caaa(int n){
        num = n;
    }
    public int get(){
        return num;
    }
    public void display(){
        System.out.println("printed from Caaa class");
    }
    public static void move() {
    }
}
class Cbbb extends Caaa{
    
    public Cbbb(int n) {
        super(n);
        
    }

    protected void show(){
        System.out.println("num="+get());
    }

    @Override
    public void display(){
        System.out.println("printed from Cbbb class");
    }
    
}
public class java09_1 {

	public static void main(String[] args) {
        Caaa aa = new Caaa(0);
		Cbbb bb = new Cbbb(1);
        act(aa);
        act(bb);

		bb.display();
	}
    private static void act(Cbbb bb){
        Cbbb.move();
    }


}
