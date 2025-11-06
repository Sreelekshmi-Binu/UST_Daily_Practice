package outer;

public class Over_loading {
	void add(int a, int b)
	{
		System.out.println("sum");
	}
int add(int a, int b, int c)
{
return a+b+c;	
}
public static void main(String[] args) {
	{
		Over_loading ov = new Over_loading();
		ov.add(2, 3);
		
	}
}
}
