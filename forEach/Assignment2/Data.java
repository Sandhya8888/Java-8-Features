public class Data {
	private int id;
	private String name;
	private String address;
	private int salary;
	public Data(int id1,String name1,String address1,int salary1) {
		id=id1;
		name=name1;
		address=address1;
		salary=salary1;
		}
	@Override
	public String toString() {
		return ""+id+"\t"+name+"\t"+address+"\t"+salary+"\t";
	}
	}
