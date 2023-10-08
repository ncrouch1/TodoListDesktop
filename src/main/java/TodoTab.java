import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;


public class TodoTab extends Tab {
    private TabPane root;

    public TodoTab(String tabname, AnchorPane contents, TabPane root) {
        super(tabname, contents);
        this.root = root;
        Button addbtn = (Button) contents.getChildren().get(0);
        Button rmvbtn = (Button) contents.getChildren().get(1);
        Button addtabbtn = (Button) contents.getChildren().get(2);
        Button rmvtabbtn = (Button) contents.getChildren().get(3);
        TextField textArea = (TextField) contents.getChildren().get(4);
        @SuppressWarnings("unchecked")
        ListView<String> listView = (ListView<String>) contents.getChildren().get(5);

        addbtn.setOnAction(event -> {
            String text = textArea.getText().strip();
            if (!text.equals(""))
                listView.getItems().add(text);
        });

        rmvbtn.setOnAction(actionEvent -> {
            String todo = listView.getSelectionModel().getSelectedItem();
            listView.getItems().remove(todo);
        });

        addtabbtn.setOnAction(actionEvent -> {
            TodoTab tabPane = new TodoTab("TodoList", App.createNewTab(), this.root);
            this.root.getTabs().add(tabPane);
        });

        rmvtabbtn.setOnAction(ae -> {
            if (this.root.getTabs().size() > 1)
                this.root.getTabs().remove(this);
        });

    }
}
