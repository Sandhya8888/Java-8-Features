import java.util.ArrayList;
import java.util.Arrays;
public class Assignment2 {
	public static void main(String[] args) {
	ArrayList<Data> Employee=new ArrayList<Data>();
	Data d1=new Data(101,"John","Mumbai",5000);
	Data d2=new Data(102,"Roy","Hyd",20000);
	Data d3=new Data(103,"Philip","Chennai",80000);
	Data d4=new Data(104,"Tesla","Noida",60000);
	Data d5=new Data(105,"Marks","goa",40000);
	Employee.addAll(Arrays.asList(d1,d2,d3,d4,d5));
	for(Data a:Employee) {
		System.out.println(a);
	}
	}
	}
