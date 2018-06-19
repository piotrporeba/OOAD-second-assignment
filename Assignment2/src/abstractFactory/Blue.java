package abstractFactory;



public class Blue extends AbstractColourFactory {

	@Override
	public Colour bright() {
			return new Colour("bright blue", "#66a3ff", "102,163,255");

	}

	@Override
	public Colour normal() {
		return new Colour("normal blue", "#0066ff",  "0,102,255");

	}

	@Override
	public Colour dark() {
		return new Colour("dark blue", "#003d99", "061,151");

	}


}
