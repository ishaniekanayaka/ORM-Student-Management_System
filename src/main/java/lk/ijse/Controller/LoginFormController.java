package lk.ijse.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private JFXButton btnLogin;

    @FXML
    private RadioButton btnRadio;

    @FXML
    private JFXButton btnRegister;

    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/View/dashboard_form.fxml"))));
        stage.setTitle("DashBoard ");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void btnRadioOnAction(ActionEvent event) {

    }

   @FXML
   void btnRegisterOnAction(ActionEvent event) {
       try {
           // Load the FXML file
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/register_form.fxml"));
           Parent root = loader.load();

           // Set up the new stage
           Stage stage = new Stage();
           Scene scene = new Scene(root);
           stage.setScene(scene);
           stage.setResizable(false);
           stage.centerOnScreen();
           stage.show();

       } catch (IOException e) {
           // Print detailed error message if FXML fails to load
           e.printStackTrace();
       } catch (NullPointerException e) {
           System.err.println("Error: FXML file path may be incorrect or the file may not exist.");
           e.printStackTrace();
       } catch (Exception e) {
           System.err.println("An unexpected error occurred: " + e.getMessage());
           e.printStackTrace();
       }
   }


    @FXML
    void txtPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void txtUserNameOnAction(ActionEvent event) {

    }

}
