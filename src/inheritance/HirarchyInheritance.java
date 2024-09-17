package inheritance;
class parent3{
	
	void showdata() {
		System.out.println("This is parent2 class...");
	}
}

class ChildClass1 extends parent3{
	void showdata1() {
		System.out.println("This is ChildClass1 extends parent class...");
	}
}
class ChildClass2 extends parent3{
	void showdata2() {
		System.out.println("This is ChildClass2 extends parent class..");
	}
}
class ChildClass3 extends parent3{
	void showdata3() {
		System.out.println("This is ChildClass3 extends parent class...");
	}
}

public class HirarchyInheritance {

	public static void main(String[] args) {
		ChildClass1 ChildClass1=new ChildClass1();
		ChildClass1.showdata();
		ChildClass1.showdata1();
		
		ChildClass2 childClass2=new ChildClass2();
		childClass2.showdata();
		childClass2.showdata2();
		
		ChildClass3 childClass3=new ChildClass3();
		childClass3.showdata();
		childClass3.showdata3();

	}

}
