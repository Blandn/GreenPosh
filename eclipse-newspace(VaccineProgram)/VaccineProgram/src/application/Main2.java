package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main2 extends Application {
public static void main(String[] args) {
launch(args);
}

@Override
public void start(Stage primaryStage) throws FileNotFoundException {
primaryStage.setTitle("");
    Group root = new Group();
    Scene scene = new Scene(root, 866, 670, Color.WHITESMOKE);

    //***********************TEXT*********************************
    
    Text titleText = new Text("GreenPosh");
    titleText.setFont(Font.font ("Arial Rounded MT Bold", 30));
    titleText.setFill(Color.WHITESMOKE);
    
    /**
    Text illness1Text = new Text("illness1Text");
    illness1Text.setFont(Font.font ("System", 20));
    illness1Text.setUnderline(true);
    
    Text illness2Text = new Text("illness2Text");
    illness2Text.setFont(Font.font ("System", 20));
    illness2Text.setUnderline(true);
    
    Text illness3Text = new Text("illness3Text");
    illness3Text.setFont(Font.font ("System", 20));
    illness3Text.setUnderline(true);
    
    Text illness4Text = new Text("illness4Text");
    illness4Text.setFont(Font.font ("System", 20));
    illness4Text.setUnderline(true);
    
    Button homeButton = new Button();
    homeButton.setMinWidth(18);
    homeButton.setMinHeight(18);
    homeButton.setPrefWidth(18);
    homeButton.setPrefHeight(18);
    homeButton.setStyle("-fx-background-color: WHITESMOKE;");
    homeButton.setTranslateX(660);
    
    Text illness1Sum = new Text("illness1Sum");
    illness1Sum.setFont(Font.font ("System", 12));
    illness1Sum.wrappingWidthProperty().set(500);
   
    
    Text illness2Sum = new Text("illness2Sum");
    illness2Sum.setFont(Font.font ("System", 12));
    illness2Sum.wrappingWidthProperty().set(500);
    
    Text illness3Sum = new Text("illness3Sum");
    illness3Sum.setFont(Font.font ("System", 12));
    illness3Sum.wrappingWidthProperty().set(500);
    
    Text illness4Sum = new Text("illness4Sum");
    illness4Sum.setFont(Font.font ("System", 12));
    illness4Sum.wrappingWidthProperty().set(500);

    Text ill1Rarity = new Text("IllnessRarity");
    ill1Rarity.setFont(Font.font ("System", 16));
    ill1Rarity.setTranslateY(10);
    ill1Rarity.setTranslateX(28);
    
    Text ill2Rarity = new Text("Common");
    ill2Rarity.setFont(Font.font ("System", 16));
    ill2Rarity.setTranslateY(10);
    ill2Rarity.setTranslateX(28);
    
    Text ill3Rarity = new Text("Uncommon");
    ill3Rarity.setFont(Font.font ("System", 16));
    ill3Rarity.setTranslateY(10);
    ill3Rarity.setTranslateX(28);
    
    Text ill4Rarity = new Text("Very Rare");
    ill4Rarity.setFont(Font.font ("System", 16));
    ill4Rarity.setTranslateY(10);
    ill4Rarity.setTranslateX(28);
    
    Text ill1Acc = new Text("00");
    ill1Acc.setFont(Font.font ("System", 56));
    ill1Acc.setTranslateY(15);
    ill1Acc.setTranslateX(40);
    ill1Acc.setFill(Color.TURQUOISE);
    
    Text ill2Acc = new Text("00");
    ill2Acc.setFont(Font.font ("System", 56));
    ill2Acc.setTranslateY(15);
    ill2Acc.setTranslateX(40);
    ill2Acc.setFill(Color.TURQUOISE);
    
    Text ill3Acc = new Text("00");
    ill3Acc.setFont(Font.font ("System", 56));
    ill3Acc.setTranslateY(15);
    ill3Acc.setTranslateX(40);
    ill3Acc.setFill(Color.TURQUOISE);
    
    Text ill4Acc = new Text("00");
    ill4Acc.setFont(Font.font ("System", 56));
    ill4Acc.setTranslateY(15);
    ill4Acc.setTranslateX(40);
    ill4Acc.setFill(Color.TURQUOISE);
    **/
    
   
//***********************Hbox*********************************

    HBox hbox1 = new HBox();
    hbox1.setPadding(new Insets(10, 10, 10, 10));
    hbox1.setPrefWidth(866);
    hbox1.setPrefHeight(110);
    hbox1.setStyle("-fx-background-color: #26b126;");
    hbox1.getChildren().add(titleText);
    //hbox1.getChildren().add(homeButton);
    
    HBox hbox2 = new HBox();
    hbox2.setPadding(new Insets(10, 10, 10, 10));
    hbox2.setPrefWidth(546);
    hbox2.setPrefHeight(140);
    hbox2.setTranslateX(90);
    hbox2.setTranslateY(110);
   // hbox2.getChildren().add(illness1Text);
    
    
    HBox hbox2Addition = new HBox();
    hbox2Addition.setPadding(new Insets(5, 10, 10, 10));
    hbox2Addition.setPrefWidth(546);
    hbox2Addition.setPrefHeight(110);
    hbox2Addition.setTranslateX(90);
    hbox2Addition.setTranslateY(140);
    //hbox2Addition.getChildren().add(illness1Sum);

    
    HBox hbox3 = new HBox();
    hbox3.setPadding(new Insets(10, 10, 10, 10));
    hbox3.setPrefWidth(546);
    hbox3.setPrefHeight(140);
    hbox3.setTranslateX(90);
    hbox3.setTranslateY(250);
    //hbox3.getChildren().add(illness2Text);
    
    HBox hbox3Addition = new HBox();
    hbox3Addition.setPadding(new Insets(5, 10, 10, 10));
    hbox3Addition.setPrefWidth(546);
    hbox3Addition.setPrefHeight(110);
    hbox3Addition.setTranslateX(90);
    hbox3Addition.setTranslateY(280);
    //hbox3Addition.getChildren().add(illness2Sum);
    
    HBox hbox4 = new HBox();
    hbox4.setPadding(new Insets(10, 10, 10, 10));
    hbox4.setPrefWidth(546);
    hbox4.setPrefHeight(140);
    hbox4.setTranslateX(90);
    hbox4.setTranslateY(390);
    //hbox4.getChildren().add(illness3Text);
    //hbox4.getChildren().add(illness3Sum);
    
    HBox hbox4Addition = new HBox();
    hbox4Addition.setPadding(new Insets(5, 10, 10, 10));
    hbox4Addition.setPrefWidth(546);
    hbox4Addition.setPrefHeight(110);
    hbox4Addition.setTranslateX(90);
    hbox4Addition.setTranslateY(420);
    //hbox4Addition.getChildren().add(illness3Sum);
    
    HBox hbox5 = new HBox();
    hbox5.setPadding(new Insets(10, 10, 10, 10));
    hbox5.setPrefWidth(546);
    hbox5.setPrefHeight(140);
    hbox5.setTranslateX(90);
    hbox5.setTranslateY(530);
    //hbox5.getChildren().add(illness4Text);
    
    HBox hbox5Addition = new HBox();
    hbox5Addition.setPadding(new Insets(5, 10, 10, 10));
    hbox5Addition.setPrefWidth(546);
    hbox5Addition.setPrefHeight(110);
    hbox5Addition.setTranslateX(90);
    hbox5Addition.setTranslateY(560);
    //hbox5Addition.getChildren().add(illness4Sum);

   //*******************VBox**********************
    
    VBox vbox1 = new VBox();
    vbox1.setPrefWidth(90);
    vbox1.setPrefHeight(670);
    vbox1.setStyle("-fx-background-color: DIMGREY;");
    
    VBox vbox2 = new VBox();
    vbox2.setPrefWidth(90);
    vbox2.setPrefHeight(670);
    vbox2.setStyle("-fx-background-color: DIMGREY;");
    vbox2.setTranslateX(780);

 //***********************Rectangle**********************************
    Rectangle rec1 = new Rectangle();
    rec1.prefWidth(90);
    rec1.prefHeight(670);
    rec1.setStyle("-fx-background-color: BLUE;");
    
//***********************getChildren*********************************

    root.getChildren().add(hbox2);
    root.getChildren().add(hbox2Addition);
    root.getChildren().add(hbox3);
    root.getChildren().add(hbox3Addition);
    root.getChildren().add(hbox4);
    root.getChildren().add(hbox4Addition);
    root.getChildren().add(hbox5);
    root.getChildren().add(hbox5Addition);
    //root.getChildren().add(vbox3);
    //root.getChildren().add(vbox4);
    //root.getChildren().add(vbox5);
    //root.getChildren().add(vbox6);

    root.getChildren().add(vbox1);
    root.getChildren().add(vbox2);
    root.getChildren().add(hbox1);
    primaryStage.setScene(scene);
    primaryStage.show();
}
}
