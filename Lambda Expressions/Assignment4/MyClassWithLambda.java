public class MyClassWithLambda implements WordCount {
	public static void main(String args[]) {
		String s="Hello google";
		WordCount w=(String i)->{
			String[] words = i.split("\\s+");
		    return words.length;
			};
			System.out.println(w.count(s));
			}
	@Override
	public int count(String str) {
		// TODO Auto-generated method stub
		return 0;
	}
}
