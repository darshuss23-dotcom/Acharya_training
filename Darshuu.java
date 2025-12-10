public class Darshuu {
	int id;
	String firstName;
	String lastName;
	double fees;

	public Darshuu(int id, String firstName, String lastName, double fees) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fees = fees;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public double getFees() {
		return fees;
	}

	// Main method to test the class
	public static void main(String[] args) {
		// Create three Student objects
		Darshuu student1 = new Darshuu(1, "John", "Doe", 1000.0);
		Darshuu student2 = new Darshuu(2, "Jane", "Smith", 1200.0);
		Darshuu student3 = new Darshuu(3, "Bob", "Johnson", 1500.0);

		// Print student details
		System.out.println("Student 1:");
		System.out.println("ID: " + student1.id);
		System.out.println("Name: " + student1.getName());
		System.out.println("Fees: " + student1.getFees());

		System.out.println("\nStudent 2:");
		System.out.println("ID: " + student2.id);
		System.out.println("Name: " + student2.getName());
		System.out.println("Fees: " + student2.getFees());

		System.out.println("\nStudent 3:");
		System.out.println("ID: " + student3.id);
		System.out.println("Name: " + student3.getName());
		System.out.println("Fees: " + student3.getFees());
	}
}