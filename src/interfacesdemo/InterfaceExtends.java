package interfacesdemo;


interface Parent1{
	//variables by default public static
	
	int length=20;
	int width=10;
	int hight=5;
	
	
	
	//Only abstract methods(by default public)
	void volume();
	//Static methods
	
}

interface Parent2 extends Parent1{
	
	
	static void volume1() {
		System.out.println(length*hight*width);
	}
	//Non Static methods
	default void volume2() {
		System.out.println(length*hight*width);
	}
}
public class InterfaceExtends implements Parent2{
	
	
	public void volume() {
		System.out.println(length*hight*width);
	}
	
	public void print() {
		System.out.println("Hello...");
	}
	

	public static void main(String[] args) {
		
		InterfaceExtends InterfaceExtends=new InterfaceExtends();
		InterfaceExtends.volume();
		InterfaceExtends.volume2();
		InterfaceExtends.print();
		Parent2.volume1();
		
		Parent2 parent2=new InterfaceExtends();
		parent2.volume();
		parent2.volume2();
		Parent2.volume1();
		//parent2.print();
		
	}

}
