/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprogram;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import static javafx.application.Application.launch;



/**
 *
 * @author swarn_7fnn1li
 */
public class Myprogram extends Application {

    
    
   
    public void start(Stage primaryStage)
    {
        TextField tx=new TextField();
        Button btn=new Button();
        btn.setText("clickme");
        //System.out.print("hi");
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                tx.setText("welcome to oop class ");
                System.out.print("hi");
            }
        });
        VBox hb=new VBox();
        hb.getChildren().addAll(tx);
        hb.getChildren().addAll(btn);
        Scene scene =new Scene(hb,400,250);
        primaryStage.setTitle("textbox eg");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        public static void main(String args[])
        {
            
        launch(args);
   
        }
        
    
    
    
}
