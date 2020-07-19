import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
public class Assignment2 implements Sum{
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,9));
		Function<Sum,Integer> f1=(Sum a)-> {return a.add(al);};
		Sum s=new Assignment2();
		System.out.println(f1.apply(s));
		}
	@Override
	public int add(ArrayList<Integer> l) {
		int sum=0;
		for(int i:l) {
			sum=sum+i;
		}
		return sum;
	}
	}
