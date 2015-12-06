package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader MainPage = new FXMLLoader(getClass().getResource("sample.fxml")) ;
        Parent root = MainPage.load() ;
        Controller controller =  MainPage.getController() ;
        primaryStage.setTitle("Battle");
        primaryStage.setScene(new Scene(root, 388, 289));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
