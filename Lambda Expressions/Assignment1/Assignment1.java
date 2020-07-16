import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
public class Assignment1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		Random rand=new Random();
		for(int i=0;i<=24;i++) {
			int r=rand.nextInt(1000);
			al.add(r);
		}
		System.out.println("The array list is \n"+al);
		al.forEach((i)->{if(isPrime(i)){ al2.add(i); }});
		System.out.println("The prime numbers in the array list is \n"+al2);
		}
	static boolean isPrime(int i) {
		return i > 1 && IntStream.range(2, i).noneMatch(j -> i%j==0);
	}
	}
