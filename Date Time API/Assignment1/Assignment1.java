import java.time.LocalDate;
public class Assignment1 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("Todays date is "+today);
		LocalDate td=today.plusDays(10);
		System.out.println("Date afer 10 days is "+td);
		}
	}
