package factoryMethod;
import View.View;

public class FactoryMethod {


	public FactoryColourDesc getColour() {

		if (View.backgroundColour.equals("white")){ ////color of a pane that is changed by simple factory
			System.out.println("white");
			return new White();
		}
		else if(View.backgroundColour.equals("black")){ //color of a pane that is changed by simple factory
			System.out.println("black");
			return new Black();
		}
		else{
			System.out.println("white");
			return new White();

		}
		// TODO Auto-generated method stub

	}

}
