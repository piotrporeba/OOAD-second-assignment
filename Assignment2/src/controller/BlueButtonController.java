package controller;

import View.View;
import abstractFactory.Blue;
import abstractFactory.Red;
import javafx.event.Event;
import javafx.event.EventHandler;

public class BlueButtonController implements EventHandler{

	@Override
	public void handle(Event event) {
		View.middleGridPane.getChildren().clear();

		View.colourLabelBright.setText(new Blue().bright().getName()+"  "+new Blue().bright().getHexValue()+ "  "+new Blue().bright().getRgbValue());
		View.colourLabelBright.setStyle("-fx-text-fill: "+new Blue().bright().getHexValue()+";");

		View.colourLabelNormal.setText(new Blue().normal().getName()+"  "+new Blue().normal().getHexValue()+ "  "+new Blue().normal().getRgbValue());
		View.colourLabelNormal.setStyle("-fx-text-fill: "+new Blue().normal().getHexValue()+";");

		View.colourLabelDark.setText(new Blue().dark().getName()+"  "+new Blue().dark().getHexValue()+ "  "+new Blue().dark().getRgbValue());
		View.colourLabelDark.setStyle("-fx-text-fill: "+new Blue().dark().getHexValue()+";");


		View.middleGridPane.add(View.colourLabelBright,1,1);
        View.middleGridPane.add(View.colourLabelNormal,1,2);
        View.middleGridPane.add(View.colourLabelDark,1,3);
	}
}