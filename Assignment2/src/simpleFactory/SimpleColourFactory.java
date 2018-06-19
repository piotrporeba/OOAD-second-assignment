package simpleFactory;

public class SimpleColourFactory {

	public SimpleColour getColour(String colour){
		if (colour.equals("white")){
			return new SimpleWhite();
		}
		else if(colour.equals("black")){
			return new SimpleBlack();
		}
		return null;
	}

}
