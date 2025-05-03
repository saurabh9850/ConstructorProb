package Constructor;
class Q{
	int a;
	int b;
	public Q(int a,int b) {
		System.out.println("Adding "+(a+b));
		
	}
	void disPlay() {
		System.out.println("First "+ a+ " Second "+b);
	}
	
	
}
class X extends Q{
	public X() {
		super(3,6);
		System.out.println("This is Final Result");
		
		
	}
	
}
class W extends X{
	public W() {
		
		System.out.println("A is called");
	}
	
	
}
public class MyClass extends X {

	public static void main(String[] args) {
		MyClass m=new MyClass();
		W a=new W();
		m.disPlay();
		
	}

}
