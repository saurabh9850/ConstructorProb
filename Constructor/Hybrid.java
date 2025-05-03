package Constructor;
class Play{
	public Play() {
		// TODO Auto-generated constructor stub
		System.out.println("Play Games");
	}
	
	
}
class Cricket extends Play{
	public Cricket() {
		// TODO Auto-generated constructor stub
		System.out.println("Play Cricket");
	}
	
}
class FootBall extends Play{
	
	public FootBall() {
		// TODO Auto-generated constructor stub
		System.out.println("Play FootBall");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cricket();	
		new FootBall();
		
		
		
		

	}

}
