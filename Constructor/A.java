package Constructor;
class C{
	C(){
		System.out.println("C Calling");
	}
}
class B extends C{
	
	B(){
		System.out.println("B Calling");
	}
		
	
	
}
public class A extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		
		
		

	}

}
