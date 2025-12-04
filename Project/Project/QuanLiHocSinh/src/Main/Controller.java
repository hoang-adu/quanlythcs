/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Label label;
    
    @FXML
    private Button btn;
    
    public void initialize() {

    }
  
    @FXML
    private void buttonClick(){
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
    }
}
