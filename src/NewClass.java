
import edu.esprit.pi.entities.Reclamation;
import edu.esprit.pi.services.ServiceReclamation;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author majdiabdelkrim
 */
public class NewClass {
    public static void main(String[] args) {
    
    ServiceReclamation service = new ServiceReclamation();
    Reclamation reclamation = new Reclamation("Ab", "Majd", "79333712", "majdi.abdelkrim@esprit.tn", "probleme technique", "aaaaaaaa");
   service.ajouter(reclamation);
    //Reclamation recl = new Reclamation();
        //recl.setId_reclamation(1); 
        //recl.setPrenom("mmmmmmmm");
        //recl.setNom("bbbb");
        //recl.setNum(12356789);
        //recl.setEmail("ssss");
        //recl.setType("q");
        //recl.setDescription("tttttttt");

        
        //service.modifier(recl);
      //  service.supprimer(4);
        // List<Reclamation> reclamations = service.getAll(recl);
    
   // for(Reclamation r : reclamations){
            //System.out.println("ID Réclamation: " + r.getId_reclamation());
            //System.out.println("Prénom: " + r.getPrenom());
            //System.out.println("Nom: " + r.getNom());
            //System.out.println("Num: " + r.getNum());
            //System.out.println("Email: " + r.getEmail());
            //System.out.println("Type: " + r.getType());
            //System.out.println("Description: " + r.getDescription());
             
            
     //   }
        
    }}


