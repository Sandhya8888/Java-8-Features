public class Assignment2 {
	static int t1,t2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=(s1,s2,s3)->(s1+s2+s3);
		Test t2=(s1,s2,s3)->(s1*s2*s3);
		int sum=t1.myFunction(1, 5, 3);
		int mul=t2.myFunction(1, 5, 3);
		System.out.println("Sum is "+sum);
		System.out.println("Multiplication is "+mul);
		}
	}