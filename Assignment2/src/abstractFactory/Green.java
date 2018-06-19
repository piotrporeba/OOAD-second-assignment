package abstractFactory;



public class Green extends AbstractColourFactory{

	@Override
	public Colour bright() {
			return new Colour("bright green", "#66ff66", "102,255,102");

	}

	@Override
	public Colour normal() {
		return new Colour("normal green", "#00cc00",  "0,204,0");

	}

	@Override
	public Colour dark() {
		return new Colour("dark green", "#009900", "0,153,0");

	}


}
