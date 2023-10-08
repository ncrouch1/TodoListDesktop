import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    private List<Todo> todoList;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        todoList = new ArrayList<>();
        primaryStage.setTitle("JavaTodoList");
        TextField textField = new TextField("Todo Rank");
        textField.setTooltip(new Tooltip("Enter a Todo and a Rank!"));
        Button btn = new Button();
        btn.setText("AddTodo");
        btn.setLayoutX(150);
        btn.setLayoutY(125);
        textField.setLayoutX(150);
        textField.setLayoutY(150);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String text = textField.getText();
                String[] parts = text.split(" ");
                String todo = parts[0];
                int rank = 1;
                try {
                    rank = Integer.parseInt(parts[1]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                todoList.add(
                        new Todo(
                                parts[0],
                                rank
                        )
                );
                System.out.println(todoList.toString());
            }
        });

        Pane root = new Pane();
        root.getChildren().add(btn);
        root.getChildren().add(textField);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
