
public class MyClassWithLambda implements WordCount {
	@Override
	public int count(String str) {
		String[] words = str.split("\\s+");
	    return words.length;
	}
	public static void main(String args[]) {
		WordCount w=new MyClassWithLambda();
		System.out.println(w.count("Hello Google"));
	}
}
