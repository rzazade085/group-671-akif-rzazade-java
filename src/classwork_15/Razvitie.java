package classwork_15;

public class Razvitie {
	String flavor;
	double price;
	boolean hasTopping;
	int rating;

	Razvitie(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
		hasTopping = false;
		rating = 3;
	}

	void addTopping() {
		hasTopping = true;
		price += 0.5;
	}

	void eat() {
		System.out.println(flavor + " mmm. vkusnatina");
		for (int i = 0; i < rating; i++) {
			System.out.print("★");
		}
		System.out.println();
	}

	void improveRating() {
		if (rating < 5) {
			rating++;
		}
	}
}
