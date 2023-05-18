
public class Candy extends DessertItem {

	double candyWeight;
	double pricePerPound;

	public Candy() {
		super();
		candyWeight = 0;
		pricePerPound = 0.0;
	}

	public Candy(String n, double w, double p) {
		super(n);
		candyWeight = w;
		pricePerPound = p;

	}

	public double getCandyWeight() {
		return candyWeight;
	}

	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setCandyWeight(double w) {
		candyWeight = w;
	}

	public void setPricePerPound(double p) {
		pricePerPound = p;
	}

}
