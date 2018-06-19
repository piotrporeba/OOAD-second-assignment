package controller;

import View.View;
import abstractFactory.Green;
import abstractFactory.Red;
import javafx.event.Event;
import javafx.event.EventHandler;

public class GreenButtonController implements EventHandler{

	@Override
	public void handle(Event event) {
		View.middleGridPane.getChildren().clear();

		View.colourLabelBright.setText(new Green().bright().getName()+"  "+new Green().bright().getHexValue()+ "  "+new Green().bright().getRgbValue());
		View.colourLabelBright.setStyle("-fx-text-fill: "+new Green().bright().getHexValue()+";");

		View.colourLabelNormal.setText(new Green().normal().getName()+"  "+new Green().normal().getHexValue()+ "  "+new Green().normal().getRgbValue());
		View.colourLabelNormal.setStyle("-fx-text-fill: "+new Green().normal().getHexValue()+";");

		View.colourLabelDark.setText(new Green().dark().getName()+"  "+new Green().dark().getHexValue()+ "  "+new Green().dark().getRgbValue());
		View.colourLabelDark.setStyle("-fx-text-fill: "+new Green().dark().getHexValue()+";");


		View.middleGridPane.add(View.colourLabelBright,1,1);
        View.middleGridPane.add(View.colourLabelNormal,1,2);
        View.middleGridPane.add(View.colourLabelDark,1,3);
	}

		// TODO Auto-generated method stub

	}


