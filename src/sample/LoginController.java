package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;


import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * Created by Mitchell on 9/28/2016.
 */
public class LoginController {
    @FXML
    private TextField unText;

    @FXML
    private TextField pwText;

    private Stage _dialogStage;

    /** flag to signal whether dialog was closed normally */
    private boolean _okClicked = false;

    private Main mainApplication;

    public void setMainApp(Main main) {mainApplication = main;}

    @FXML
    private void initialize() {
    }

    public void setDialogStage(Stage dialogStage) {
        _dialogStage = dialogStage;
    }

    public boolean isOkClicked() {
        return _okClicked;
    }

    @FXML
    private void handleOKPressed() {
        //First validate the data to insure it is at least reasonable
        if (isInputValid()) {
            //if the data is reasonable, then remember the the student data in the window
            System.out.println("authenticated");
            mainApplication.goToHome();
            //signal success and close this dialog window.
            _okClicked = true;
            _dialogStage.close();

        } else {
            System.out.println(unText.getText());
        }
    }

    private boolean isInputValid() {
        if (unText.getText().equals("user") && pwText.getText().equals("pass")) {
            return true;
        }
        return false;
    }
}
