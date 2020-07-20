import java.time.LocalTime;
public class Assignment6 {
	public static void main(String[] args) {
		LocalTime t=LocalTime.now();
		System.out.println("The current time is "+t);
		LocalTime t2=t.minusHours(5).minusMinutes(30);
		System.out.println(t2);
		}
	}
