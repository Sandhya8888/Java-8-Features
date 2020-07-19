import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Assignment7 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		Consumer<Integer>s=i->{if(i%2==0) {
			System.out.println(i+" even");
			}
		else{
			System.out.println(i+" odd");
		};
		};
		al.forEach(q->s.accept(q));

	}

}
