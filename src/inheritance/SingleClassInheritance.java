package inheritance;


class Parent1
{
	
	/*int a =10;
	int b = 20;*/
	int m,n;
	
	void add(int x, int y) 
	{
		System.out.println(x+y);
	}
}

class Child extends Parent1{
	void multiply(int a, int b)
	{
		System.out.println(a*b);
	}
}

public class SingleClassInheritance {
		public static void main(String[] args) {
		Child child = new Child();
		child.add(10,20);
		child.multiply(10,20);

	}

}
