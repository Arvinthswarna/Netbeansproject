/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprogram;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.ControlButton;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


import javafx.stage.Stage;

public class javafx_textfield extends Application{
    public static void main(String args[])
    {
        launch(args);
    }
    
    @Override
   public void start(Stage  primaryStage)
   {
      primaryStage.setTitle("hello world");
      Button btn=new Button();
      btn.setText("say hello world");
      btn.setOnAction(new EventHandler<ActionEvent>()
      {
          public void handle(ActiomEvent event)
          {
              System.out.print("hlo");
          }

          @Override
          public void handle(ActionEvent event) {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      });
      StackPane root =new StackPane();
      root.getChildren().add(btn);
      primaryStage.setScene(new Scene(root,300,250));
      primaryStage.show();
   }
    
}
