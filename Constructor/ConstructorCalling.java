package Constructor;

public class ConstructorCalling {
	int id;
	String s;
  public ConstructorCalling(String s,int id) {
	  this.id=id;
	  this.s=s;
	  
	
}
  public void disPlay() {
	  System.out.println("Name: "+s+" id: "+id);
	  
  }
	public static void main(String[] args) {
		ConstructorCalling c=new ConstructorCalling("Saurabh",1);
		c.disPlay();
		
		
      
	}

}
