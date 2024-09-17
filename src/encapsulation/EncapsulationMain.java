package encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		Encapsulation en=new Encapsulation();
		en.setX(10);
		en.setY(20);
		en.setName("Bhavani");
		en.add();
		
		System.out.println(en.getX());
		System.out.println(en.getY());
		System.out.println(en.getName());
		
		}

}
