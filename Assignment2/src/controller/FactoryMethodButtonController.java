package controller;

import View.View;
import abstractFactory.Red;
import factoryMethod.FactoryColourDesc;
import factoryMethod.FactoryMethod;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;

public class FactoryMethodButtonController implements EventHandler{

	@Override
	public void handle(Event event) {
		View.middleGridPane.getChildren().clear();


		View.factoryMethodLabel.setText(new FactoryMethod().getColour().getColourDesc());


		View.middleGridPane.add(View.factoryMethodLabel,1,1);

	}
}