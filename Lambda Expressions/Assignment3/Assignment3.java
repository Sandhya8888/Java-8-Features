import java.util.ArrayList;
import java.util.Arrays;
public class Assignment3 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(Arrays.asList("address","edges","part","read","record","some","pure","smile","sell","result"));
		al.forEach((i)->{if(i.length()%2!=0){ System.out.println(i); }});
		}
	}
