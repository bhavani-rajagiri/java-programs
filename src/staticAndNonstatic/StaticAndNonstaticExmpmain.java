package staticAndNonstatic;

public class StaticAndNonstaticExmpmain {

	public static void main(String[] args) {
		
		System.out.println(StaticAndNonstaticExmp.name);
		//System.out.println(StaticAndNonstaticExmp.address); cant acccess non static variable
		
		StaticAndNonstaticExmp.print();
		StaticAndNonstaticExmp ss=new StaticAndNonstaticExmp();
		System.out.println(ss.address);
		ss.printmsg();
		ss.printAll();
	}

}
