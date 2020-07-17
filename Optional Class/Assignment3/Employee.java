import java.util.Optional;
public class Employee {
	int id;
	String name;
	
	 public Employee(int id,String name) {
		 this.id=id;
		 this.name=name;
	 }
	public static void main(String[] args) throws Throwable {
		Optional<Employee> a=Optional.empty();
		try {
			System.out.println(a.orElseThrow(() -> new InvalidEmployeeException()));
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		
		}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	}
