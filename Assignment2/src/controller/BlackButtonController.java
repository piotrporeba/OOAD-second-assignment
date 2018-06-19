package controller;

import View.View;
import javafx.event.Event;
import javafx.event.EventHandler;
import simpleFactory.SimpleColourFactory;

public class BlackButtonController implements EventHandler{



	@Override
	public void handle(Event event) {
		// TODO Auto-generated method stub
		View.root.setStyle("-fx-background-color: "+new SimpleColourFactory().getColour("black").getHex()+";");
		View.backgroundColour="black";
    }
}
