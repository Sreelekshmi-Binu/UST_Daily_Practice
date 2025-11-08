class A 
{
	
}
public class B extends A {
	public static void main(String[] args) {
		A a = new B(); //a instance of B return true;
		A a1 = new A(); //a1 instanceof A true return true;
		B a2 = new B(); // a2 instance of B return true;
		B b1 = new A(); //error compiles but shows class cast exception.
	}

}
