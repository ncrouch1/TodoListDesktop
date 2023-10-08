import javafx.scene.control.TabPane;

public class MyTabPane extends TabPane {

    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public void resize(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }
}
