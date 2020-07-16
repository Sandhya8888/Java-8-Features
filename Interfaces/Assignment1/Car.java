public class Car implements Vehicle,FourWheeler {
	public static void main(String[] args) {
		Vehicle v=new Car();
		v.message();
		}
	@Override
	public void message() {
		Vehicle.super.message();
	}
	}