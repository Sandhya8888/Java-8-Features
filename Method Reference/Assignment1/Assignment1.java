
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 a=new Assignment1();
		Interface1 i1=a::factorial;
		int r=i1.factorial(5);
		System.out.println(r);
	}
	public int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
