/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.gui;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author majdiabdelkrim
 */
public class inter extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        try{
        Parent root = FXMLLoader.load(getClass().getResource("Ajouter.fxml"));
        
        Scene scene = new Scene(root );
        
        primaryStage.setTitle("Ajouter Reclamation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }catch (IOException ex){
            System.out.println(ex.getMessage());
    } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
