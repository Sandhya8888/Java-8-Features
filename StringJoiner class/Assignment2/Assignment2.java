import java.util.StringJoiner;

public class Assignment2 {

	public static void main(String[] args) {
		StringJoiner s1=new StringJoiner("-");
		StringJoiner s2=new StringJoiner("-");
		s1.add("Scott");
		s1.add("Eugene");
		s2.add("James");
		s2.add("Thomas");
		s2.add("Kevin");
		StringJoiner m1=s1.merge(s2);
		System.out.println(m1);
		StringJoiner m2=s2.merge(s1);
		System.out.println(m2);

	}

}
