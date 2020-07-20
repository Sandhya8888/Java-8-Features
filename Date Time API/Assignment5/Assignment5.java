import java.time.LocalTime;
public class Assignment5 {
	public static void main(String[] args) {
		LocalTime t=LocalTime.now();
		System.out.println("The current time is "+t);
		LocalTime t2=t.plusMinutes(25);
		System.out.println("The time after 25 minutes is "+t2);
		}
	}
