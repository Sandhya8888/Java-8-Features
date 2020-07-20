import java.util.Arrays;
public class Assignment1 {public static void main(String[] args) {
		int[] num= {10,5,7,11,8,6,4,22,88,1};
		Arrays.parallelSort(num);
		System.out.println(num[0]+num[num.length-1]);
		}
}
