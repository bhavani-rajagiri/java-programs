package encapsulation;

public class Encapsulation {
	
	//Def - wrapping a variables & methods in as a single unit
	//Variables of class are not accessed directly can be accessed with help of methods
	//All variables in class are private, and those private variables are accessed with set and get methods

	//variables
	private int x;
	private int y;
	private String name;
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    void add() {
		
		System.out.println(x+y);
	}
	
	
}

	