package test2;

public class variables {		//inside the class and ouside the main method called as instance variable

	int r=23;//instant
	static int g=25;
	
	

	public static void main(String[] args) {
		int f=28; //local
		System.out.println(f);	//local v=28
		
		System.out.println(g);	//satic v=25
		
		variables test = new variables();
		System.out.println(test.r); 	//instant v=23

	}

}
