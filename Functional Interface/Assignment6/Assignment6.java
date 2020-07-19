import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
public class Assignment6 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(Arrays.asList("address","edge","part","read","record","some","pure","smile","sell","result"));
		Consumer<String>s=i->al.set(al.indexOf(i),stringRev(i));
		al.forEach(q->s.accept(q));
		System.out.println(al);
		}
	private static String stringRev(String i) {
		String r="";
		for(int p=i.length()-1;p>=0;p--) {
			r=r+i.charAt(p);			
		}
		return r;
		}
	}
