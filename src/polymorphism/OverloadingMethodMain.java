package polymorphism;

public class OverloadingMethodMain {

	public static void main(String[] args) {
		OverloadingMethodDemmo demo1=new OverloadingMethodDemmo();
		demo1.x=10;
		demo1.y=20;
		demo1.add();
		
		OverloadingMethodDemmo demo2=new OverloadingMethodDemmo();
		demo2.add(200, 300);
		
		OverloadingMethodDemmo demo3=new OverloadingMethodDemmo();
		demo3.add(34, 19.334);
		
		OverloadingMethodDemmo demo4=new OverloadingMethodDemmo();
		System.out.println(demo4.add(34.9, 19.334, 23.89));
	}

}
