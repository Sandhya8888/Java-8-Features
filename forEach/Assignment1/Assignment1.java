import java.util.ArrayList;
import java.util.Arrays;
public class Assignment1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(Arrays.asList("Sunday","Tuesday","Wednesday","Thursday","Friday","Saturday"));
		al.forEach(System.out::println);
		}
	}