import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MyTabPane root = new MyTabPane();
        root.setPrefSize(400, 265);
        root.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        TodoTab todoTab = new TodoTab("Todos", createNewTab(), root);
        root.getTabs().add(todoTab);
        primaryStage.setScene(new Scene(root, 400, 265));
        primaryStage.show();
    }

    public static AnchorPane createNewTab() {
        AnchorPane pane = new AnchorPane();
        pane.setPrefSize(400, 265);
        pane.setMinSize(0,0);
        pane.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);

        Button addbtn = new Button("Add Todo");
        addbtn.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        addbtn.setLayoutX(213);
        addbtn.setLayoutY(191);
        addbtn.setMnemonicParsing(false);

        Button rmvbtn = new Button("Remove Todo");
        rmvbtn.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        rmvbtn.setLayoutX(292);
        rmvbtn.setLayoutY(191);
        rmvbtn.setMnemonicParsing(false);

        Button addtabbtn = new Button("New Todo List");
        addtabbtn.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        addtabbtn.setLayoutX(330);
        addtabbtn.setLayoutY(19);
        addtabbtn.setMnemonicParsing(false);
        addtabbtn.setPrefSize(56, 74);
        addtabbtn.setTextAlignment(TextAlignment.CENTER);
        addtabbtn.setWrapText(true);

        Button rmvtabbtn = new Button("Delete Todo List");
        rmvtabbtn.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        rmvtabbtn.setLayoutX(330);
        rmvtabbtn.setLayoutY(107);
        rmvtabbtn.setMnemonicParsing(false);
        rmvtabbtn.setPrefSize(56,74);
        rmvtabbtn.setTextAlignment(TextAlignment.CENTER);
        rmvtabbtn.setWrapText(true);

        TextField textField = new TextField();
        textField.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        textField.setTooltip(new Tooltip("Type a Todo then click the Add Todo Button!"));
        textField.setLayoutX(25);
        textField.setLayoutY(191);
        textField.setPrefSize(178, 25);

        ListView<String> listView = new ListView<>();
        listView.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        listView.setLayoutX(26);
        listView.setLayoutY(18);
        listView.setPrefSize(292, 163);

        pane.getChildren().add(addbtn);
        pane.getChildren().add(rmvbtn);
        pane.getChildren().add(addtabbtn);
        pane.getChildren().add(rmvtabbtn);
        pane.getChildren().add(textField);
        pane.getChildren().add(listView);
        return pane;
    }
}
