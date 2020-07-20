import java.util.Arrays;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String p=s.next();
		s.close();
		char[] a=p.toCharArray();
		Arrays.parallelSort(a);
		System.out.println(a);
		}
	}
