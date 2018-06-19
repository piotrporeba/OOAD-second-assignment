package controller;

import View.View;
import abstractFactory.AbstractColourFactory;
import abstractFactory.Colour;
import abstractFactory.Red;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;

public class RedButtonController implements EventHandler{

	@Override
	public void handle(Event event) {
		View.middleGridPane.getChildren().clear();

		View.colourLabelBright.setText(new Red().bright().getName()+"  "+new Red().bright().getHexValue()+ "  "+new Red().bright().getRgbValue());
		View.colourLabelBright.setStyle("-fx-text-fill: "+new Red().bright().getHexValue()+";");

		View.colourLabelNormal.setText(new Red().normal().getName()+"  "+new Red().normal().getHexValue()+ "  "+new Red().normal().getRgbValue());
		View.colourLabelNormal.setStyle("-fx-text-fill: "+new Red().normal().getHexValue()+";");

		View.colourLabelDark.setText(new Red().dark().getName()+"  "+new Red().dark().getHexValue()+ "  "+new Red().dark().getRgbValue());
		View.colourLabelDark.setStyle("-fx-text-fill: "+new Red().dark().getHexValue()+";");


		View.middleGridPane.add(View.colourLabelBright,1,1);
        View.middleGridPane.add(View.colourLabelNormal,1,2);
        View.middleGridPane.add(View.colourLabelDark,1,3);
	}


}
