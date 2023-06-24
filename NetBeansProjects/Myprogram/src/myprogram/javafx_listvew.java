/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprogram;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class javafx_listvew extends Application {
    public static void main(String args[])
    {
        launch(args);
    }
    @Override

    /**
     *
     * @param primaryStage
     */
    public void start(Stage primaryStage)
    {
        ListView listview =new ListView();
        listview.getItems().add("reading");
        listview.getItems().add("sports");
        listview.getItems().add("music");
        VBox hb=new VBox();
        hb.getChildren().addAll(listview);
        Scene scene =new Scene(hb,400,567);
        primaryStagee.setTitle("ex of checkbox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
