import java.util.Arrays;
public class Assignment3 {
	public static void main(String[] args) {
		int[] num= {10,5,7,11,8,6,4,22,88,1};
		Arrays.parallelSort(num, 0,5);
		for(int i=0;i<=num.length-1;i++) {
			System.out.println(num[i]);
		}
		}
	}
