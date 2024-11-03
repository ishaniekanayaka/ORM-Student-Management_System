package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class launcher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setTitle("Culinary Academy");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
