package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import lk.ijse.util.timeDate.TimeDate;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardFormController implements Initializable {

    @FXML
    private Label lblDate;

    @FXML
    private Label lblTime;


    @FXML
    void btnPaymentOnAction(ActionEvent event) {

    }

    @FXML
    void btnProgrammeOnAction(ActionEvent event) {

    }

    @FXML
    void btnStudentOnAction(ActionEvent event) {

    }

    @FXML
    void btnUserOnAction(ActionEvent event) {

    }

    public void btnLogoutOnAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TimeDate.localDateAndTime(lblDate,lblTime);
    }
}
