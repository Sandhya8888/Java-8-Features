import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Employeee {
	private int id;
	private String name;
	private int salary;
	public Employeee(int id,String name,int salary) {
		setId(id);
		setName(name);
		setSalary(salary);
		getId();
		getName();
		getSalary();
		}
	public static void main(String[] args) {
		ArrayList<Employeee> al=new ArrayList<Employeee>();
		ArrayList<Employeee> a2=new ArrayList<Employeee>();
		Employeee e1=new Employeee(101,"John",5000);
		Employeee e2=new Employeee(102,"Roy",8000);
		Employeee e3=new Employeee(103,"Philip",80000);
		Employeee e4=new Employeee(104,"Tesla",60000);
		Employeee e5=new Employeee(105,"Marks",40000);
		al.addAll(Arrays.asList(e1,e2,e3,e4,e5));
		Predicate<Employeee> s=i->i.salary<10000;
		a2=(ArrayList<Employeee>)al.stream().filter(s).collect(Collectors.toList());
		System.out.println(a2);
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return name;
	}
	}
