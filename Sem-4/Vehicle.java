public class Vehicle {
	private String name = "";
	private String color = "";
	private String model = "";
	private String company = "";
	private String engine = "800cc";
	public static int count = 0; // increments every time an object is created

	public Vehicle() { // default constructor
		count++;
	}

	public Vehicle(String name, String color, String model, String company) {
		this.name = name;
		this.color = color;
		this.model = model;
		this.company = company;
		count++;
	}

	public Vehicle(String name, String color, String model, String company, String engine) {
		this.name = name;
		this.color = color;
		this.model = model;
		this.company = company;
		this.engine = engine;
		count++;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public String getModel() {
		return this.model;
	}

	public String getCompany() {
		return this.company;
	}

	private String getEngine() {
		return this.engine;
	}

	public String getTopSpeed() {
		String a = getEngine();
		if (a == "800cc") {
			return "100 km/h";
		} else {
			return "120 km/h";
		}
	}

	public static String getVehicle() {
		return "you have given the name and color of the vehicle";
	}

	public String getInfo() { // to illustrate polymorphism and method overriding
		return "this is a vehicle";
	}
}