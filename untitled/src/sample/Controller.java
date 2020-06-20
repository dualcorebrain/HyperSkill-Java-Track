package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Who is the squeeker?");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Not Octosniper!");

            }

        });


        Button exit = new Button("Exit");
        exit.setOnAction(e -> System.exit(0));



        StackPane root = new StackPane();
        root.getChildren().addAll(btn, exit);

        Scene scene = new Scene(root,500,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("For Octosniper");

        primaryStage.show();


    }
}


