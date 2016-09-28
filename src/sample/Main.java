package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private BorderPane rootLayout;

    private Stage mainScreen;

    @Override
    public void start(Stage primaryStage) {
        mainScreen = primaryStage;
        initRootLayout(mainScreen);
    }

    private void initRootLayout(Stage mainScreen) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("WelcomeScreen.fxml"));
            rootLayout = loader.load();

            // Give the controller access to the main app.
            WelcomeController controller = loader.getController();
            controller.setMainApp(this);

            // Set the Main App title
            mainScreen.setTitle("Course Registration");

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            mainScreen.setScene(scene);
            mainScreen.show();


        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void goToLogin() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("LoginScreen.fxml"));
            BorderPane page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("LOGIN");
            dialogStage.initOwner(mainScreen);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            LoginController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setMainApp(this);
            dialogStage.showAndWait();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public void goToHome() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("HomeScreen.fxml"));
            BorderPane page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("LOGIN");
            dialogStage.initOwner(mainScreen);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            HomeController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setMainApp(this);
            dialogStage.showAndWait();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
