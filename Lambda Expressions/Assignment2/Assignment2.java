import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Assignment2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(Arrays.asList("address","edge","part","read","record","some","pure","smile","sell","result"));
		System.out.println(al);
		Collections.reverse(al);
		al.forEach(i->System.out.println(i));
		}
	}
