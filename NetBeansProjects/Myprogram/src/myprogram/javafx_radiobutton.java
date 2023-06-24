/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprogram;
import javafx.application.Application;
import static javafx.application.Application.Launch;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javafx_radiobutton extends Application{
    @Override
    public void start(Stage primaryStage)
    {
        ToggleGroup g=new ToggleGroup();
        RadioButton b1=new RadioButton("male");
        RadioButton b2=new RadioButton("female");
        b1.setToggleGroup(g);
        b2.setToggleGroup(g);
        VBox hb=new VBox();
        hb.getChildren().addAll(b1,b2);
        Scene 
    }
    
}
