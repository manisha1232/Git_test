package day4;

public class Executor {

	public static void main(String[] args) {
		
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault=11;
		b1.methodDefault();
		
		b1.varProtected=22;
		b1.methodProtected();
		
		b1.varPublic=33;
		b1.methodPublic();
		
		System.out.println(b1 instance of Base); // returns true
		
	}

}
