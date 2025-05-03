package Constructor;
class NoParam{
	public NoParam() {
		System.out.println("NoParam called");
	}
	
}
class Param extends NoParam{
	
	public Param(int a) {
		System.out.println("Param Called");
		System.out.println(a);
	}
	
}
public class ParamExample extends Param{
	public ParamExample(int a) {
		super(4);
		System.out.println(a);
	}

	public static void main(String []args)
	{
		ParamExample p= new ParamExample(3);
		
		
	}

}
