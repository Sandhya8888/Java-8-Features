import java.util.Optional;
public class Assignment1 {
	public static void main(String[] args) {
		String names[]=new String[5];
		Optional<String> a=Optional.ofNullable(names[0]);
		if(a.isPresent()) {
			System.out.print(names[0].length());
		}
		else {
			
			System.out.println("No value present");
		}
		}
	}