package outer;

public class Cat {
	
@Override
	public String toString() {
		return "Cat object..."; //to give value to print when object is called..
	}

public static void main(String[] args) {
	Cat c = new Cat();
	System.out.println(c);
}
}
