public class Assignment2 {
	public static void main(String[] args) {
		Interface2 i2=Assignment2::digitCount;
		int p=i2.digitCount2(12310);
		System.out.println(p);
		}
	public static int digitCount(int n) {
		int count=0;
		if(n==0) {
			count++;
		}
		while(n>=1) {
			count++;
			n=n/10;
		}
		return count;
	}
}
