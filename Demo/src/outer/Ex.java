package outer;
public class Ex {
	int x=22;
	void disp(int x)
	{
		//this.x = x assign same value to x.....!
		System.out.println("local varibale x is " +this.x);//prints the current instance of x....
	}
	public static void main(String[] args) {
		Ex obj = new Ex();
		obj.disp(77);
		System.out.println("instance variable x is " +obj.x);
	}

}
