package DAY3.HomeWork;
interface Printable {
}

class Report implements Printable {
	void display() {
		System.out.println("Displaying report");
	}
}

class Draft {
	void display() {
		System.out.println("Displaying draft");
	}
}

public class MarkerInterface {
	static void printDocument(Object document) {
		if (document instanceof Printable) {
			System.out.println("Document is approved for printing");
		} else {
			System.out.println("Document cannot be printed");
		}
	}

	public static void main(String[] args) {
		Report report = new Report();
		Draft draft = new Draft();

		report.display();
		printDocument(report);
		draft.display();
		printDocument(draft);
	}
}