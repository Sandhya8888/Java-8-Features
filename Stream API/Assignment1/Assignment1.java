import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Assignment1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.addAll(Arrays.asList(-1,2,3,-4,-5,6));
		Stream<Integer> s=al.stream();
		ArrayList<Integer> s2=new ArrayList<Integer>();
		s2=(ArrayList<Integer>) s.filter(n-> n>0 && n%2==0).collect(Collectors.toList());
		s2.forEach(n->System.out.println(n));
		}
	}
