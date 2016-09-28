package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class WelcomeController {

    private Main mainApplication;


    public void setMainApp(Main main) {mainApplication = main;}


    @FXML
    public void onRegPressed() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("NOT IMPLEMENTED");
        alert.setHeaderText("Registration");
        alert.setContentText("Unable to Register");

        alert.showAndWait();
    }
    public void onLoginPressed() {
        mainApplication.goToLogin();
    }
}
