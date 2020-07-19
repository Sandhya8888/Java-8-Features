import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Assignment3 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> a2=new ArrayList<String>();
		al.addAll(Arrays.asList("address","edge","part","read","madam","some","pure","prp","sell","result"));
		Predicate<String> s=i->isPalindrome(i)==true;
		a2=(ArrayList<String>)al.stream().filter(s).collect(Collectors.toList());
		System.out.println(a2);
	}
	private static boolean isPalindrome(String i) {
		String r="";
		for(int p=i.length()-1;p>=0;p--) {
			r=r+i.charAt(p);
			}
		if(i.equals(r)) {
			return true;
		}
		else {
			return false;
		}
		}
	}