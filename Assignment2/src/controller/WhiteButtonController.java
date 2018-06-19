package controller;

import View.View;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import simpleFactory.SimpleColourFactory;

public class WhiteButtonController implements EventHandler{



	@Override
	public void handle(Event event) {

		// TODO Auto-generated method stub
		View.root.setStyle("-fx-background-color: "+new SimpleColourFactory().getColour("white").getHex()+";");
		View.backgroundColour="white";
    }

}
