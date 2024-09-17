package inheritance;

class parent2{
	
	void dispaly1() {
		System.out.println("This is parent2 class...");
	}
}
class Child1 extends parent2{
	void dispaly2() {
		System.out.println("This is child1 class...");
	}
	
	
}
class Child2 extends Child1{
	void dispaly3() {
		System.out.println("This is child2 class...");
	}
}
class Child3 extends Child2{
	void dispaly4() {
		System.out.println("This is child3 class...");
	}
}

class MultilevelInheritance {

	public static void main(String[] args) {
		
		Child3 child3=new Child3();
		child3.dispaly1();
		child3.dispaly2();
		child3.dispaly3();
		child3.dispaly4();
		
		Child1 child1=new Child1();
		child1.dispaly1();
		child1.dispaly2();
	}

}
