import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Information extends Application {

    @Override
    public void start(Stage stage) {

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label genderLabel = new Label("Gender:");
        RadioButton maleRB = new RadioButton("Male");
        RadioButton femaleRB = new RadioButton("Female");

        ToggleGroup genderGroup = new ToggleGroup();
        maleRB.setToggleGroup(genderGroup);
        femaleRB.setToggleGroup(genderGroup);

        Label deptLabel = new Label("Department:");
        ComboBox<String> deptBox = new ComboBox<>();
        deptBox.getItems().addAll("CSE", "ECE", "EEE", "IT", "Mechanical");

        Button submitBtn = new Button("Submit");

        TextArea outputArea = new TextArea();
        outputArea.setEditable(false);

        submitBtn.setOnAction(e -> {
            String name = nameField.getText();

            RadioButton selectedGender = (RadioButton) genderGroup.getSelectedToggle();
            String gender = (selectedGender != null) ? selectedGender.getText() : "Not Selected";

            String dept = deptBox.getValue() != null ? deptBox.getValue() : "Not Selected";

            String result = "Student Information:\n"
                    + "Name: " + name + "\n"
                    + "Gender: " + gender + "\n"
                    + "Department: " + dept + "\n";

            outputArea.setText(result);
        });
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        root.getChildren().addAll(
                nameLabel, nameField,
                genderLabel, maleRB, femaleRB,
                deptLabel, deptBox,
                submitBtn,
                outputArea
        );

        Scene scene = new Scene(root, 350, 350);

        stage.setTitle("Student Form - JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
