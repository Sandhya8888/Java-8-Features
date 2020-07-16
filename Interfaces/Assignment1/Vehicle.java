public interface Vehicle {
	public default void message() {
		System.out.println("Inside Vehicle");
	}
}
