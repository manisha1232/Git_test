package day6;

class child{
void add (int x,int y) 
{
	
	System.out.println("add from parant is " +(x+y));
	
}
}

public class parant extends child{
	void add (int x, int y) 
{
		super.add(5, 5);
}
	



	public static void main(String[] args) {
		child obj = new child();
		obj.add(5, 5);
		
		
	}
}

