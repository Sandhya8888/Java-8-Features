import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Assignment5 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		al.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,16));
		Predicate<Integer> s=i->isPerfectSquare(i)==true;
		a2=(ArrayList<Integer>)al.stream().filter(s).collect(Collectors.toList());
		System.out.println(a2);
		}
	private static boolean isPerfectSquare(Integer i) {
		int c=(int) Math.sqrt(i);
		if(Math.pow(c, 2)==i) {
			return true;
		}
		else {
			return false;
		}
		}
	}
