import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GradeBarChart extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        
        // Configuration constants
        double chartHeight = 300; // Base line for the bottom of the bars
        double barWidth = 80;
        double spacing = 40;
        double startX = 50;
        double scaleFactor = 5; // Multiplier to make 1% = 5 pixels high

        // Data arrays: Name, Percentage, Color
        String[] labels = {"Projects", "Quizzes", "Midterm Exams", "Final Exam"};
        int[] percentages = {20, 10, 30, 40};
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

        for (int i = 0; i < labels.length; i++) {
            double h = percentages[i] * scaleFactor; // Proportional height
            double x = startX + i * (barWidth + spacing);
            double y = chartHeight - h; // Subtract height from base to grow upwards

            // 1. Create the Bar (Rectangle)
            Rectangle bar = new Rectangle(x, y, barWidth, h);
            bar.setFill(colors[i]);
            bar.setStroke(Color.BLACK);

            // 2. Create the Label (Text)
            Text label = new Text(x, chartHeight + 20, labels[i] + " - " + percentages[i] + "%");

            // Add elements to the pane
            root.getChildren().addAll(bar, label);
        }

        Scene scene = new Scene(root, 550, 400);
        primaryStage.setTitle("Grade Distribution Bar Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}