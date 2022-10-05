
class Caaa{
    private int num;
    public Caaa(int n){
        num = n;
    }
    public int get(){
        return num;
    }
}
class Cbbb extends Caaa{
    
    public Cbbb(int n) {
        super(n);
        
    }

    protected void show(){
        System.out.println("num="+get());
    }
    
}
public class java09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cbbb bb = new Cbbb(2);
		bb.show();
		
		
		

	}

}