package lk.ijse.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import lk.ijse.DTO.UserDTO;
import lk.ijse.bo.BOFactory;
import lk.ijse.bo.custom.UserBO;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserFormController implements Initializable {

    @FXML
    private TableView<?> UserTable;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private ComboBox<String> cmbType;

    @FXML
    private TableColumn<?, ?> colUserName;

    @FXML
    private TableColumn<?, ?> colUserPassword;

    @FXML
    private TableColumn<?, ?> colUserRole;

    @FXML
    private TableColumn<?, ?> colid;

    @FXML
    private AnchorPane rootStudent;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPassword;

    UserBO userBO = (UserBO) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.USER);

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) throws IOException {
        String userId = txtId.getText();
        String userName = txtName.getText();
        String userPassword = txtPassword.getText();
        String userRole = cmbType.getSelectionModel().getSelectedItem();

        UserDTO userDTO = new UserDTO(userId, userName, userPassword, userRole);

        boolean isSaved = userBO.saveUser(userDTO);
        if (isSaved) {
            new Alert(Alert.AlertType.INFORMATION, "User is Saved Successfully").show();

        } else {
            new Alert(Alert.AlertType.INFORMATION, "User is Saved UnSuccessfully").show();

        }
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    private void setRoleType() {
        String[] gender = {null, "Admin", "Coordinator" };
        cmbType.getItems().addAll(gender);
    }

    private void setUserID() {
        String userId = userBO.generateNewUserID();

        if (userId == null) {
            txtId.setText("U000001");
        } else {
            String[] split = userId.split("[U]");
            int lastDigits = Integer.parseInt(split[1]);
            lastDigits++;
            String newID = String.format("U%06d", lastDigits);
            txtId.setText(newID);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setUserID();
        setRoleType();
    }
}
