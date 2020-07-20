import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
public class Assignment1 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.addAll(Arrays.asList("James","Thomas","Kevin","Scott","Eugene"));
		StringJoiner s=new StringJoiner(",","{","}");
		a.forEach(i->s.add(i));
		System.out.println(s);
		}
	}
