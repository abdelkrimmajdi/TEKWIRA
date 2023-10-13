/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.gui;

import edu.esprit.pi.entities.Reclamation;
import edu.esprit.pi.services.ServiceReclamation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author majdiabdelkrim
 */
public class AjouterController implements Initializable {

    @FXML
    private TextField txtprenom;
    @FXML
    private TextField txtnom;
    @FXML
    private TextField txtnumero;
    @FXML
    private TextField txtemail;
    @FXML
    private TextField txttype;
    @FXML
    private TextField txtdescription;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouter(ActionEvent event) {
        String prenom=txtprenom.getText();
         String nom=txtnom.getText();
          String numero=txtnumero.getText();
           String email=txtemail.getText();
            String type=txttype.getText();
             String description=txtdescription.getText();
             ServiceReclamation sr= new ServiceReclamation(); 
             Reclamation r = new Reclamation(prenom,nom,numero,email,type,description);
             sr.ajouter(r);
    }   
}
