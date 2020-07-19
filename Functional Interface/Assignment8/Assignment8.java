import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.IntStream;
public class Assignment8 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		@SuppressWarnings("rawtypes")
		Supplier<ArrayList> s=()->al;
		for(int i=2;i<=10;i++) {
			if(isPrime(i)) {
				al.add(i);
			}
		}
		System.out.println(s.get());
		}
	static boolean isPrime(int i) {
		return i > 1 && IntStream.range(2, i).noneMatch(j -> i%j==0);
	}
	}
