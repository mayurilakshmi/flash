
public class Constructor {
	int rollno;
	String name;
	Constructor( int rollno, String name){
		this.name=name;
		this.rollno=rollno;
		
	}
	public void m1(int i) {
		System.out.println("kl");
	}

	public static void main(String[] args) {
	Constructor c=new Constructor(6, "mayu");
	Constructor c1=new Constructor(7, "mayuri");
	System.out.println(c.name);
	c.m1(10);
	}

}
