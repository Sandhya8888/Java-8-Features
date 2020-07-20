import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Assignment3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter date in YYYY-MM-DD format");
		String joined=s.next();
		s.close();
		LocalDate j=LocalDate.parse(joined);
		LocalDate l=LocalDate.now();
		Period d = Period.between(j, l);
		System.out.println(d.getYears()+" years "+d.getMonths()+" months "+d.getDays()+" days");
		}
	}
