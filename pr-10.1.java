import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class VerticalTextApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a VBox with 15px spacing between elements
        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER); // Center the texts horizontally and vertically

        Random random = new Random();
        
        // Define the shared font: Times New Roman, Bold, Italic, 22px
        Font textFont = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);

        for (int i = 1; i <= 5; i++) {
            Text textNode = new Text("Text " + i);
            textNode.setFont(textFont);

            // Generate random color and random opacity (0.3 to 1.0)
            double red = random.nextDouble();
            double green = random.nextDouble();
            double blue = random.nextDouble();
            double opacity = 0.3 + (1.0 - 0.3) * random.nextDouble();

            textNode.setFill(new Color(red, green, blue, opacity));

            // Add the text to the VBox
            vbox.getChildren().add(textNode);
        }

        // Setup the Scene and Stage
        Scene scene = new Scene(vbox, 300, 400);
        primaryStage.setTitle("Random Colored Vertical Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}