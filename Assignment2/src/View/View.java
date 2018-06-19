package View;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

import abstractFactory.Red;
import controller.BlackButtonController;
import controller.BlueButtonController;
import controller.FactoryMethodButtonController;
import controller.GreenButtonController;
import controller.RedButtonController;
import controller.WhiteButtonController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import simpleFactory.SimpleColourFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;



public class View extends Application {



	String color="BLACK";
	public static BorderPane root;
	public static Label colourLabelBright = new Label();
	public static Label colourLabelNormal = new Label();
	public static Label colourLabelDark = new Label();
	public static Label factoryMethodLabel = new Label("before change");

	public static String backgroundColour="white";

	HBox topHBox;
	VBox leftVBox;

	public static GridPane middleGridPane= new GridPane();

	static Button simpleFactoryButton, abstractFactoryButton, factoryMethodButton, facadeButton;
	static Button simpleWhiteButton, simpleBlackButton;
	static Button redAbstractButton, greenAbstractButton, blueAbstractButton;


	//static Label nameLabel, ageLabel, descriprionLabel, urlLabel;
	//static Label track1, track2, track3, track4, track5, track6;
	//static int isMusicPlaying=-1;

//	static PlayAudio music;
	//static String currentBand;

	static Scene mainScene;



	@Override
	public void start(Stage primaryStage) {
        primaryStage.setTitle("Assignment 2");

        root = new BorderPane();

        factoryMethodLabel.setStyle("-fx-text-fill: #ff0000");



//////////// TOP BUTTONS//////////////////////////////
        topHBox = new HBox();
        simpleFactoryButton= new Button("Simple Factory");

        topHBox.setHgrow(simpleFactoryButton, Priority.ALWAYS);
        simpleFactoryButton.setId("BandButton");
        simpleFactoryButton.setPrefWidth(350);
        simpleFactoryButton.setPrefHeight(100);
        simpleFactoryButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            	simpleFactoryButton.setId("Active");
            	abstractFactoryButton.setId("BandButton");
            	factoryMethodButton.setId("BandButton");



                leftVBox.getChildren().clear();

              //  middleGridPane.getChildren().clear();
                leftVBox.getChildren().addAll(simpleWhiteButton, simpleBlackButton);


            }
        });
        abstractFactoryButton= new Button("Abstract Factory");
        topHBox.setHgrow(simpleFactoryButton, Priority.ALWAYS);
        abstractFactoryButton.setId("BandButton");
        abstractFactoryButton.setPrefWidth(350);
        abstractFactoryButton.setPrefHeight(100);
        abstractFactoryButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                simpleFactoryButton.setId("BandButton");
            	abstractFactoryButton.setId("Active");
            	factoryMethodButton.setId("BandButton");

                leftVBox.getChildren().clear();

                middleGridPane.getChildren().clear();
                leftVBox.getChildren().addAll(redAbstractButton, greenAbstractButton, blueAbstractButton);



            }
        });
        factoryMethodButton= new Button("Factory Method");
        topHBox.setHgrow(simpleFactoryButton, Priority.ALWAYS);
        factoryMethodButton.setId("BandButton");
        factoryMethodButton.setPrefWidth(350);
        factoryMethodButton.setPrefHeight(100);
        factoryMethodButton.setOnAction(new FactoryMethodButtonController());


        topHBox.getChildren().add(simpleFactoryButton);
        topHBox.getChildren().add(abstractFactoryButton);
        topHBox.getChildren().add(factoryMethodButton);

        //////////////////////////////////////////

        //*******************************************************************************

        //////// ADDING LEFT MENU BUTTONS////////////////////////////////////////////////////////////////////



        leftVBox = new VBox();

 //////////////   	SIMPLE FACTORY BUTTONS	/////////////////////////////////////

        //Label bandMenbers = new Label("Band Members");

        /*
         * MVC pattern used to push away handler into a controller class
         *
         */
        simpleWhiteButton = new Button();
        simpleWhiteButton.setText("White");
        simpleWhiteButton.setPrefWidth(150);
        simpleWhiteButton.setPrefHeight(100);
        simpleWhiteButton.setOnAction(new WhiteButtonController());

        /*
         * MVC pattern used to push away handler into a controller class
         *
         */

        simpleBlackButton = new Button();
        simpleBlackButton.setText("Black");
        simpleBlackButton.setPrefWidth(150);
        simpleBlackButton.setPrefHeight(100);
        simpleBlackButton.setOnAction(new BlackButtonController());




        //////////////Abstract factory buttons///////////////////////


        redAbstractButton = new Button();
        redAbstractButton.setText("red");
        redAbstractButton.setPrefWidth(150);
        redAbstractButton.setPrefHeight(100);
        redAbstractButton.setOnAction(new RedButtonController());

        greenAbstractButton = new Button();
        greenAbstractButton.setText("green");
        greenAbstractButton.setPrefWidth(150);
        greenAbstractButton.setPrefHeight(100);
        greenAbstractButton.setOnAction(new GreenButtonController());

        blueAbstractButton = new Button();
        blueAbstractButton.setText("blue");
        blueAbstractButton.setPrefWidth(150);
        blueAbstractButton.setPrefHeight(100);
        blueAbstractButton.setOnAction(new BlueButtonController());



        ///////////MIDDLE GRIGBOX OUTPUT/////////////////////////////////////

       //
        middleGridPane.setAlignment(Pos.TOP_CENTER);
        middleGridPane.setHgap(10);
        middleGridPane.setVgap(10);
        middleGridPane.setPadding(new Insets(25, 25, 25, 25));

        middleGridPane.add(factoryMethodLabel,1,1);
       // colourLabelBright.setText("Test");




        //middleGridPane.add(new Label(band.getSinger().getName()), 1, 1);


        root.setTop(topHBox);
        root.setLeft(leftVBox);
        root.setCenter(middleGridPane);

        mainScene = new Scene(root,1000,600);
        mainScene.getStylesheets().add("application.css");
        primaryStage.setScene(mainScene);


        primaryStage.show();
}


	public static void main(String[] args) {
		launch(args);
	}


}
