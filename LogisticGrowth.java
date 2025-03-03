import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LogisticGrowth extends Application {
    
    // Function to compute P(t) using the logistic growth formula
    public static double logisticGrowth(double P0, double k, double M, double t) {
        return (M * P0) / (P0 + (M - P0) * Math.exp(-k * M * t));
    }

    @Override
    public void start(Stage stage) {
        // Define parameters
        double P0 = 10;  // Initial population
        double k = 0.1;   // Growth rate
        double M = 100;   // Carrying capacity
        int timeSteps = 100;
        double maxTime = 50;
        
        // Create axes
        NumberAxis xAxis = new NumberAxis("Time", 0, maxTime, 5);
        NumberAxis yAxis = new NumberAxis("Population", 0, M, 10);
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Logistic Growth Model");
        
        // Create dataset
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population Growth");
        
        for (int i = 0; i <= timeSteps; i++) {
            double t = (maxTime / timeSteps) * i;
            series.getData().add(new XYChart.Data<>(t, logisticGrowth(P0, k, M, t)));
        }
        
        lineChart.getData().add(series);
        
        // Set up the scene
        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Logistic Growth Graph");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

