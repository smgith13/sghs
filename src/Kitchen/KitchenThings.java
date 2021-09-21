package Kitchen;

public class KitchenThings {
	String Utensils = null;
	String masala = null;
	String fridge = null;
	String stovetop = null;
	String oven = null;
	String mixy = null;
	

	static void takeUtensils() {
		System.out.println("Vessel taken");
	}

	static void takeMasala() {
		System.out.println("Masala Taken");
	}

	static void openFridge(String needed) {
		if (needed.equalsIgnoreCase("milk")) {
			System.out.println("Milk Taken");
		} else if (needed.equalsIgnoreCase("egg"))
			System.out.println("egg Taken");
		else
			System.out.println("Nothing Chosen");
	}

	static void fire() {
		System.out.println("Fired");
	}

}
