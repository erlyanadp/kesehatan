/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLKesehatanController implements Initializable {

     @FXML
    private Label label;

    @FXML
    private Label nama;

    @FXML
    private Label beratbadan;

    @FXML
    private RadioButton lakilaki;

    @FXML
    private RadioButton perempuan;

    @FXML
    private TextField tinggibadan;

    @FXML
    private Label hasil;

    @FXML
    private JFXButton buttonproses;

    @FXML
    private JFXButton buttonreset;

    @FXML
    private TextField ideal;

    @FXML
    private TextArea saran;
    @FXML
    private AnchorPane reset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
   
     @FXML
    void Proses(ActionEvent event) {
        double ti, bt, kelamin = 0;
        ti = Double.valueOf(tinggibadan.getText());
        bt = Double.valueOf(beratbadan.getText());
        
        if(lakilaki.isSelected()){
            kelamin = (ti - 110);
        } else if(perempuan.isSelected()){
            kelamin = (ti -100);
        }
        if(kelamin < bt){
            ideal.setText(""+kelamin);
            hasil.setText("Maaf "+nama.getText()+"Sepertinya anda Underwight");
            saran.setText("Lebih banyak olahraga agar berat badan anda ideal");
            
        }
        else if (kelamin > bt){
            ideal.setText(""+kelamin);
            hasil.setText("Maaf "+nama.getText()+"Sepertinya anda Overweight");
            saran.setText("Perbanyak makan tapi jangan lupa olahraga harus teratur");
        }
        else{
            ideal.setText(""+kelamin);
            hasil.setText("Maaf "+nama.getText()+"Berat badanmu ideal");
            saran.setText("jaga pola makan, dan olahraga teratur");
        }
    }
     @FXML
    void Hapus(ActionEvent event) {
        hasil.setText("");
        saran.setText("");
        ideal.setText("");
        nama.setText("");
        beratbadan.setText("");
        tinggibadan.setText("");
        lakilaki.setSelected(false);
        perempuan.setSelected(false);
    }
}
