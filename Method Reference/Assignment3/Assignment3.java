import java.util.stream.IntStream;
public class Assignment3 {
	public static void main(String[] args) {
		Interface3 i=Assignment3::new;
		i.prime2(5);
		}
	public Assignment3(int n) {
		boolean a=n > 1 && IntStream.range(2, n).noneMatch(j -> n%j==0);
		if(a){
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
		}
	}
	}