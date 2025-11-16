import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Choicebox extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Select a color");
        ChoiceBox<String> colorBox = new ChoiceBox<>();
        colorBox.getItems().addAll("Red", "Green", "Blue", "Yellow", "Orange");
        colorBox.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                label.setText("Selected Color: " + newVal);
            }
        });

        VBox root = new VBox(10, colorBox, label);
        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("ChoiceBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
