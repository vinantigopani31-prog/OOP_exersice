import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Registration Form");

        // Create GridPane layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Add Labels and TextFields
        grid.add(new Label("Roll No:"), 0, 0);
        TextField rollField = new TextField();
        grid.add(rollField, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        TextField nameField = new TextField();
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        TextField ageField = new TextField();
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        TextField emailField = new TextField();
        grid.add(emailField, 1, 3);

        // Submit Button
        Button btn = new Button("Submit");
        grid.add(btn, 1, 4);

        btn.setOnAction(e -> {
            String roll = rollField.getText();
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();

            // Validation logic
            String errorMessage = validateInputs(roll, age, email);

            if (errorMessage == null) {
                // Success: Show confirmation Alert
                String successMsg = "Registration Successful!\n" +
                        "Roll No: " + roll + "\nName: " + name + 
                        "\nAge: " + age + "\nEmail: " + email;
                showAlert(Alert.AlertType.INFORMATION, "Success", successMsg);
                
                // Save to File using FileChooser and BufferedWriter
                saveToFile(primaryStage, successMsg);
            } else {
                // Failure: Show error Alert
                showAlert(Alert.AlertType.ERROR, "Validation Error", errorMessage);
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String validateInputs(String roll, String age, String email) {
        try {
            Integer.parseInt(roll); // Check if RollNo is integer
        } catch (NumberFormatException e) {
            return "Roll Number must be an integer.";
        }

        try {
            Integer.parseInt(age); // Check if Age is integer
        } catch (NumberFormatException e) {
            return "Age must be an integer.";
        }

        // Basic Email Check: contains '@' and '.'
        if (!email.contains("@") || !email.contains(".")) {
            return "Email must contain '@' and '.' characters.";
        }

        return null; // No errors
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void saveToFile(Stage stage, String data) {
        FileChooser fileChooser = new FileChooser(); //
        fileChooser.setTitle("Save Registration Data");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(data);
            } catch (IOException ex) {
                showAlert(Alert.AlertType.ERROR, "File Error", "Could not save file.");
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}