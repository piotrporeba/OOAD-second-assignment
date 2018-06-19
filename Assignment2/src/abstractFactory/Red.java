package abstractFactory;

public class Red extends AbstractColourFactory{

	@Override
	public Colour bright() {
			return new Colour("bright red", "#ff8566", "255,133,102");

	}

	@Override
	public Colour normal() {
		return new Colour("normal red", "#ff3300",  "255,51,0");

	}

	@Override
	public Colour dark() {
		return new Colour("dark red", "#991f00", "152,31,0");

	}

}
