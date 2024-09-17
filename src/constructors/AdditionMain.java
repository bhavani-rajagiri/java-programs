package constructors;

public class AdditionMain {

	public static void main(String[] args) {
		
		Addition addition1=new Addition();
		int sum1 = addition1.sum();
		System.out.println(sum1);
		
		Addition addition2= new Addition(100,200);
		int sum2 = addition2.sum();
		System.out.println(sum2);
		
		/*Addition addition1=new Addition();
		 addition1.sum();
		
		
		Addition addition2= new Addition(100,200);
		 addition2.sum();*/
		
	}

}
