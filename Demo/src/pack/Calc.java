package pack;

public class Calc {
	private static void add(int x, int y)
	{
		System.out.println("The sum of" +x +" and " +y +"is" +(x+y));
	}
	protected void sub(int x, int y)
	{
		System.out.println("The difference of " +x +" and " +y +"is" +(x-y));
	}
 public  int mul(int x, int y)
	{
		return(x*y);
	}
	public static void main(String[] args) {
		
      Calc.add(34, 67);
      Calc c = new Calc();
      c.sub(10, 3);
      System.out.println("the product is" +c.mul(2,4));
	}

}
