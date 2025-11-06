package outer;
import pack.Calc;
public class New_class extends Calc { //extends for static protected

	public static void main(String[] args) {
		Calc.add(23,34); //protected static
		New_class ob = new New_class();
		ob.sub(4, 9); //protected
		Calc c = new Calc();
		System.out.println(c.mul(2,5)); //default
	}

}
