
public class Main {
	public static void main(String[] args) {
		Vehicle Vehicle1 = new Vehicle();
		System.out.println(Vehicle1.getColor());
		Vehicle1.setName("amaze");
		System.out.println(Vehicle1.getName());
		System.out.println(Vehicle1.count);

		Vehicle Vehicle2 = new Vehicle("civic", "black", "2012", "honda");
		System.out.println(Vehicle2.getColor());
		Vehicle2.setColor("white");
		System.out.println(Vehicle2.count);
		System.out.println(Vehicle2.getColor());
		System.out.println(Vehicle2.getCompany());

		Vehicle Vehicle3 = new Vehicle("seltos", "red", "2020", "kia", "1200cc");
		System.out.println(Vehicle3.getTopSpeed());
		System.out.println(Vehicle3.count);

		// calling static functions does not requires to create an Object
		System.out.println(Vehicle.getVehicle());

		Car Car1 = new Car("sonet", "white", "2019", "kia", "800cc", true, false);
		System.out.println(Car1.getPowerSteering());
		System.out.println(Car1.getColor());

		System.out.println(Vehicle1.getInfo());// polymorphism

		Vehicle Vehicle4 = new Car("sonet", "white", "2019", "kia", "800cc", true, false);
		System.out.println(Vehicle4.getInfo());// polymorphism

		Vehicle Vehicle5 = new bike("pulsar", "green", "2010", "yamaha", "600cc", true);
		System.out.println(Vehicle5.getInfo());// polymorphism
	}
}
