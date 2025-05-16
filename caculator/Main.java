/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package caculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author truon
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Parent root = FXMLLoader.load(getClass().getResource("GUI/Main.fxml"));
        
        primaryStage.setTitle("Caculator-v1.0.0");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
