import java.util.Optional;
public class Assignment2 {
	public static void main(String[] args) {
		String address1 = null;
		String address2 = "xyz";
		String s="India";
		Optional<String> a1=Optional.ofNullable(address1);
		Optional<String> a2=Optional.ofNullable(address2);
		System.out.println(a1.orElse(s));
		System.out.println(a2.orElse(s));
		}
	}
