import java.time.LocalDate;
public class Assignment4 {
	public static void main(String[] args) {
		LocalDate l=LocalDate.now();
		if(l.isLeapYear()) {
			System.out.println("The current year "+l.getYear()+" is leap year");
		}
		else {
			System.out.println("The current year "+l.getYear()+" is not leap year");
		}
		}
	}
