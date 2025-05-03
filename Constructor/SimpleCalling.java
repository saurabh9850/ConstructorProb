package Constructor;
class Y{
	public Y() {
		
		System.out.println("Withought Param");
		
	}
	public Y(int a){
		System.out.println("Y calling With Param");
	}
}
class Z extends Y{
	public Z() { super(5);
		
		System.out.println("Z calls");
	}
}
public class SimpleCalling extends Z{
 
	public static void main(String[] args) {
		SimpleCalling s=new SimpleCalling();
		
		
		 
			
			
		}

	}


