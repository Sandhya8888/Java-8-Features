import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment3 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student (101,"John",65);
		Student s2=new Student (102,"Roy",55);
		Student s3=new Student (103,"Philip",45);
		Student s4=new Student (104,"Tesla",30);
		Student s5=new Student (105,"Marks",89);
		al.addAll(Arrays.asList(s1,s2,s3,s4,s5));
		ArrayList<Student > l2=new ArrayList<Student >();
		Stream<Student > s=al.stream();
		l2=(ArrayList<Student >) s.filter(n->n.mark>=50).collect(Collectors.toList());
		System.out.println("Number of students cleared are "+l2.size());
		System.out.println("details of students who cleared are:");
		l2.forEach(n->System.out.println(n));
		}

}
