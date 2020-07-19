import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
public class Assignment1{
	public static void main(String[] args) {
		Function<Employee,String> f1=(Employee er)-> {return er.location;};
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee(101,"John",5000,"Mumbai");
		Employee e2=new Employee(102,"Roy",20000,"Hyd");
		Employee e3=new Employee(103,"Philip",80000,"Chennai");
		Employee e4=new Employee(104,"Tesla",60000,"Pune");
		Employee e5=new Employee(105,"Marks",40000,"Pune");
		al.addAll(Arrays.asList(e1,e2,e3,e4,e5));
		ArrayList<String> a2=new ArrayList<String>();
		al.forEach(i->a2.add(f1.apply(i)));
		System.out.println(a2);
		}
}
